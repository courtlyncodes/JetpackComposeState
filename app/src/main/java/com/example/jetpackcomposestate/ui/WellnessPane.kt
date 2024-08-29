package com.example.jetpackcomposestate.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.jetpackcomposestate.ui.viewmodels.WellnessViewModel

@Composable
fun WellnessPane(modifier: Modifier = Modifier, wellnessViewModel: WellnessViewModel = viewModel()) {
    Column(modifier = modifier) {
        StatefulCounter()
        WellnessTasksList(
            list = wellnessViewModel.tasks,
            onCheckedTask = { task, checked -> wellnessViewModel.changeTaskChecked(task, checked) },
            onCloseTask = { task -> wellnessViewModel.removeTask(task) })
    }
}
package com.example.jetpackcomposestate.data

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import android.content.Context
import com.example.jetpackcomposestate.R

fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }
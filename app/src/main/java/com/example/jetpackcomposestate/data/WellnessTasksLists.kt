package com.example.jetpackcomposestate.data

fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }
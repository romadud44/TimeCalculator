package com.example.timecalculator

interface Operation {
    fun convertTimeToSeconds(inputString: String): Int

    fun sum(inputObjOne: String, inputObjTwo: String): Int

    fun dif(inputObjOne: String, inputObjTwo: String): Int
}
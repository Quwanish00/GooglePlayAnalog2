package com.example.googleplayanalog

import androidx.annotation.DrawableRes

data class Reklama(
    val id :Int,
    val rek_text1:String,
    @DrawableRes val rek_image:Int,
    val rek_text: String
)

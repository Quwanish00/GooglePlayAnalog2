package com.example.googleplayanalog

import androidx.annotation.DrawableRes

data class Game(
  val id :Int,
  @DrawableRes val image :Int,
  @DrawableRes val icon :Int,
  val name :String
)

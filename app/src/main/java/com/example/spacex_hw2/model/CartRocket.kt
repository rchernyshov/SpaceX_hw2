package com.example.spacex_hw2.model

import java.util.Date

data class CartRocket(
    val imageId : Int,
    val typeOfReadiness : String,
    val name : String,
    val codeName : String?,
    val date: String?,
    val imageActiveId: Int?,
    val textActive: String?
)

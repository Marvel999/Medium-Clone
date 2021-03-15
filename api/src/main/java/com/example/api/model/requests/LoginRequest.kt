package com.example.api.model.requests


import com.example.api.model.entity.UserLoginRequest
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LoginRequest(
    @Json(name = "user")
    val userLoginRequest: UserLoginRequest
)
package com.example.api.model.requests


import com.example.api.model.entity.UserCred
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UserRequests(
    @Json(name = "user")
    val user: UserCred
)
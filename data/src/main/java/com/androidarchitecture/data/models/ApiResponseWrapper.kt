package com.androidarchitecture.data.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

// TODO : change this data structure based in the error response being sent by the api team
@Serializable
data class ApiResponseWrapper<out T>(
    @SerialName("status") val status: Boolean,
    @SerialName("data") val data: T? = null,
    @SerialName("error") val error: String = "",
    @SerialName("message") val message: String = ""
)

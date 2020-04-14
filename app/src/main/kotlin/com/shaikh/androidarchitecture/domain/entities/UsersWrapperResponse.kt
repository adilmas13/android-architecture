package com.shaikh.androidarchitecture.domain.entities

import com.google.gson.annotations.SerializedName
import com.shaikh.androidarchitecture.presentation.model.Users

data class UsersWrapperResponse(
    @SerializedName("data") val users: List<UsersResponse>
)

data class UsersResponse(
    @SerializedName("id") val id: Int,
    @SerializedName("email") val email: String,
    @SerializedName("first_name") val first_name: String,
    @SerializedName("last_name") val last_name: String,
    @SerializedName("avatar") val avatar: String
) {
    fun toUser() = Users(
        id,
        "$first_name $last_name",
        avatar
    )
}

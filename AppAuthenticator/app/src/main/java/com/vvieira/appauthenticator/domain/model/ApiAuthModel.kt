package com.vvieira.appauthenticator.domain.model

import com.google.gson.annotations.SerializedName

data class LoginModelRequest(
    @SerializedName("email") val email: String,
    @SerializedName("password") val password: String,
    @SerializedName("id_token") val id_token: String = "",//maybe facebook or google login.
    @SerializedName("biometric_data") val biometric_data: String = ""
)

data class LoginResponseOk(
    @SerializedName("access_token") val token: String
)

data class LoginResponseError(
    @SerializedName("detail") val error: String
)

data class RegisterModelRequest(
    @SerializedName("email") val email: String,
    @SerializedName("password") val password: String,
    @SerializedName("facebook_id") val facebook_id: String = "",
    @SerializedName("google_sub") val gmail_id: String = "",
    @SerializedName("biometric_data") val biometric_data: String = "",//maybe facebook or google login.
    @SerializedName("nome") val name: String = "",
    @SerializedName("documento") val document: String = "",//cpf or cnpj
    @SerializedName("data_nascimento") val data_nascimento: String = "",
    @SerializedName("data_criacao") val data_criacao: String = "",//para evitar divergencias, melhor so passar vazio e a api gera que hora que cadastrar
    @SerializedName("telefone") val telefone: String = ""
)

data class RegisterResponseOk(
    @SerializedName("message") val message: String
)

data class RegisterResponseError(
    @SerializedName("detail") val error: String
)

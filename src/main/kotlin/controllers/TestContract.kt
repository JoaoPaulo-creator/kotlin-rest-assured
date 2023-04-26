package controllers

import io.restassured.response.Response

interface TesteContract {
    fun getPrice(pairs: String): Response
}
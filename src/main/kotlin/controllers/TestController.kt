package controllers

import endpoints.Endpoints.Companion.requestUrl
import io.restassured.RestAssured.given
import io.restassured.http.ContentType
import io.restassured.response.Response

class TestController : TesteContract {
    override fun getPrice(pairs: String): Response {
        return given().contentType(ContentType.JSON)
            .pathParam("pairs", pairs)
            .`when`()
            .get(requestUrl)
    }
}
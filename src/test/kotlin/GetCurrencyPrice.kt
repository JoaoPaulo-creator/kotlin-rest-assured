import controllers.TestController
import io.restassured.response.Response
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test

class GetCurrencyPrice {
    @Test
    fun shouldGetCurrencyPrice(){
        val price = TestController()

        val response: Response = price.getPrice("USD-BRL")
        assertThat(response.statusCode, equalTo(200))
    }
}
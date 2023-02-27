import createRequest.ForecastInCurrentCity;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import io.restassured.response.*;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class NegativeTestSteps {
    private ForecastInCurrentCity forecastInCurrentCity;
    private ValidatableResponse response;

    @Когда("^мы запрашиваем данные о погоде в городе Москва по некорректному адресу, где query=M$")
    public void getForecastInMoscowByIncorrectURLMethod615() {
        response = forecastInCurrentCity.getForecastInMoscowByIncorrectURL615();
    }

    @Тогда("^нам приходит код ответа \"(\\d+)\"$")
    public void validateResponseStatusCode(int expectedStatusCode) {
        int actualStatusCode = response.extract().path("error.code");
        assertEquals("Ожидается код ответа " + expectedStatusCode, expectedStatusCode, actualStatusCode);
    }

    @Когда("^мы запрашиваем данные о погоде в городе Москва по некорректному адресу, где нет параметра query$")
    public void getForecastInMoscowByIncorrectURLMethod601() {
        response = forecastInCurrentCity.getForecastInMoscowByIncorrectURL601();
    }

    @Когда("^мы запрашиваем данные о погоде в городе Москва по некорректному адресу, где нет параметра access_key$")
    public void getForecastInMoscowByIncorrectURLMethod101() {
        response = forecastInCurrentCity.getForecastInMoscowByIncorrectURL101();
    }

    @Когда("^мы запрашиваем данные о погоде в городе Москва по некорректному адресу, где введено некорректное значение параметра units$")
    public void getForecastInMoscowByIncorrectURLMethod606() {
        response = forecastInCurrentCity.getForecastInMoscowByIncorrectURL606();
    }
}
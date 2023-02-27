import createRequest.ForecastInCurrentCity;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.ValidatableResponse;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class PositiveTestSteps {

    private ForecastInCurrentCity forecastInCurrentCity;
    private ValidatableResponse response;

    @Когда("^мы запрашиваем данные о погоде в городе \"([^\"]*)\"$")
    public void getForecastInTheCity(String cityForForecast) {
        switch (cityForForecast) {
            case "Москва":
                response = forecastInCurrentCity.getForecastInMoscow();
                break;
            case "Лондон":
                response = forecastInCurrentCity.getForecastInLondon();
                break;
            case "Рим":
                response = forecastInCurrentCity.getForecastInRome();
                break;
            case "Чикаго":
                response = forecastInCurrentCity.getForecastInChicago();
                break;
        }
    }

    @Тогда("^получаем ответ, который соответствует схеме по адресу: \"(.+)\"$")
    public void responseValidateSchema(String pathToSchema) {
        response.assertThat().body(JsonSchemaValidator.matchesJsonSchema(new File(pathToSchema)));
    }

    // pathToSchema
    // "./src/test/java/ru/my/package/schemas/MoscowForecastTestJson.json"


}

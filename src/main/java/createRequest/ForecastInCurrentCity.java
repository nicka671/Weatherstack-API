package createRequest;

import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class ForecastInCurrentCity extends BaseURL {
    public static final String ACCESS_KEY = "33f81aa7482c0083fc5e9a2a444f83a1";

    private static final String REST_OF_URL_MOSCOW = "current?access_key=" + ACCESS_KEY + "&query=Moscow";
    private static final String REST_OF_URL_MOSCOW_INCORRECT_615 = "current?access_key=" + ACCESS_KEY + "&query=M";
    private static final String REST_OF_URL_MOSCOW_INCORRECT_601 = "current?access_key=" + ACCESS_KEY + "&";
    private static final String REST_OF_URL_MOSCOW_INCORRECT_101 = "current?query=Moscow";
    private static final String REST_OF_URL_MOSCOW_INCORRECT_606 = REST_OF_URL_MOSCOW + "&units=i";
    private static final String REST_OF_URL_LONDON = "current?access_key=" + ACCESS_KEY + "&query=London";
    private static final String REST_OF_URL_ROME = "current?access_key=" + ACCESS_KEY + "&query=Rome";
    private static final String REST_OF_URL_CHICAGO = "current?access_key=" + ACCESS_KEY + "&query=Chicago";

    public static ValidatableResponse getForecastInMoscow()
    {
        return given()
                .log().all()
                .spec(getBaseSpec())
                .when()
                .get(REST_OF_URL_MOSCOW)
                .then();
    }

    public static ValidatableResponse getForecastInMoscowByIncorrectURL615()
    {
        return given()
                .log().all()
                .spec(getBaseSpec())
                .when()
                .get(REST_OF_URL_MOSCOW_INCORRECT_615)
                .then();
    }

    public static ValidatableResponse getForecastInMoscowByIncorrectURL601()
    {
        return given()
                .log().all()
                .spec(getBaseSpec())
                .when()
                .get(REST_OF_URL_MOSCOW_INCORRECT_601)
                .then();
    }

    public static ValidatableResponse getForecastInMoscowByIncorrectURL101()
    {
        return given()
                .log().all()
                .spec(getBaseSpec())
                .when()
                .get(REST_OF_URL_MOSCOW_INCORRECT_101)
                .then();
    }

    public static ValidatableResponse getForecastInMoscowByIncorrectURL606()
    {
        return given()
                .log().all()
                .spec(getBaseSpec())
                .when()
                .get(REST_OF_URL_MOSCOW_INCORRECT_606)
                .then();
    }

    public static ValidatableResponse getForecastInLondon()
    {
        return given()
                .log().all()
                .spec(getBaseSpec())
                .when()
                .get(REST_OF_URL_LONDON)
                .then();
    }

    public static ValidatableResponse getForecastInRome()
    {
        return given()
                .log().all()
                .spec(getBaseSpec())
                .when()
                .get(REST_OF_URL_ROME)
                .then();
    }

    public static ValidatableResponse getForecastInChicago()
    {
        return given()
                .log().all()
                .spec(getBaseSpec())
                .when()
                .get(REST_OF_URL_CHICAGO)
                .then();
    }
}

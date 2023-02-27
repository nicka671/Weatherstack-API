package createRequest;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BaseURL {
    private static String BASE_URL = "http://api.weatherstack.com/";

    public static RequestSpecification getBaseSpec()
    {
        return new RequestSpecBuilder()
                .setBaseUri(BASE_URL)
                .setContentType(ContentType.JSON)
                .build();
    }
}

package future.phase2.controller;

import future.phase2.response.NumberFormResponse;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class APIController {
    private String BaseURL = "https://www.blibli.com/backend/";

    public NumberFormResponse phoneNumberQuery(String phoneNumber){
        String productType = "digital-product/products?productType=PHONE_CREDIT&customerNumber=";
        String URL = BaseURL + productType + phoneNumber;
        Response response = given().
                header("Accept", "application/json").
                header("Content-type", "application/json").
                when().
                get(URL);
        return response.getBody().as(NumberFormResponse.class);
    }
}

package adapters;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class MoishopAdapters {

    protected String URL = "https://flashsales.moishop.by";

    public String get(String url, int statusCode) {
        return given()
                .header("Content-Type", "application/json")
                .when()
                .get(URL + url)
                .then()
                .statusCode(statusCode)
                .log().ifError()
                .extract().body().asString();
    }

    public Response post(String url, String body, int statusCode) {
        return  given()
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .post(URL + url)
                .then()
                .statusCode(statusCode)
                .log().ifError()
                .extract().response();
    }

    public void delete(String url, int statusCode) {
        given()
                .header("Content-Type", "application/json")
                .when()
                .delete(URL + url)
                .then()
                .statusCode(statusCode)
                .log().all();
    }

    public Response put(String url, String body, int statusCode, String token) {
        return given()
                .auth()
                .oauth2(token)
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .put(URL + url)
                .then()
                .statusCode(statusCode)
                .log().all()
                .extract().response();
    }
}

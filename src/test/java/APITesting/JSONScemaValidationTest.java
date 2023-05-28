package APITesting;

import io.restassured.RestAssured;

import java.io.File;

public class JSONScemaValidationTest {

    public static void main(String[] args) {
    File inputJson = new File("src/test/resources/input.json");
            RestAssured
                    .given()
                    .baseUri("https://reqres.in/")
                    .header("Content-Type","application/json")
                    .body(inputJson)
                    .when()
                    .post("api/users")
                    .then()
                    .body(JsonSchemaValidator.matchesJsonSchemaInClassPath("Schema.json"));
                     //.body(JsonSchemaValidator.matchesJsonSchema());


    }
}

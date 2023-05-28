package APITesting;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import java.io.File;

public class BDDStyleTest2 {
    @Test
    void getEmp(){
             given()
            .baseUri("https://reqres.in/")
            .when()
            .get("/api/users?page=1")
            .prettyPrint();
}

    @Test
    void getByIDEmp(){
        given()
                .baseUri("https://reqres.in/")
                .when()
                .get("/api/users/353")
                .prettyPrint();
    }

@Test
    void createTest(){    // 353 id created
        given()
                .baseUri("https://reqres.in/")
                .header("Content-Type","application/json")
                .body("{\n" +
                        "    \"name\": \"Bala\",\n" +
                        "    \"job\": \"MQA\"\n" +
                        "}").
                when()
                .post("api/users")
                .prettyPrint();

}
@Test
    void updateTest(){
        given()
                .baseUri("https://reqres.in/")
                .header("Content-Type","application/json")
                .body("{\n" +
                        "    \"name\": \"Kumar\",\n" +
                        "    \"job\": \"AQA\"\n" +
                        "}").
                when()
                .put("api/users/353")
                .prettyPrint();

}

@Test
    void deleteTest(){
        given()
                .baseUri("https://reqres.in/").
                when()
                .delete("api/users/2")
                .prettyPrint();
}


@Test
    void createEmployeeFromJsonFile(){

        File jsonFile = new File("postData.json");
        given()
                .baseUri("https://reqres.in/")
                .header("Content-Type","application/json")
                .body(jsonFile)
                .when()
                .post("api/users")
                .prettyPrint();
}


}



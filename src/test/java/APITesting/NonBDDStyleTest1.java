package APITesting;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;


public class NonBDDStyleTest1 {

    @Test
    void getTest(){
        RestAssured.baseURI="https://reqres.in/";
        RequestSpecification requestSpecification = RestAssured.given();
        Response res= requestSpecification.request(Method.GET,"/api/users?page=1");
        System.out.println(res.asPrettyString());
        System.out.println(res.getStatusLine());
    }
    @Test
    void getbyIDTest(){
        RestAssured.baseURI="https://reqres.in/";
        RequestSpecification requestSpecification = RestAssured.given();
        Response res= requestSpecification.request(Method.GET,"/api/users/1");
        System.out.println(res.asPrettyString());
        System.out.println(res.getStatusLine());
    }
    @Test
    void createTest(){
        RestAssured.baseURI="https://reqres.in/";
        RequestSpecification requestSpecification = RestAssured.given().
                header("Content-Type","application/json").
                body("{\n" +
                "    \"name\": \"sathish\",\n" +
                "    \"job\": \"AQA\"\n" +
                "}");
        Response res =requestSpecification.request(Method.POST, "api/users");
        System.out.println(res.asPrettyString());
        System.out.println(res.getStatusLine());

    }

    @Test
    void UpdateTest(){
        RestAssured.baseURI="https://reqres.in/";
        RequestSpecification requestSpecification= RestAssured.given()
                .header("Content-Type","Applicatoin/json")
                .body("{\n" +
                        "    \"name\": \"kumar\",\n" +
                        "    \"job\": \"MQA\"\n" +
                        "}");
        Response res =requestSpecification.request(Method.POST, "api/users/1");
        System.out.println(res.asPrettyString());
        System.out.println(res.getStatusLine());

    }

    @Test
    void deleteTest(){
        RestAssured.baseURI="https://reqres.in/";
        RequestSpecification requestSpecification= RestAssured.given()
                .header("Content-type","Application/json");
            Response res=    requestSpecification.request(Method.DELETE,"api/users/1");
        System.out.println(res.asPrettyString());
        System.out.println(res.getStatusLine());

    }

}

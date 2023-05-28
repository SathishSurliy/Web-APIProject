package APITesting;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class SerilizationProcess_HardcordedData_UsingHashMapTest {
// serarilatrion is process of converting java objects into byte stream or Json request
// outout of this pgm is java object which converted into JSON body with Jackson(databind) third party liberary
    @Test
    void ConstrcutJavaObjectsJsonUsingHashMap(){

        Map<String, Object> JsonBody =new HashMap <String,Object>();
        JsonBody.put("CustomerName","Sathish");
        JsonBody.put("Age","35");
        JsonBody.put("Email","sskthree@gmail.com");

        List<String> skills = new ArrayList<String>();
        skills.add("Java");
        skills.add("Python");
        skills.add("Selenium");
        JsonBody.put("TechnicalSkils",skills);
        System.out.println(JsonBody);

        given()
         .baseUri("https://reqres.in/")
                .header("Content-Type","applicatoin/json")
                .body(JsonBody)
                .log()
                .all().
         when()
                .post("api/users").
         then()
                .log()
                .all();




    }
}

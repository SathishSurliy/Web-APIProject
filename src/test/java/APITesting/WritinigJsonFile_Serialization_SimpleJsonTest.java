package APITesting;

import com.google.gson.JsonArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.io.FileWriter;
import java.io.IOException;

public class WritinigJsonFile_Serialization_SimpleJsonTest {

    @Test
    void test() throws IOException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Name","Sathishkumar");
        jsonObject.put("Age",35);

        JsonArray array= new JsonArray();
        array.add("Java");
        array.add("Python");
        array.add("Selenium");
        jsonObject.put("Skills", array);

        FileWriter fileWriter= new FileWriter("Sathish.json");
        fileWriter.write(jsonObject.toString());
        fileWriter.close();


    }
}

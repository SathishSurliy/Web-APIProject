package APITesting;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;


//import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class ReadingJsonFile_DeserializationUsingSimpleJsonTest {

    @Test
    void readJson() throws IOException, ParseException {
        // most of the cases, we read from url/endpoint url
        JSONParser jsonParser= new JSONParser();
        FileReader fileReader = new FileReader("Sathish.json");

        Object pareseObject =jsonParser.parse(fileReader);

        JSONObject jsonObject = (JSONObject)pareseObject;

        String name = (String)jsonObject.get("Name");
        long age = (long)jsonObject.get("Age");

        JSONArray array =(JSONArray)jsonObject.get("Skills");

        Iterator iterator =array.iterator();
        System.out.println("Name is: "+ name);
        System.out.println("Age is: "+ age);
        while(iterator.hasNext()){
            System.out.println("Skills are: "+ iterator.next());
        }


    }
}

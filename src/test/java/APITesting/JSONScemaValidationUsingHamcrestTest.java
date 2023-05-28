package APITesting;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.internal.ResponseSpecificationImpl;
import org.apache.commons.io.FileUtils;
import org.hamcrest.MatcherAssert;

import java.io.File;
import java.io.IOException;

public class JSONScemaValidationUsingHamcrestTest {

    public static void main(String[] args) throws IOException {
    File inputJson = new File("src/test/resources/input.json");
      // need to convert above file as String
            String jsonContent =    FileUtils.readFileToString(inputJson,"UTF-8");

            File jsonSchema= new File("src/test/resources/schema.json");
        //MatcherAssert.assertThat(jsonContent,JsonSchemaValidator.matchesJsonSchema(jsonSchem));

    }
}

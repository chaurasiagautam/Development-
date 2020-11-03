package main.java.poc;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

class Bean2JsonTest {
    String json = "[{\n" +
            "  \"templateName\": \"test\",\n" +
            "  \"isActive\": false,\n" +
            "  \"hasAdditionalProperties\": false,\n" +
            "  \"additionalProperties\": {\"1\":\"Gautam\",\"2\":\"Vibhav\",\"3\":\"Sumit\",\"4\":\"Alok\"} \n" +
            "},\n" +
            "{\n" +
            "  \"templateName\": \"test1\",\n" +
            "  \"isActive\": false,\n" +
            "  \"hasAdditionalProperties\": false,\n" +
            "  \"additionalProperties\": {\"1\":\"Gautam\",\"2\":\"Vibhav\",\"3\":\"Sumit\",\"4\":\"Alok\"} \n" +
            "}\n" +
            "]";

    @Test
    void testJsonToBean() throws IOException {
        Gson gson = new Gson();
        Bean2Json[] bean2Json = gson.fromJson(json,Bean2Json[].class);
//        Type userListType = new TypeToken<ArrayList<Bean2Json>>(){}.getType();

//        ArrayList<Bean2Json> userArray = gson.fromJson(json, userListType);

/*        for(Bean2Json user : userArray) {
            System.out.println(user);
        }*/

        System.out.println(bean2Json);
        List list =  Arrays.asList(bean2Json);
        list.forEach(System.out::println);

    }
}
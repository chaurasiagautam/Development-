package main.java.poc;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonToBean {


  public static void main(String[] args) throws IOException {

    readValue();
  }

  private static void readValue() throws IOException {
    Gson gson = new Gson();
    Reader reader = Files.newBufferedReader(Paths.get("src/main/resources/test.json"));
    Root[] uiElements = gson.fromJson(reader,Root[].class);
    System.out.println(uiElements[0]);
  }
}

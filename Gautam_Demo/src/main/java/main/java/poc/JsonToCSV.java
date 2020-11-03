package main.java.poc;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import java.io.File;
import java.io.IOException;

public class JsonToCSV {

  public static void main(String[] args){

//    readValue();
    System.out.println(getMAX(new int[]{1,2,19}));
    boolean[] arr = new boolean[6];
//    arr[7] = true;
  }

  private static void readValue(){

    try {
      JsonNode jsonTree = new ObjectMapper().readTree(new File("src/main/resources/test.json"));
      CsvSchema.Builder csvSchemaBuilder = CsvSchema.builder();
      JsonNode firstObject = jsonTree.elements().next();
      firstObject.fieldNames().forEachRemaining(fieldName -> {csvSchemaBuilder.addColumn(fieldName);} );
      CsvSchema csvSchema = csvSchemaBuilder.build().withHeader();
      CsvMapper csvMapper = new CsvMapper();
      csvMapper.writerFor(JsonNode.class)
          .with(csvSchema)
          .writeValue(new File("src/main/resources/orderLines.csv"), jsonTree);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static int getMAX(int[] A){
    int n = A.length;

    boolean[] present = new boolean[n + 1];

    for (int i = 0; i < n; i++) {

      if (A[i] > 0 && A[i] <= n) {
        System.out.println(A[i]);
        present[A[i]] = true;
      }
    }
    for (int i = 1; i <= n; i++)
      if (!present[i])
        return i;

    return n + 1;
  }
}

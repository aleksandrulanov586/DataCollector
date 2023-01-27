import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class JsonParsing {


  public static List<Depth> parseDepthsList(String dataFile) throws JsonProcessingException {

    ObjectMapper objectMapper = new ObjectMapper();
    return objectMapper.readValue(getJsonFile(dataFile), new TypeReference<>() {
    });

  }

  private static String getJsonFile(String dataFile) {
    StringBuilder builder = new StringBuilder();
    try {
      List<String> lines = Files.readAllLines(Paths.get(dataFile));
      lines.forEach(builder::append);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return builder.toString();
  }

}

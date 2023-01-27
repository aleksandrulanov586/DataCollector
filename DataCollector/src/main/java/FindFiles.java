import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFiles {


  public static List<String> findJsonFiles(Path path)
      throws IOException {

    if (!Files.isDirectory(path)) {
      throw new IllegalArgumentException("Path must be a directory!");
    }

    List<String> listJsonFiles;

    try (Stream<Path> walk = Files.walk(path)) {
      listJsonFiles = walk
          .filter(p -> !Files.isDirectory(p))
          .map(p -> p.toString().toLowerCase())
          .filter(f -> f.endsWith("json"))
          .collect(Collectors.toList());
    }

    return listJsonFiles;

  }

  public static List<String> findCsvFiles(Path path)
      throws IOException {

    if (!Files.isDirectory(path)) {
      throw new IllegalArgumentException("Path must be a directory!");
    }

    List<String> listCsvFiles;

    try (Stream<Path> walk = Files.walk(path)) {
      listCsvFiles = walk
          .filter(p -> !Files.isDirectory(p))
          .map(p -> p.toString().toLowerCase())
          .filter(f -> f.endsWith("csv"))
          .collect(Collectors.toList());
    }
    return listCsvFiles;

  }
}

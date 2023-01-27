import com.fasterxml.jackson.annotation.*;

import java.util.List;

@JsonPropertyOrder({"name", "line", "date", "depth", "hasConnection"})
public class Station {


  private String stationName;
  @JsonIgnore
  private String lineNumber;
  @JsonInclude(JsonInclude.Include.NON_DEFAULT)
  boolean hasConnection;
  @JsonIgnore
  private List<String> connectionsList;
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String date = null;
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Float depth = null;
  @JsonUnwrapped
  private Line line;

  public Station(String stationName, String lineNumber, boolean hasConnection,
      List<String> connectionsList) {
    this.stationName = stationName;
    this.lineNumber = lineNumber;
    this.hasConnection = hasConnection;
    this.connectionsList = connectionsList;
  }

  public Station(String stationName, String lineNumber, boolean hasConnection) {
    this.stationName = stationName;
    this.lineNumber = lineNumber;
    this.hasConnection = hasConnection;
    this.connectionsList = null;
  }

  @JsonGetter("name")
  public String getStationName() {
    return stationName;
  }

  public void setStationName(String stationName) {
    this.stationName = stationName;
  }

  public String getLineNumber() {
    return lineNumber;
  }

  public void setLineNumber(String lineNumber) {
    this.lineNumber = lineNumber;
  }

  public boolean isHasConnection() {
    return hasConnection;
  }

  public void setHasConnection(boolean hasConnection) {
    this.hasConnection = hasConnection;
  }

  public List<String> getConnectionsList() {
    return connectionsList;
  }

  public void setConnectionsList(List<String> connectionsList) {
    this.connectionsList = connectionsList;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public Float getDepth() {
    return depth;
  }

  public void setDepth(Float depth) {
    this.depth = depth;
  }

  public Line getLine() {
    return line;
  }

  public void setLine(Line line) {
    this.line = line;
  }

  public String toString() {

    if (isHasConnection()) {
      return "Station name: " + getStationName() + ", " +
          "HasConnection: " + isHasConnection() + ", " +
          "Connections: " + getConnectionsList() + ", " +
          "Date: " + getDate() + ", " +
          "Depth: " + getDepth() + ", " +
          "Line: " + getLine();
    } else {
      return "Station name: " + getStationName() + ", " +
          "HasConnection: " + isHasConnection() + ", " +
          "Date: " + getDate() + ", " +
          "Depth: " + getDepth() + ", " +
          "Line: " + getLine();


    }

  }

}

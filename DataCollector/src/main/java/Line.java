import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Line {

  @JsonIgnore
  private String lineNumber;

  private String lineName;

  public Line(String lineNumber, String lineName) {
    this.lineNumber = lineNumber;
    this.lineName = lineName;
  }

  public String getLineNumber() {
    return lineNumber;
  }

  public void setLineNumber(String lineNumber) {
    this.lineNumber = lineNumber;
  }

  @JsonGetter("line")
  public String getLineName() {
    return lineName;
  }

  public void setLineName(String lineName) {
    this.lineName = lineName;
  }

  public String toString() {
    return getLineNumber() + " - " + getLineName();


  }
}



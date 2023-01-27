import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Depth {

  private String stationName;
  private String depth;

  @JsonCreator
  public Depth(
      @JsonProperty("station_name") String stationName,
      @JsonProperty("depth") String depth) {
    this.stationName = stationName;
    this.depth = depth;
  }

  public String getStationName() {
    return stationName;
  }

  public void setStationName(String stationName) {
    this.stationName = stationName;
  }

  public String getDepth() {
    return depth;
  }

  public void setDepth(String depth) {
    this.depth = depth;
  }

  public String toString() {
    return "\n" + "Station name: " + getStationName() + " = " +
        "Depth: " + getDepth();
  }


  @Override
  public boolean equals(Object obj) {
      if (obj == null) {
          return false;
      }
      if (obj.getClass() != this.getClass()) {
          return false;
      }
      if (obj == this) {
          return true;
      }

    Depth stationDepth = (Depth) obj;
    return (Objects.equals(stationName, stationDepth.stationName)
        && (Objects.equals(depth, stationDepth.depth)));

  }

  @Override
  public int hashCode() {
    return Objects.hash(stationName, depth);
  }


}

import java.util.Objects;

public class Date {

  private String stationName;
  private String date;

  public Date(String stationName, String date) {
    this.stationName = stationName;
    this.date = date;
  }

  public String getStationName() {
    return stationName;
  }

  public void setStationName(String stationName) {
    this.stationName = stationName;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String toString() {
    return "\n" + "Station name: " + getStationName() + " - " +
        "Date: " + getDate();
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

    Date stationDate = (Date) obj;
    return (Objects.equals(stationName, stationDate.stationName)
        && (Objects.equals(date, stationDate.date)));

  }

  @Override
  public int hashCode() {
    return Objects.hash(stationName, date);
  }

}

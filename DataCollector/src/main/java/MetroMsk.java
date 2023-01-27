import java.util.List;

public class MetroMsk {


  private List<Station> stations;

  public MetroMsk(List<Station> stations) {
    this.stations = stations;
  }

  public List<Station> getStations() {
    return stations;
  }

  public void setStations(List<Station> stations) {
    this.stations = stations;
  }
}

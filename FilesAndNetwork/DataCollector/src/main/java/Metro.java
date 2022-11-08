import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"stations" + "{" + "[" + "line" + "]" + "}"})
public class Metro {
    public int line;
    public String station;
    public String stations;
}

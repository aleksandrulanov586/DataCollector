public class Text {
    String name;
    String fam;
    String num;

    public Text(String name, String fam, String num) {
        this.name = name;
        this.fam = fam;
        this.num = num;
    }

    @Override
    public String toString() {
        return name + " " + fam + " " + num;
    }
}

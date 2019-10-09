import java.io.Serializable;

class Cyborg implements Serializable {
    private String name;
    private String range;
    private int weight;

    public Cyborg(String name, String range, int weight) {
        this.name = name;
        this.range = range;
        this.weight = weight;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return "Cyborg{" +
                "name='" + name + '\'' +
                ", range='" + range + '\'' +
                ", weight=" + weight +
                '}';
    }
}

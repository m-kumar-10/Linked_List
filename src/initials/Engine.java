package initials;

public class Engine {
    private  String name;
    private int rpm;
    private  Double weight;

    public Engine(String name, int rpm, Double weight) {
        this.name = name;
        this.rpm = rpm;
        this.weight=weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}

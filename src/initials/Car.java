package initials;

public class Car {
    private String name;
    private Character model;
    private int model_no;
    private String color;
    private Engine engine;

    public Car(String name, Character model, int model_no, String color, Engine engine) {
        this.name = name;
        this.model = model;
        this.model_no = model_no;
        this.color = color;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getModel() {
        return model;
    }

    public void setModel(Character model) {
        this.model = model;
    }

    public int getModel_no() {
        return model_no;
    }

    public void setModel_no(int model_no) {
        this.model_no = model_no;
    }

    public String getColor() {
        return color;
    }

    /**
     * set Color of the Car object.
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}

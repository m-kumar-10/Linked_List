package initials;

public class Wheel {
    private String name;
    private  int friction_coefiecient;
    private int numbers;

    public Wheel(String name, int friction_coefiecient, int numbers) {
        this.name = name;
        this.friction_coefiecient = friction_coefiecient;
        this.numbers = numbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFriction_coefiecient() {
        return friction_coefiecient;
    }

    public void setFriction_coefiecient(int friction_coefiecient) {
        this.friction_coefiecient = friction_coefiecient;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }
}


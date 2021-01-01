package initials;

public class Birds extends Animals{

    private  boolean drink;
    public boolean isDrink() {
        return drink;
    }

    public void setDrink(boolean drink) {
        this.drink = drink;
    }
    public Birds(String name, int legs, String color, boolean fly, boolean drink) {
        super(name, legs, color, fly);
        this.drink = drink;



    }
}

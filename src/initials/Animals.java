package initials;

public class Animals {
    private String name;
    private int legs;
    private String color;
    private boolean fly;

    public Animals(String name, int legs, String color, boolean fly) {
        this.name = name;
        this.legs = legs;
        this.color = color;
        this.fly = fly;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }
    public  void food(String food){
        System.out.println(getName()+" is eating "+food);
    }

    public  void food(int food){
        System.out.println(getName()+" is eating "+food+"gram of food");
    }
}

package initials;

class Dog extends Animals
{

    public Dog(String name, int legs, String color, boolean fly, Boolean barks) {
        super(name, legs, color, fly);
        this.barks = barks;
    }

    Boolean barks;

    public Boolean getBarks() {
        return barks;
    }

    public void setBarks(Boolean barks) {
        this.barks = barks;
    }
}
package initials;

public class Phone {
    String name;
    int Ram;
    float camera;
    boolean touchScreen;

    //constructor......

    public String playMusic(String song){
        return  song;
    }

    public Phone(String name, int ram, float camera, boolean touchScreen) {
        this.name = name;
        Ram = ram;
        this.camera = camera;
        this.touchScreen = touchScreen;
    }

    //getter method........
    public String getName() {
        return name;
    }

    public int getRam() {
        return Ram;
    }

    public float getCamera() {
        return camera;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    //setter method.......


    public void setName(String name) {
        this.name = name;
    }

    public void setRam(int ram) {
        Ram = ram;
    }

    public void setCamera(float camera) {
        this.camera = camera;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }
}


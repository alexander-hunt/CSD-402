public class Fan {

    // Constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Fields
    private int speed = STOPPED;
    private Boolean on = false;
    private double radius = 6.0;
    private String color = "white";

    // No-argument constructor
    public Fan() {
        // Defaults are already set via field initialization
    }

    // Argument constructor
    public Fan(int speed, Boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getters and setters
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Boolean isOn() {
        return on;
    }

    public void setOn(Boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method
    @Override
    public String toString() {
        String speedString;
        switch (speed) {
            case SLOW:
                speedString = "SLOW";
                break;
            case MEDIUM:
                speedString = "MEDIUM";
                break;
            case FAST:
                speedString = "FAST";
                break;
            default:
                speedString = "STOPPED";
        }

        return "Fan State:\n" +
               "On: " + on + "\n" +
               "Speed: " + speedString + "\n" +
               "Radius: " + radius + "\n" +
               "Color: " + color;
    }

    // Test code
    public static void main(String[] args) {
        // Fan using default constructor
        Fan defaultFan = new Fan();
        System.out.println("Default Fan:");
        System.out.println(defaultFan);
        System.out.println();

        // Fan using argument constructor
        Fan customFan = new Fan(Fan.FAST, true, 10.0, "blue");
        System.out.println("Custom Fan:");
        System.out.println(customFan);
        System.out.println();

        // Demonstrate setters and getters
        defaultFan.setOn(true);
        defaultFan.setSpeed(Fan.MEDIUM);
        defaultFan.setRadius(8.0);
        defaultFan.setColor("black");

        System.out.println("Updated Default Fan:");
        System.out.println(defaultFan);
    }
}

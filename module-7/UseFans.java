import java.util.ArrayList;
import java.util.List;

// Fan class
class Fan {

    // Constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Fields
    private int speed;
    private Boolean on;
    private double radius;
    private String color;

    // No-argument constructor
    public Fan() {
        this.speed = Fan.STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
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
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Boolean isOn() {
        return this.on;
    }

    public void setOn(Boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //toString method
    @Override
    public String toString() {
        return "Fan[on=" + this.on +
               ", speed=" + this.speed +
               ", radius=" + this.radius +
               ", color=" + this.color + "]";
    }
}

// UseFans class
public class UseFans {

    // Display a collection of Fans
    public static void displayFans(List<Fan> fans) {
        for (Fan fan : fans) {
            displayFan(fan);
            System.out.println("---------------------");
        }
    }

    // Display a single Fan
    public static void displayFan(Fan fan) {

        String speedLabel;

        switch (fan.getSpeed()) {
            case Fan.SLOW:
                speedLabel = "SLOW";
                break;
            case Fan.MEDIUM:
                speedLabel = "MEDIUM";
                break;
            case Fan.FAST:
                speedLabel = "FAST";
                break;
            default:
                speedLabel = "STOPPED";
        }

        System.out.println("Fan Details:");
        System.out.println("On: " + fan.isOn());
        System.out.println("Speed: " + speedLabel);
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
    }

    // Test code
    public static void main(String[] args) {

        // Create a collection of Fan instances
        List<Fan> fanList = new ArrayList<>();

        Fan fan1 = new Fan(); 
        Fan fan2 = new Fan(Fan.FAST, true, 10.0, "blue");
        Fan fan3 = new Fan(Fan.MEDIUM, true, 8.5, "black");

        fanList.add(fan1);
        fanList.add(fan2);
        fanList.add(fan3);

        // Modify a fan
        fan1.setOn(true);
        fan1.setSpeed(Fan.SLOW);
        fan1.setRadius(7.0);
        fan1.setColor("red");

        // Display all fans in the collection
        displayFans(fanList);
    }
}

package MyObjectProject;

public class BallPen {
    // Initialization
    public String brand;
    public String color;
    public String inkType; // e.g., gel, ballpoint, rollerball
    public boolean isCapped;
    public int inkLevel; // Representing ink level as a percentage (0-100)

    // Constructor
    public BallPen(String brand, String color, String inkType, boolean isCapped, int inkLevel) {
        this.brand = brand;
        this.color = color;
        this.inkType = inkType;
        this.isCapped = isCapped;
        this.inkLevel = Math.max(0, Math.min(100, inkLevel)); // Ensure ink level is between 0 and 100
    }

    // Method to print the ballpen details
    public void printDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Ink Type: " + inkType);
        System.out.println("Is Capped: " + (isCapped ? "Yes" : "No"));
        System.out.println("Ink Level: " + inkLevel + "%");
    }

    // Method to return a description of the ballpen
    public String description() {
        return brand + " " + color + " ballpoint pen with " + inkType + " ink. Capped: " + (isCapped ? "Yes" : "No") + ", Ink Level: " + inkLevel + "%";
    }

    // Method to simulate writing with the pen
    public void write() {
        if (isCapped) {
            System.out.println("You can't write with the pen because it is capped.");
        } else if (inkLevel <= 0) {
            System.out.println("The pen is out of ink. Please refill.");
        } else {
            System.out.println("Writing...");
            inkLevel -= 10; // Decrease ink level by 10% each time you write
            if (inkLevel < 0) inkLevel = 0; // Prevent ink level from going below 0
            System.out.println("Remaining ink: " + inkLevel + "%");
        }
    }

    // Method to simulate capping and uncapping the pen
    public void toggleCap() {
        isCapped = !isCapped;
        System.out.println(isCapped ? "Pen is now capped." : "Pen is now uncapped.");
    }

    // Method to refill ink in the pen
    public void refill() {
        inkLevel = 100;
        System.out.println("Pen refilled. Ink level is now 100%.");
    }

    // Getters and Setters for private fields
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getInkType() {
        return inkType;
    }

    public void setInkType(String inkType) {
        this.inkType = inkType;
    }

    public boolean isCapped() {
        return isCapped;
    }

    public void setCapped(boolean capped) {
        isCapped = capped;
    }

    public int getInkLevel() {
        return inkLevel;
    }

    public void setInkLevel(int inkLevel) {
        this.inkLevel = Math.max(0, Math.min(100, inkLevel)); // Ensure ink level stays between 0 and 100
    }
}

public class Phone {
    private String brand;
    private String model;
    private double screenSize; // in inches

    public Phone() {}

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Phone(String brand, String model, double screenSize) {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public boolean isLargeScreen() {
        return screenSize > 6.5;
    }

    public String describePhone() {
        return "This is a " + brand + " " + model + " with a " + screenSize + "-inch screen.";
    }
}

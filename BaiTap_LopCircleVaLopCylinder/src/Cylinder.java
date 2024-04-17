public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getVolume(){
        return height*getArea();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder với chiều cao"
                + getHeight()
                + ", có thể tích = "
                + getVolume()
                +super.toString();
    }
}

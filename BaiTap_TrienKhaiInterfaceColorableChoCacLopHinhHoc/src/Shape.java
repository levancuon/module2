public abstract class Shape {
    private String color = "red";
    private double width = 1.0;
    private double height = 1.0;


    public Shape() {
    }
    public Shape(double width) {
        this.width=width;
    }
    public Shape(double width,double height) {
        this.width=width;
        this.height=height;
    }

    public Shape(String color, double width, double height) {
        this.color = color;
        this.width = width;
        this.height = height;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}

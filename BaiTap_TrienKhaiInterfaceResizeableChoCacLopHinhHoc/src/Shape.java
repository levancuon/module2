public abstract class Shape {
    private String color = "red";
    private double radius = 1.0;
    private double width = 1.0;
    private double height =1.0;
    private double percent =1.2;
    public Shape() {
    }

    public Shape(double radius) {
        this.radius = radius;
    }

    public Shape(String color, double radius, double width, double height, double percent) {
        this.color = color;
        this.radius = radius;
        this.width = width;
        this.height = height;
        this.percent=percent;
    }

    public abstract double getArea();

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
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
                " radius=" + radius +
                ", width=" + width +
                ", height=" + height +
                ", percent=" + percent +
                '}';
    }
}

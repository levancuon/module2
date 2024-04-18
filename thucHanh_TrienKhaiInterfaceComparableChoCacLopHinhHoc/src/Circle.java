public class Circle extends Shape {
    private double radius=1.0;

    public Circle() {
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(String color, boolean filled) {
        super(color, filled);
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }
public double getArea(){
        return Math.PI*this.radius*this.radius;
}
public double getPerimeter(){
        return Math.PI*2*this.radius;
}
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "A Circle with radius = " + radius +
                ", which is a subclass of "+super.toString()+
                '}';
    }
}

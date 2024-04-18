public class Retangle extends Shape {
    private double length =1.0;
    private double width=1.0;

    public  Retangle(){
        super();
    }
    public Retangle(String color, boolean filled, double length, double width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public Retangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getArea(){
        return this.length*this.width;
    }
    public double getPerimeter(){
        return 2*(this.width+this.length);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return " Retangle{" +
                ", A Rectangle with width = " + width +
                ", length = " + length +
                ", which is a subclass of "+super.toString()+
                '}';
    }
}

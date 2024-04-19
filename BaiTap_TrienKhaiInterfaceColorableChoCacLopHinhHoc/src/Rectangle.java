public class Rectangle extends Shape{
    private double area;
    public Rectangle() {
    }

    public Rectangle(double width,double height) {
        super(width,height);
    }

    public Rectangle(String color, double width, double height) {
        super(color, width, height);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void getArea123(){
        area = getWidth()*getWidth();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "area=" + getArea()
                + "Chieu dai = "
                + getHeight()
                + " chieu rong = "
                + getWidth()+
                '}';
    }
}

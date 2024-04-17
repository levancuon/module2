import java.awt.geom.Area;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double height =1.0;
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    public Rectangle(){}
    public Rectangle(double width,double height,String color, boolean filled){
        super(color,filled);
        this.width=width;
        this.height=height;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }


    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }


    public double Area(){
        return width*height;
    }
    public double Perimeter(){
        return 2*width*height;
    }

    @Override
    public String toString() {
        return "A Rectangle with "
                + " Area = "
                + Area()
                + " height = "
                + getHeight()
                + " and width = "
                + getWidth()
                + " And perimeter = "
                + Perimeter()
                + ",which is subclass of "
                + super.toString();
    }
}

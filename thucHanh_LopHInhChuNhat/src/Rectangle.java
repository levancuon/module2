public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.height*this.width;
    }
    public double getPerimeter(){
        return  2*(this.height+this.width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", dien tich= "+ getArea()+
                ", chu vi= " + getPerimeter()+
                '}';
    }
}

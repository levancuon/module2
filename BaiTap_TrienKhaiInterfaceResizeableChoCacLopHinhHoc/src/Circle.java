public class Circle extends Shape implements Resizeable{


    public Circle() {
    }
    public Circle(double radius){
        super(radius);
    }
    public Circle(String color, double radius, double width, double height,double percent) {
        super(color, radius, width, height,percent);
    }

    @Override
    public double resize() {
        return getArea()*super.getPercent();
    }
    @Override
    public double getArea() {
       return super.getRadius()*Math.PI*super.getRadius();
    }

    @Override
    public String toString() {
        return "ban kinh  = "
                + getRadius()
                +" Area = "
                + getArea()
                +super.toString();
    }
}

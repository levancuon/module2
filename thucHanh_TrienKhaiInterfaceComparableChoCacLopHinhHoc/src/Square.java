public class Square extends Retangle {
    public Square() {

    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public Square( double side) {
        super(side, side);
    }

    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }
    public void setWidth(double width) {
        setSide(width);
    }
    public String toString() {
        return "A square has side = "
                + getSide()
                +", có diện tích = "
                +getArea()
                +" và chu vi = "
                +getPerimeter()
                +", which is a subclass of "
                +super.toString()
                ;
    }
}

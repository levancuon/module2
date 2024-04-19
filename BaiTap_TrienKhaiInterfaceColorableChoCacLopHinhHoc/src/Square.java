public class Square extends Shape implements Colorable{

   public double area;

    public Square() {
    }
    public Square(double width) {
        super(width);
    }

    public Square(double width, double area) {
        super(width);
        this.area = area;
    }

    public Square(String color, double width, double height, double area) {
        super(color, width, height);
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea123(){
        area = getWidth()*getWidth();
        return area;
    }


    @Override
    public String toString() {
        return "hinh vuong co area = "
                + getArea123()
                +" voi canh = "
                +getWidth()
                +super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("color all 4 side");
    }


}

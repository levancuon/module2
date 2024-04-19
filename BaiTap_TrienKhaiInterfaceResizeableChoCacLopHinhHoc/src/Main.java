
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.2);

        System.out.println(circle);
        System.out.println("resize = "+circle.resize());

        Shape circle1 = new Circle(4);
        Circle circle2 = (Circle) circle1;

        System.out.println(circle2);
        circle2.resize();
        System.out.println(circle2);
        System.out.println( circle2.getArea());
    }
}
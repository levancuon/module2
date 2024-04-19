import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
//        Circle circle = new Circle(5);
//        System.out.println(circle);
//        System.out.println("dien tich = " + circle.getArea());
//        System.out.println("chu vi = " + circle.getPerimeter());
//
//
//        Shape rectanghle= new Retangle(4, 5);
//        rectanghle.setColor("red");
//        System.out.println(rectanghle);
//
//
//        Shape square = new Square(5);
//        System.out.println(square);

        ComparableCircle[] circles = new ComparableCircle[4];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5);
        circles[3] = new ComparableCircle(4);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
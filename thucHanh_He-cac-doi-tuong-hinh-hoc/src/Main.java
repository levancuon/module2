import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Shape shape = new Shape();
//        System.out.println(shape);
//        Shape shape1 = new Shape("red", false);
//        System.out.println(shape1);

//        Circle circle = new Circle();
//        System.out.println(circle);
//        circle =new Circle(3.5);
//        System.out.println(circle);


//        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle);
//        Rectangle rectangle1 = new Rectangle(5,6,"red",true);
//        System.out.println(rectangle1);
//        Rectangle rectangle2=new Rectangle(3,4);
//        System.out.println(rectangle2);

        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "indigo", false);


        System.out.println("Pre-sorted:");
        for (ComparableCircle circle1: circles) {
            System.out.println(circle1);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCircle circle1 : circles) {
            System.out.println(circle1);
        }

    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle);
        System.out.println("dien tich = " + circle.getArea());
        System.out.println("chu vi = " + circle.getPerimeter());


        Shape rectanghle = new Retangle(4, 5);
        rectanghle.setColor("red");
        System.out.println(rectanghle);


        Shape square = new Square(5);
        System.out.println(square);
    }
}
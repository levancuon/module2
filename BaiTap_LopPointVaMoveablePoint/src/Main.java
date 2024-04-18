//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Point point = new Point();
//        System.out.println(point);

        MoveablePoint point1 = new MoveablePoint();

        point1.setSpeed(2,3);
//        point1.setySpeed(2);
//        point1.setxSpeed(15);

        point1.move();
        point1.move();
        point1.move();

        System.out.println(point1);

    }
}
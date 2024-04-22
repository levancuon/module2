import javafx.scene.shape.Circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0]= new Square(5);
        shapes[1]= new Rectangle(6,7);
        for (Shape item: shapes){
            System.out.println(item);
            if (item instanceof Colorable){
                ((Colorable) item).howToColor();
            }
        }
        Square square = new Square(10);
        square.getArea123();
        System.out.println(square.getArea());
    }
}
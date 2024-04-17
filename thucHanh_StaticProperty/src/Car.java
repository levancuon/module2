public class Car {
    private String name;
    private String color;
    private static int numberOfcars;

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
        numberOfcars++;
    }

    public static int getNumberOfcars() {
        return numberOfcars;
    }
}

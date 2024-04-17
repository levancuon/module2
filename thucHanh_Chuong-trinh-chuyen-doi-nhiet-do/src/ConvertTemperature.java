import java.util.Scanner;

public class ConvertTemperature {

   /* public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter fahrenheit: ");
                    fahrenheit = input.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                }
                case 2:{
                    System.out.println("Enter Celsius: ");
                    celsius = input.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                }
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit= (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        double C;
        double F;
        while (choice != 0) {
            System.out.println("1.Convert C into F");
            System.out.println("2.Convert F into C");
            System.out.println("0.Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("nhập số độ C");
                    C = scanner.nextDouble();
                    F = C * 5/9 + 32;
                    System.out.println(C+" C = "+F+" F");
                    break;
                case 2:
                    System.out.println("nhập số độ F");
                    F = scanner.nextDouble();
                    C = (5/9)*(F-32);
                    System.out.println(C+" C = "+F+" F");
                    break;
                case 0:
                    choice = 0;
            }
        }


    }


}

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        double number = input.nextInt();
        if (number < 2) {
            System.out.println("ko phai so nguyen to");
        } else {
            double i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }

            if (check)
                System.out.println(number + " is a prime");
            else
                System.out.println("is not a prime");
        }

         */
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so");
        double number = input.nextDouble();
        if (number < 2) {
            System.out.println("ko phai so nguyen to");
        } else {
            double i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }

        if(check)
            System.out.println("so nguyen to");
         else
            System.out.println("ko phai so nguyen to");
        }





    }
}

import java.util.Scanner;

public class hienTHiCaLoaiHinh {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle (top-left)");
            System.out.println("3.Print the square triangle (top-right )");
            System.out.println("4.Print the square triangle (botton-left)");
            System.out.println("5.Print the square triangle (botton-right)");
            System.out.println("6.Print isosceles triangle");
            System.out.println("7.Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 1; i < 6; i++) {
                        for (int j = i - 1; j < 5; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("  ");
                        }
                        for (int j = 0; j < 5-i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < i + 1; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 4-i; j++) {
                            System.out.print("  ");
                        }
                        for (int j = 0; j < i+1; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5-i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < 1+i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;








            }


        }
    }
}


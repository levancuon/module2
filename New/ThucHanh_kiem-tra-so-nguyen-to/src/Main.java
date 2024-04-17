import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so");
        int num = scanner.nextInt();
        if(num<2){
            System.out.println("ko phai so nguyen to");;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num%i==0){
                System.out.println("is Prime");

            }
        }
    }
}
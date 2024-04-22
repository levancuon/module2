import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,2,6};
        int count =0;


        System.out.println("nhập số cần tìm");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        for (int i = 0; i < arr.length ; i++) {
            if(x == arr[i]){
               count++;
            }
        }
        System.out.println("x lặp lại "+count+"lần");


    }
}
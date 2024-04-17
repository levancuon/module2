import java.util.Scanner;

public class deleteElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 5, 4};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số muốn xoá");
        int num = scanner.nextInt();
        int temp = 0;
        boolean exist = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (num == arr[i]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        arr[arr.length-1] = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}

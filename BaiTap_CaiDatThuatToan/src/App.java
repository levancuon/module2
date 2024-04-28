import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("nhap mang");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();
            arr.add(number);
        }
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
        int variable = scanner.nextInt();

        int result = binarySearch(arr, 0, arr.size() - 1, variable);

        if (result == -1) {
            System.out.println("ko tim thay phan tu");
        } else {
            System.out.println("tim thay phan tu " + variable + " o vi tri " + result);
        }


    }

    public static int binarySearch(ArrayList<Integer> arr, int left, int right, int value) {
        int middle = (left + right) / 2;
        if (left > right) {
            return -1;
        }
        if (arr.get(middle) == value) {
            return middle;
        }
        if (value > arr.get(middle)) {
            return binarySearch(arr, middle + 1, right, value);
        }
        return binarySearch(arr, left, middle - 1, value);
    }

}
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    //BAI CHINH;
    /*public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }

     */


    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập độ dài mảng");
        int length = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[length];
        int i = 0;
        while (i < length) {
            System.out.print("nhập phần tử " + (i + 1) + ": ");
            arr[i] = Integer.parseInt(scanner.nextLine());
            i++;
        }
        System.out.println("mảng bth");
        for (int j = 0; j < arr.length; j++) {

            System.out.print(arr[j]+" ");
        }

    }

     */
     /*public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("nhập độ dài mảng");
         int length = scanner.nextInt();
         int[] arr = new int[length];
         for (int i = 0; i < length; i++) {
             System.out.print("nhập phần tử "+i+" ");
             arr[i]= scanner.nextInt();
         }
         System.out.println("show mảng bth");
         for (int i = 0; i < length; i++) {
             System.out.print(arr[i]+" ");
         }
         int temp;
         for (int i = 0; i < length/2; i++) {
             temp = arr[i];
             arr[i]=arr[length-1-i];
             arr[length-1] = temp;
         }

         System.out.println("\n"+"show mảng đảo ngược");
         for (int i = 0; i < length; i++) {
             System.out.print(arr[i]+" ");
         }

     }

      */
    // làm lại cách khác
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("arr ban dau: " + Arrays.toString(arr));
//    int arrays = 0;
        reverseArr(arr);


    }

    //reverse arr
    public static void reverseArr(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
           temp = arr[i];
           arr[i] = arr[arr.length-i-1];
           arr[arr.length-1-i]=temp;
        }
        System.out.println("arr reverse: " + Arrays.toString(arr));

    }


}

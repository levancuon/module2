import java.util.Arrays;
import java.util.Scanner;

public class addElementToArray {

    /*public static void main(String[] args) {
        // Mảng ban đầu
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Mảng ban đầu:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        // Thêm phần tử mới có giá trị 10 vào vị trí thứ 2 của mảng
        int[] ketQua = themPhanTu(arr, 10, 2);
        System.out.println("\n"+"Mảng sau khi thêm phần tử mới: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ketQua[i]+" ");
        }

    }

    public static int[] themPhanTu(int[] arr, int phanTuMoi, int viTri) {
        // Kiểm tra xem vị trí cần thêm có hợp lệ không
        if (viTri < 0 || viTri > arr.length) {
            System.out.println("Vị trí không hợp lệ!");
            return arr;
        }

        // Tạo một mảng mới để chứa các phần tử sau khi thêm
        int[] mangMoi = new int[arr.length + 1];

        // Sao chép các phần tử từ mảng ban đầu vào mảng mới
        for (int i = 0, j = 0; i < mangMoi.length; i++) {
            if (i == viTri) {
                mangMoi[i] = phanTuMoi;
            } else {
                mangMoi[i] = arr[j++];
            }
        }

        return mangMoi;
    }

     */
    public static void main(String[] args) {
        int[] arr = new int[10];
        int size = 0;
        System.out.println("mang ban đầu: "+ Arrays.toString(arr));

        size = addElement(arr,10,size);
        System.out.println("mảng sau thêm: "+Arrays.toString(arr));

        size = addElement(arr,15,size);
        System.out.println("mảng sau thêm: "+Arrays.toString(arr));


    }

    // thêm phần tử vào cuối mảng
    public static int addElement(int[] arr, int item, int size){
        arr[size] = item;
        size++;
        return size;
    }

    // thêm phần tử vào vị trí bất kì
    public static int addElementToIndex(int[] arr,int item, int size , int index){
        for (int i = size; i > index; i--) {
            arr[i]=arr[i-1];
        }
        arr[index]=item;
        size++;
        return size;
    }

    // edit element
    public static int editElement(int[] arr, int element, int index,int size){
        arr[index]= element;
        return size;
    }


















}

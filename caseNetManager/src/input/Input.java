package input;



import java.util.Scanner;

public class Input {
    Scanner input = new Scanner(System.in);


    public int getInt() {
        try {
            return Integer.parseInt(input.nextLine());
        } catch (Exception e) {
            System.out.println("Vui lòng nhập số");
            return getInt();
        }

    }
    public double getDouble() {
        try {
            return Double.parseDouble(input.nextLine());
        } catch (Exception e) {
            System.out.println("Vui lòng nhập số");
            return getInt();
        }

    }
    public String getStr(){
        return String.valueOf(input.nextLine());
    }



}

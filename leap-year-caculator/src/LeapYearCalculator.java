import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập năm");
        int year = input.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("năm "+year+" là năm nhuận");
                } else {
                    System.out.println("năm "+year+" ko là năm nhuận");
                }

            }else{
                System.out.println("năm "+year+" là năm nhuận");
            }
        } else {
            System.out.println("năm "+year+" ko là năm nhuận");
        }





    }
}

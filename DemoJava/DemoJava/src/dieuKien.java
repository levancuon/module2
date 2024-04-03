import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class dieuKien {

    public static void main(String[] args) {
        //bài 1
//        int a = 10;
//        int b = 6;
//        if (a % b == 0) {
//            System.out.println("a chia hết cho b");
//        } else {
//            System.out.println("a ko chia hết cho b");
//        }
//    }

        //bài 2

       /* Scanner input = new Scanner(System.in);
        System.out.println("nhap so di: ");
        int a = input.nextInt();
        if (a < 15) {
            System.out.println("ko đủ tuổi học lớp 10");
        } else System.out.println("đủ tuổi học lớp 10");

        */
        //bai 3
        /*Scanner input = new Scanner(System.in);
        System.out.println("nhap so:");
        int a = input.nextInt();
        if (a>0){
            System.out.println("lon hon 0");
        } else if (a<0) {
            System.out.println("nho hon 0");
        } else System.out.println("bang 0");

         */

        //bai 4
        /*Scanner input = new Scanner(System.in);
        System.out.println("nhap so 3 so a,b,c:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a>b && a>c){
            System.out.println(a+" lon nhat");
        } else if (b>c){
            System.out.println(b+" lon nhat");
        } else System.out.println(c+" lon nhat");

         */

        //Bài 5: Xếp hạng học lực của học sinh dựa trên các điểm bài kiểm tra, điểm thi giữa kỳ, điểm thi cuối kỳ

        /*Scanner input = new Scanner(System.in);
        System.out.println("nhap diem kiemTra, giuaKy, cuoiKy");
        double kiemTra = input.nextInt();
        double giuaKy = input.nextInt();
        double cuoiKy = input.nextInt();
        double avr = (kiemTra*0.2)+(giuaKy*0.3)+(cuoiKy*0.5);
        if (avr<4){
            System.out.println("yeu");
        } else if(avr<7){
            System.out.println("trung binh");
        }else if ( avr < 8.5){
            System.out.println("kha");
        } else System.out.println("gioi");

         */

        //Bài 6:Tính hoa hồng nhận được tuỳ theo mức doanh số bán hàng
        /*Scanner input = new Scanner(System.in);
        System.out.println("nhap doanh so:");
        double doanhSo = input.nextInt();
        if (doanhSo>= 0 && doanhSo < 10){
            System.out.println("hoa hong bằng 0% doanh số = "+(doanhSo*10/100)+"VND");
        } else if (doanhSo >= 10 && doanhSo < 20) {
            System.out.println("hoa hong bằng 10% doanh số = "+ (doanhSo*20/100)+"VND");
        } else {
            System.out.println("hoa hồng bằng 20% doanh số = "+(doanhSo*20/100)+"VND");
        }

         */

        //Bài 1: Chuyển từ độ C sang độ F. °C  x  9/5 + 32 = °F
        /*Scanner input = new Scanner(System.in);
        System.out.println("nhập số độ C");
        double C = input.nextDouble();
        System.out.println(C+"C = "+" "+(C*9/5+32)+"F");

         */

        //Bài 2: Chuyển từ mét sang feet: ft =m * 3.2808
       /* Scanner input = new Scanner(System.in);
        System.out.println("nhập số m:");
        double meter = input.nextDouble();
        System.out.println(meter+"m ="+(meter*3.2)+"ft");
        */

        //Bài 3: Tính diện tích hình vuông khi biết cạnh a.
       /* Scanner input = new Scanner(System.in);
        System.out.println("nhập cạnh a:");
        double a = input.nextDouble();
        System.out.println("diện tích hình vuông = "+(a*a)+"m2");

        */

        //Bài 4: Tính diện tích hình  chữ nhật khi biết 02 cạnh a, b.
       /*Scanner input = new Scanner(System.in);
        System.out.println("nhập độ dài cạnh a và cạnh b");
        double a = input.nextDouble();
        double b = input.nextDouble();
        System.out.println("diện tích hình chữ nhật = "+(a*b)+"m2");

        */

        //Bài 5: Tính diện tích tam giác vuông khi biết 02 cạnh kề a, b.
        /*Scanner input = new Scanner(System.in);
        System.out.println("nhập độ dài 2 cạnh kề góc vuông a và b:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        System.out.println("diện tích tam giác vuông = "+(a*b*0.5)+"m2" );

         */


        //Bài 6: Giải phương trình bậc 1.
        /*Scanner input = new Scanner(System.in);
        System.out.println("nhập hệ số a,b :");
        double a = input.nextDouble();
        double b = input.nextDouble();
        if (a==0){
            System.out.println(" Phuong trinh vo nghiem");
        } else {
            System.out.println("x = "+(-b/a));
        }

         */

        //Bài 7: Giải phương trình bậc 2.
       /* Scanner input = new Scanner(System.in);
        System.out.println("nhap he so a,b,c");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double delta = (b*b)-(4*a*c);
        double sqrtDelta = Math.sqrt(delta);
        System.out.println(sqrtDelta);
        System.out.println(delta);
        if (delta <0 ){
            System.out.println("phuong trinh vo nghiem");
        } else if (delta == 0 ){
            System.out.println("phuong trinh co nghiem kep x1=x2=" + (-b/(2*a)));
        } else {
            System.out.println("phuong trinh co 2 nghiem x1 = "+(-b+sqrtDelta)/(2*a) + " x2 = "+((-b-sqrtDelta)/(2*a)));
        }

        */

        //Bài 8: Kiểm tra xem một số nhập vào có phải là tuổi của một người không. Một số nguyên là tuổi của một người khi nhỏ 120 và lơn hơn 0.
        /*Scanner input = new Scanner(System.in);
        System.out.println("nhap so tuoi");
        int age = input.nextInt();
        if(age>0 && age<120){
            System.out.println(age+" la so tuoi cua 1 nguoi");
        } else System.out.println(age+" ko phai la so tuoi cua 1 nguoi");

         */


        //Bài 9: Kiểm tra xem 3 số thực (a,b,c) nhập vào có phải là cạnh của một tam giác. Điều kiện để a,b,c là cạnh của một tam giác là:
        //a,b,c > 0
        //a + b > c
        //b + c > a
        //a + c > b


       /* Scanner input = new Scanner(System.in);
        System.out.println("nhap ba canh a,b,c");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if (a+b>c&&b+c>a&&a+c>b){
            System.out.println("a,b,c la 3 cạnh của 1 tam giac");
        } else {
            System.out.println("a,b,c ko phai la 3 canh của 1 tam giác");
        }

        */


        //Bài 10: Viết chương trình tính giá điện.
        /*Scanner input = new Scanner(System.in);
        System.out.println("nhập số chữ điện (kWh)đã sử dụng");
        double chuDien = input.nextDouble();
        double tienDien;
        if (chuDien>0 && chuDien<=50){
            System.out.println("tien diện = "+chuDien*1.806+"VND");
        } else if (chuDien>50&&chuDien<=100){
            tienDien = 50*1.806+(chuDien-50)*1.866;
            System.out.println("tien diện ="+tienDien);
        } else if(chuDien>100&&chuDien<200){
            tienDien = 50*1.806+50*1.866+(chuDien-100)*2.167;
            System.out.println("tien diện ="+tienDien);
        }

         */


        //Bài 11: Viết chương trình tính thuế thu nhập cá nhân.
        /*Scanner input = new Scanner(System.in);
        System.out.println("thu nhập cá nhân VND");
        double TN = input.nextDouble();
        double thue;
        if (TN <= 5000000) {
            thue = TN * 5 / 100;
            System.out.println("số tiền thuế phải đóng = " + thue + "VND");
        } else if (TN > 5000000 && TN <= 10000000 ) {
            thue = (TN * 10 / 100) - (0.25 * 1000000);
            System.out.println("số tiền thuế phải đóng = " + thue + "VND");
        } else if ( TN > 10000000 && TN <= 18000000) {
            thue = (TN * 15 / 100) - (0.75 * 1000000);
            System.out.println("số tiền thuế phải đóng = " + thue + "VND");
        }else if ( TN > 18000000 && TN <= 32000000) {
            thue = (TN * 20 / 100) - (1.65 * 1000000);
            System.out.println("số tiền thuế phải đóng = " + thue + "VND");
        }else if ( TN > 32000000 && TN <= 52000000) {
            thue = (TN * 25 / 100) - (3.25 * 1000000);
            System.out.println("số tiền thuế phải đóng = " + thue + "VND");
        }else if ( TN > 52000000 && TN <= 80000000) {
            thue = (TN * 30 / 100) - (5.85 * 1000000);
            System.out.println("số tiền thuế phải đóng = " + thue + "VND");
        }else  {
            thue = (TN * 35 / 100) - (9.85 * 1000000);
            System.out.println("số tiền thuế phải đóng = " + thue + "VND");
        }
        
         */



    }
}


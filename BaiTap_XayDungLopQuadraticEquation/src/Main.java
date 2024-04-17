import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap a");
        double a = input.nextDouble();
        System.out.println("nhap b");
        double b = input.nextDouble();
        System.out.println("nhap c");
        double c = input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant()<0){
            System.out.println("pt vo nghiem");
        }else if(quadraticEquation.getDiscriminant()==0){
            System.out.println("pt co 1 nghiem chung x1 = x2 = "+quadraticEquation.getRoot());
        } else  {
            System.out.println("pt co 2 nghiem x1 = "+quadraticEquation.getRoot1()+", x2 = "+quadraticEquation.getRoot2());
        }
    }
}
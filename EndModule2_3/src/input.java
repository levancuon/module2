import java.util.Scanner;

public class input {
    private static final Scanner string = new Scanner(System.in);
    private static final Scanner numberInteger = new Scanner(System.in);
    private static final Scanner numberDouble = new Scanner(System.in);
    public int getInt(){
        try{
        return Integer.parseInt(numberInteger.nextLine()) ;
        }catch (java.lang.Exception e){
            System.out.println("nhập số đê bitch");
            return getInt();
        }
    }





}

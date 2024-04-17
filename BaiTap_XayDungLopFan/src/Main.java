
public class Main {
    public static void main(String[] args) {
        Fan fan1 =new Fan();
        fan1 = new Fan(fan1.FAST, true,12,"red");
        System.out.println(fan1);
        Fan fan2 = new Fan();
        fan2 = new Fan(fan2.MEDIUM, false,56,"yellow");
        System.out.println(fan2);
    }
}
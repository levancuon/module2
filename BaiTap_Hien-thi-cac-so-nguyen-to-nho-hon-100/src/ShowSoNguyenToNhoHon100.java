public class ShowSoNguyenToNhoHon100 {
    public static void main(String[] args) {

        int num = 2;

        System.out.println("só nguyen to nho hơn 100:");

        while (num < 100) {
            if (isPrime(num)) {
                System.out.print(num + " ");

            }
            num++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;

        if (num % 2 == 0 || num % 3 == 0) return false;

        int i = 5;
        while (i * i <= num) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
            i += 6;
        }

        return true;
    }
}

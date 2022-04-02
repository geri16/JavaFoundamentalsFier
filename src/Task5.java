import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr = scanner.nextInt();
        for(int i = 1; i < nr; i++) {
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int number) {
        if(number == 1)
            return false;
        for(int j = 2; j < number; j++) {
            if (number % j == 0)
                return false;
        }
        return true;
    }
}
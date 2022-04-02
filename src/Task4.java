import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vendosni nje numer > 0: ");
        int userInput = scanner.nextInt();
        while(userInput < 0) {
            System.out.print("Vendosni nje numer > 0: ");
            userInput = scanner.nextInt();
        }


        for (int i = 1; i <= userInput; i++) {
            if ((i % 3 == 0) && (i % 7 == 0)) {
                System.out.println("Fizz Buz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 7 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}

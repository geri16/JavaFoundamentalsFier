import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vendos nje numer: ");
        int userInput = scanner.nextInt();
        while (userInput < 0){
            System.out.print("Vendos nje numer: ");
            userInput = scanner.nextInt();
        }

        int result = 0;
        while (userInput > 0) {
           result += userInput % 10;
           userInput /= 10;
        }

        System.out.print(result);

    }
}

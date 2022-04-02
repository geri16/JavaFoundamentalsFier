import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vendos nje numer: ");
        int userInput = scanner.nextInt();
        double sum = 0.0;

        for(int i = userInput; i > 0; i--){
            sum += (double)1/i;
        }

        //for(int i = 1; i <= userInput; i++){
        //    sum += (double)1 / i;
        //}

        System.out.println("Shuma: " + sum);
    }
}

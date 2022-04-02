import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] userInputArray = new int[10];
        for (int i = 0; i < userInputArray.length; i++) {
            System.out.print("Venods numer: ");
            userInputArray[i] = scanner.nextInt();
        }

        String listOfNumbers = "";
        for (int i = 0; i < userInputArray.length; i++) {
            for (int j = i+1; j < i+5; j++) {
                if (userInputArray[i] < userInputArray[j]) {
                    listOfNumbers += userInputArray[i];
                }
            }
        }
        System.out.println();


    }
}

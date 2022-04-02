import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String userInput = scanner.nextLine();
        String maxString = "";
        while (!userInput.equals("enough")) {

            if(userInput.isBlank()){
                System.out.println("No text provided// Enter text: ");
                userInput = scanner.nextLine();
            }

            if(userInput.length() > maxString.length() && !userInput.equals("enough")){
                maxString = userInput;
            }
            System.out.print("Enter text: ");
            userInput = scanner.nextLine();
        }

        if(!maxString.isBlank()){
            System.out.println("Teksti me i gjate: " + maxString);
        }

    }
}

import java.util.Scanner;

public class Task12 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String userInput = scanner.nextLine();

        int count = 0;

        char[] karakteret = userInput.toCharArray();
        for(char k : karakteret){
            if(Character.isSpaceChar(k)){
                count++;
            }
        }

        //menyra 2
        /*
        for(int i = 0; i < karakteret.length; i++){
            if (Character.isSpaceChar(karakteret[i])){
                count++;
            }
        }
         */

        //menyra3
        /*
        for(int i = 0; i < userInput.length(); i++){
            if(Character.isSpaceChar(userInput.charAt(i))){
                count++;
            }
        }
        */

        System.out.println("Numri i space: " + count);
        System.out.println("Numri i karaktereve: " + userInput.length());
        System.out.println("Perqindja: " + (((double)count / userInput.length()) * 100) + " %");

    }
}

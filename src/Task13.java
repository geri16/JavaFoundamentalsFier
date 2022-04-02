import java.util.Arrays;
import java.util.Scanner;

public class Task13 {

    static void printo(String str) {
        String[] arrayOfString = str.split(" ");
        for (String i : arrayOfString) {
            System.out.print(i + " " + i + " ");
        }
    }

    static void afisho(String str){
        String[] array = str.split(" ");
        String p = "";
        for(String i: array){
            p += (i + " ").repeat(2);
        }
        System.out.println(p);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String userInput = scanner.nextLine();

        printo(userInput);
        System.out.println();
        afisho(userInput);



//         for(String i: arrayOfString){
//            System.out.print(i + " " + i + " ");
//        }

//        for (int i = 0; i < arrayOfString.length; i++){
//            System.out.print(arrayOfString[i] + " " + arrayOfString[i] + " ");
//        }
        scanner.close();

    }
}

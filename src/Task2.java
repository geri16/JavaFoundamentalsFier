import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vendos peshen: ");
        float weight = scanner.nextFloat();
        System.out.print("Vendos gjatesine: ");
        int height = scanner.nextInt();
        //kthejme gjatesine ne metra
        double gjatesiaM = (double) height/100;

        double bmi = (weight / Math.pow(gjatesiaM, 2));

        //if (18.5 <= bmi <= 24.9)
          if((18.5 <= bmi) && (bmi <= 24.9)){
            System.out.println("BMI optimal\nBMI: " + bmi);
        } else {
            System.out.println("BMI not optimal\nBMI: " + bmi);
        }


    }
}

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nr 1: ");
        float num1 = scanner.nextFloat();
        System.out.print("Veprimi: ");
        char symbol = scanner.next().charAt(0);
        System.out.print("Nr 2: ");
        float num2 = scanner.nextFloat();

        while(Character.compare(symbol, '/') == 0 && num2 == 0) {
            System.out.println("Numri 2 nuk mund te jete 0: ");
            num2 = scanner.nextFloat();
        }

        switch(symbol){
            case '+':
                System.out.println("Shuma: " + llogaritShuma(num1, num2));
                break;
            case '-':
                System.out.println("Diferenca: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Shumezimi: " + (num1 * num2));
                break;
            case '/':
                System.out.println("Pjesetimi: " + (num1 / num2));
                break;
            default:
                System.out.println("Invalid symbol");
        }

    }


    static float llogaritShuma(float n1, float n2){
        return n1 + n2;
    }

}

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.print("Vendos nr e pare: ");
        a = scanner.nextInt();
        System.out.print("Vendos nr e dyte: ");
        b = scanner.nextInt();
        System.out.print("Vendos nr e trete: ");
        c = scanner.nextInt();

        double delta = Math.pow(b, 2) - (4 * a * c);
        if(delta < 0){
            System.out.println(delta + "\nDelta negative");
            System.exit(0);
        }

        double x1, x2;
        x1 = ((-b) - (Math.sqrt(delta)) / (2 * a));
        x2 = ((-b) + (Math.sqrt(delta)) / (2 * a));

        System.out.println("X1: " + x1);
        System.out.println("X2: " + x2);


    }
}

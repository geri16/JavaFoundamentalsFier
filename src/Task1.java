import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vendos diametrin: ");
        float diameter = scanner.nextFloat();



        System.out.println("Perimetri : " + Math.PI * diameter);
        float rreze = diameter / 2;
        System.out.println("Siperfaqja: " + Math.PI * rreze * rreze);

    }
}

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vendos nje numer: ");
        int userInput = scanner.nextInt();

        int pozicioni = 1;
        int nrAktual = 1;
        int nrParaardhes = 0;
        int nrFib = 0;

        while(pozicioni < userInput){
            nrFib = nrAktual + nrParaardhes;
            nrParaardhes = nrAktual;
            nrAktual = nrFib;

            pozicioni++;
            System.out.print(nrAktual + " ");
        }


        System.out.println("\nNr Fibonaci: " + nrFib);
    }
}

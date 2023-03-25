import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int evenCount = 0;
        int oddCount = 0;
        int totalCumulative = 0;
        int lastNumber = 0;
        int sameNumberCount = 0;

        System.out.print("Digite a sequência de números inteiros: ");
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            min = Math.min(min, n);
            max = Math.max(max, n);
            if (n % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            totalCumulative += n;
            if (lastNumber == n) {
                sameNumberCount++;
            }
            else if (sameNumberCount > 0) {
                System.out.println(lastNumber + " (apareceu " + sameNumberCount + " vezes)");
                sameNumberCount = 0;
            }
            lastNumber = n;
        }
        scanner.close();

        if (sameNumberCount > 0) {
            System.out.println(lastNumber + " (apareceu " + sameNumberCount + " vezes)");
        }

        System.out.println("Menor: " + min);
        System.out.println("Maior: " + max);
        System.out.println("Pares: " + evenCount);
        System.out.println("Ímpares: " + oddCount);
        System.out.println("Total cumulativo: " + totalCumulative);
    }
}
import java.util.Scanner;

public class EXercicio10 {
    public static void main(String[] args) {
        //a) A soma de todos os números pares entre 2 e 100 (inclusive).
        int somaPares = 0;
        for (int i = 2; i <= 100; i += 2) {
            somaPares += i;
        }
        System.out.println("A soma de todos os números pares entre 2 e 100 é: " + somaPares);

        //b) A soma de todos os quadrados entre 1 e 100 (inclusive).
        int somaQuadrados = 0;
        for (int i = 1; i <= 100; i++) {
            somaQuadrados += i * i;
        }
        System.out.println("A soma de todos os quadrados entre 1 e 100 é: " + somaQuadrados);

        //c) Todas as potências de 2 de 2^0 até 22^0
        System.out.println("Todos as potências de 2 são:");
        for (int i = 0; i <= 20; i++) {
            System.out.println("2^" + i + " = " + Math.pow(2, i));
        }

        //d) A soma de todos os números ímpares entre a e b (inclusive), onde a e b são entradas.
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor de 'a':");
        int a = scan.nextInt();
        System.out.println("Digite o valor de 'b':");
        int b = scan.nextInt();
        int somaImpares = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                somaImpares += i;
            }
        }
        System.out.println("A soma de todos os números ímpares entre " + a + " e " + b + " é: " + somaImpares);

        //e) A soma de todos os dígitos ímpares de uma entrada. (Por exemplo, se a entrada for 32677, a
        //soma seria 3 + 7 + 7 = 17.)
        System.out.println("Digite o número para calcular a soma dos dígitos ímpares:");
        int numero = scan.nextInt();
        int somaDigitosImpares = 0;
        while (numero > 0) {
            int digito = numero % 10;
            if (digito % 2 != 0) {
                somaDigitosImpares += digito;
            }
            numero /= 10;
        }
        System.out.println("A soma dos dígitos ímpares é: " + somaDigitosImpares);
    }
}
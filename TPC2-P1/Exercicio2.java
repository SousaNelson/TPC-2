public class Exercicio2 {
    public static void main(String[] args) {
        // a) A soma de todos os números pares entre 2 e 100 (inclusive).
        int somaPares = 0;
        for (int i = 2; i <= 100; i += 2) {
            somaPares += i;
        }
        System.out.println("Soma dos números pares entre 2 e 100: " + somaPares);

        // b) A soma de todos os quadrados entre 1 e 100 (inclusive).
        int somaQuadrados = 0;
        for (int i = 1; i <= 100; i++) {
            somaQuadrados += i * i;
        }
        System.out.println("Soma dos quadrados entre 1 e 100: " + somaQuadrados);

        // c) A soma de todos os números ímpares entre a e b (inclusive).
        // Supondo que a e b sejam variáveis do tipo inteiro
        int a = 5;
        int b = 15;
        int somaImpares = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                somaImpares += i;
            }
        }
        System.out.println("Soma dos números ímpares entre " + a + " e " + b + ": " + somaImpares);

        // d) A soma de todos os dígitos ímpares de n. (Por exemplo, se n é 32677, a soma seria 3 + 7 + 7= 17.)
        int n = 32677;
        int somaDigitosImpares = 0;
        while (n > 0) {
            int digitoAtual = n % 10;
            if (digitoAtual % 2 != 0) {
                somaDigitosImpares += digitoAtual;
            }
            n /= 10;
        }
        System.out.println("Soma dos dígitos ímpares de " + 32677 + ": " + somaDigitosImpares);
    }
}


import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma linha de entrada: ");
        String str = scanner.nextLine();

        // Apenas letras maiúsculas
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i)))
                result += str.charAt(i);
        }
        System.out.println("Apenas letras maiúsculas: " + result);

        // Cada segunda letra da string
        result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result += str.charAt(i);
        }
        System.out.println("Cada segunda letra da string: " + result);

        // Substituir vogais por sublinhado
        result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                result += '_';
            } else {
                result += c;
            }
        }
        System.out.println("String com vogais substituídas: " + result);

        // Número de vogais
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                count++;
            }
        }
        System.out.println("Número de vogais: " + count);

        // Posições de vogais
        result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                result += i + " ";
            }
        }
        System.out.println("Posições de vogais: " + result);
    }
}
import java.util.Scanner;
public class Main {

            public static void main(String[] args) {
                int n;
                Scanner lerInput = new Scanner(System.in);
                System.out.println("Digite um nmr: ");
                n= lerInput.nextInt();

                //a) Todos os quadrados menores que n.
                int j = 0;
                System.out.print("Números à potência de quadrado: ");
                while (j*j < n) {
                    System.out.print(j*j + " ");
                    j++;
                }
                System.out.println();
                //b)Todos os números positivos que são divisíveis por 10 e menores que n.
                int k = 1;
                System.out.print("Números divisíveis por 10: ");
                while (k*10 < n) {
                    System.out.print(k*10 + " ");
                    k++;
                }
                System.out.println();
                //c) Todas as potências de dois menos que n.
                int i = 0;
                System.out.print("Números à potência de 2: ");
                while (Math.pow(2, i) < n) {
                    System.out.print(Math.pow(2, i) + " ");
                    i++;
                }

            }
        }


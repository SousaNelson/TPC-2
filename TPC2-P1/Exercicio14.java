import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        int opcao = 0;
        int sumo = 0;
        int bolo = 0;
        int chocolate = 0;
        int batatasFritas = 0;

        Scanner scanner = new Scanner(System.in);

        while (opcao != 6) {
            System.out.println("\nEscolha uma opcao: ");
            System.out.println("1 - Sumo");
            System.out.println("2 - Bolo");
            System.out.println("3 - Chocolate");
            System.out.println("4 - Batatas Fritas");
            System.out.println("5 - Total a pagar");
            System.out.println("6 - Sair\n");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Aqui está seu sumo.");
                    sumo++;
                    break;
                case 2:
                    System.out.println("Aqui está seu bolo.");
                    bolo++;
                    break;
                case 3:
                    System.out.println("Aqui está seu chocolate.");
                    chocolate++;
                    break;
                case 4:
                    System.out.println("Aqui está suas batatas fritas.");
                    batatasFritas++;
                    break;
                case 5:
                    System.out.println("\nItens comprados:");
                    System.out.println(sumo + " itens de Sumo");
                    System.out.println(bolo + " itens de Bolo");
                    System.out.println(chocolate + " itens de Chocolate");
                    System.out.println(batatasFritas + " itens de Batatas Fritas");
                    break;
                case 6:
                    System.out.println("Até logo!");
                    break;
                default:
                    System.out.println("Erro. Escolha uma opção de 1 a 6");
            }
        }
    }
}
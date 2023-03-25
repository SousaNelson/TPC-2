import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args) {
        double A;
        Scanner lerinput= new Scanner(System.in);
        System.out.println("Digite o valor de A");
        A=lerinput.nextDouble();
        double B;
        Scanner n= new Scanner(System.in);
        System.out.println("Digite o valor de B");
        B=n.nextDouble();
        double C;
        Scanner e= new Scanner(System.in);
        System.out.println("Digite o valor de C");
        C=e.nextDouble();
        double D;
        Scanner l= new Scanner(System.in);
        System.out.println("Digite o valor de D");
        D=l.nextDouble();
        double prey;
        Scanner s= new Scanner(System.in);
        System.out.println("Digite o valor de prey inicial");
        prey=s.nextDouble();
        double pred;
        Scanner o= new Scanner(System.in);
        System.out.println("Digite o valor de pred inicial");
        pred=o.nextDouble();
        double prey1, pred1=0;
        prey1 = prey*(1+A-B*pred);
        pred1 = pred*(1-C+D*prey);
        System.out.println("O nº de presas são "+prey1);
        System.out.println("O nº de predadores são "+pred1);

    }
}
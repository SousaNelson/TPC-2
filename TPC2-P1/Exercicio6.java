import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        double x = 0;
        double s = 1.0 / (1 + n * n);
        while (s > 0.01) {
            x = x + s;
            n++;
            s = 1.0 / (1 + n * n);
        }
    }
}

public class Exercicio8 {
    public static void main(String[] args) {
        //a)
        int n = 1;
        for (int i =2; i <5; i++) {n = n + i;}
        System.out.println(n);

        //b)
        int i;
        double s = 1 / 2;
        for (i = 2; i <= 5; i++) {s = s+ 1.0 / i;}
        System.out.println(i);

        //c)
        double x=1;
        double y = 1;
        int z =0;
        do{
            y = y / 2;
            x = x + y;
            z ++;
        }
        while (x < 1.8);
        System.out.println(z);

        //d)
        double a = 1;
        double b = 1;
        int c = 0;
        while ( b >= 1.5)
        {
            a = a / 2;
            b = a + b;
            c++;
        }
        System.out.println(c);
    }
}
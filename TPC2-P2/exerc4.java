public class exerc4 {
    public static void main(String[] args) {

        int i = 0;
        int[] array = new int[5];
        int valor = 2;

        System.out.println("Printing prime numbers!");
        for (int num = 11; num >= valor; num--) {
            if (numeroPrimo(num)) {
                array[i] = num;
                i++;
            }
        }

        /* apenas para verificar os numeros primos dentro do array */
        System.out.println("Os numeros primos são");
        for(i = 0;i < array.length;i++){
            System.out.print(array[i] + " ");
        }
    }

    public static boolean numeroPrimo(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
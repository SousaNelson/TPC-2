public class exerc3 {
    public static void main(String[] args) {
        int i = 0;
        int[] arrayPrimos = new int[5];
        int valor = 11;

        for (int num = 2; num <= valor; num++) {
            // vai colocar os numeros dentro do array
            if (numeroPrimo(num)) {
                arrayPrimos[i] = num;
                i++;
            }
        }

        /* apenas para verificar os numeros primos dentro do array */
        System.out.println("Os numeros primos são");
        for(i = 0;i < arrayPrimos.length;i++){
            System.out.print(arrayPrimos[i] + " ");
        }

    }

    public static boolean numeroPrimo(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false; // se o numero for divisvel por outro numero entao significa que nao pode ser primo
            }
        }
        return true; // se nao entao é primo
    }

}
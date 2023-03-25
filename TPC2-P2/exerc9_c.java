import java.util.Random;

public class exerc9_c {
    public static void main(String[] args){

        int array[] = new int[]{1, -7, -9, -2, 2, 5, 8, 2, -1};
        int contarnegativos=0;
        for(int i :array){
            if (i<0){
                contarnegativos++;
            }
        }
            System.out.print("Existem "+contarnegativos+ " negativos no array");

    }
}

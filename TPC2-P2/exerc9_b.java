import java.util.Random;

public class exerc9_b {
    public static void main(String[] args){
        int total = 1;
        int array[] = new int[]{1, 2, 4, 2, 1};
        for(int i:array ){
            total*=i;
        }
        System.out.print("O produto dos elementos é  = " + total);
    }
}

import java.util.Random;
public class exerc9_a {
    public static void main(String[] args){
        Random random = new Random();
        int array[] = new int[10];
        for(int i = 1; i < array.length;i++){
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
    }
}

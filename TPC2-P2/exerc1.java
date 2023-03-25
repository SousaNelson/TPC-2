
public class exerc1{
    public static void main(String[] args){
        int[][] board = new int[8][8];
        int i = 0;
        int j = 0;
        for(i = 0;i < 8;i++){
            for(j = 0;j < 4;j++){
                if(i%2 == 0){
                    board[i][j] = 0;
                    System.out.print(board[i][j]);
                    board[i][j] = 1;
                    System.out.print(board[i][j]);
                }
                else{
                    board[i][j] = 1;
                    System.out.print(board[i][j]);
                    board[i][j] = 0;
                    System.out.print(board[i][j]);
                }
            }
            System.out.println(" ");
        }
    }
}



    public class exerc2 {
        public static void main(String[] args){
            String[][] ff = {{"x", "o", "o"}, {"o", "x", "o"}, {"o", "o", "x"},{"", "", ""}};
            int i = 0;
            int j = 0;
            for(i = 0;i < 3;i++){
                for(j = 0;j < 3;j++){

                    System.out.print(ff[i][j]);
                }
                System.out.println("");
            }
        }
    }

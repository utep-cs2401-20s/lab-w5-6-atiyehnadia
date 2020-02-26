public class SnakeGame {
    private boolean [][] game;
    private int [] headPosition;
    private static int exhaustiveChecks;
    private static int recursiveChecks;

    public static void main (String [] args){
        boolean [][] lol = {{false, true , false},
                            {true, true, true},
                            {false, true, false}};
        SnakeGame SG1 = new SnakeGame(lol, 0,0);
        SG1.snakeNeighbors(0,0);

    }

    public SnakeGame(){
        game = new boolean[1][1];

    }
    public SnakeGame(boolean [][] g, int x, int y){
        game = new boolean[g.length][g.length];
        headPosition = new int[2];
        headPosition[0] = x;
        headPosition[1] = y;

        for(int i = 0; i < game.length; i++){
            for(int j = 0; j < game[i].length; j++){
                game[i][j] = g[i][j];
            }
        }
    }

    public int[] findTailExhaustive(){
        int length = 0;
        boolean isSnake = true;
        for(int i = 0; i < game.length; i++ ){
            for (int j = 0; j< game.length; j++){
                if(game[i][j] == isSnake){
                    snakeNeighbors(i,j);
                    length++;
                    exhaustiveChecks++;

                }
                if(game[i][j] == !isSnake){
                    exhaustiveChecks++;
                }
            }
        }

        return headPosition;

    }

    public int snakeNeighbors(int row, int col){
        int snakeyBois = 0;
        boolean isSnake = true;
        for(int i = row-1; i <= row +1; i++){
            if(i >= 0 && i <= game.length && i != row){
                if(game[i][col] == isSnake){
                    snakeyBois++;
                }
            }
        }
        //System.out.println(snakeyBois);
        for (int j = col - 1; j <= col + 1; j++) {
            if (j >= 0 && j <= game[0].length && j!= col) {
                if (game[row][j] == isSnake) {
                    snakeyBois++;
                    //System.out.println(snakeyBois);
                }
            }
        }
        System.out.println(snakeyBois);
        return snakeyBois;
    }



//    public int snakeNeighbors(int row, int col){
//        int snakeyBois = 0;
//        boolean isSnake = true;
//        for(int i = 0; i < game.length; i++){
//            for(int j = 0; j < game[i].length; j++){
//                if (i >= 0 && i <= game.length) {
//                    if (j >= 0 && j <= game[i].length) {
//                        if (game[i][j] == isSnake) {
//                            if (i != row || j != col) {
//                                snakeyBois++;
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println(snakeyBois);
//        return snakeyBois;
//    }


}

public class SnakeGame {
    private boolean [][] game;
    private int [] headPosition;
    private static int exhaustiveChecks;
    private static int recursiveChecks;

    public static void main (String [] args){

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
        boolean isSnake;
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

    }

    public int snakeNeighbors(int row, int col){
        int snakeyBois = 0;
        boolean isSnake;
        for(int i = row ; i <= game.length; i++){
            for(int j = col ; j <= game[i].length; j++){
                if(game[i][j] == isSnake){
                    if(i != row || j != col){
                        snakeyBois++;
                    }
                }

            }
        }
        return snakeyBois;
    }


}

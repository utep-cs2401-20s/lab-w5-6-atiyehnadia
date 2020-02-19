public class SnakeGame {
    private boolean [][] game;
    private int [] headPosition;
    private static int exhaustiveChecks;
    private static int recursiveChecks;

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
                   length++;
                   exhaustiveChecks++;

                }
                if(game[i][j] == !isSnake){
                    exhaustiveChecks++;
                }
            }
        }

    }

    public int snakeNeighbors(){
        int snakeyBois = 0;
        boolean isSnake;
            for (int i = 0; i <= row + 1; i++) {
                for (int j = col - 1; j <= col + 1; j++) {
                    if (i >= 0 && i < previous.length) {
                        if (j >= 0 && j < previous[i].length) {
                            if (previous[i][j] == alive) {
                                if (i != row || j != col) {
                                    aliveNeighbors++;
                                }
                            }
                        }
                    }
                }
            }
            return aliveNeighbors;
    }


}

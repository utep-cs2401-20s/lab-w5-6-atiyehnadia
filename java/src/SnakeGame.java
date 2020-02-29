import java.util.Arrays;

public class SnakeGame {
    private boolean [][] game;
    private int [] headPosition;
    private static int exhaustiveChecks;
    private static int recursiveChecks;

    public SnakeGame(){
        game = new boolean[1][1];
    }

    public static int getExhaustiveChecks(){
        return exhaustiveChecks;
    }

    public static int getRecursiveChecks(){
        return recursiveChecks;
    }

    private void resetCounters(){
        exhaustiveChecks = 0;
        recursiveChecks = 0;
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
        int [] snakeTail = {-1,-1,0};
        int [] tailPos = new int [3];
        int snakeLength = 0;
        boolean isSnake = true;
        int snakeyBois = 0;
        for(int i = 0; i < game.length ; i++ ) {
            for (int j = 0; j < game[i].length; j++) {
                exhaustiveChecks++;
                snakeyBois = snakeNeighbors(i, j);
                if (game[i][j] == isSnake) {
                    snakeLength++;
                    if ((snakeyBois == 1) && ((i != headPosition[0]) && (j != headPosition[1]))) {
                        snakeTail[0] = i;
                        snakeTail[1] = j;
                    }
                }
            }
        }
        snakeTail[2] = snakeLength;
        System.out.println(snakeTail[1]);
        resetCounters();
        return snakeTail;
    }


    public int snakeNeighbors(int row, int col){
        int snakeyBois = 0;
        boolean isSnake = true;
        for(int i = row-1; i <= row +1; i++){
            if(i >= 0 && i <= game.length - 1 && i != row){
                if(game[i][col] == isSnake){
                    snakeyBois++;
                }
            }
        }
        for (int j = col - 1; j <= col + 1; j++) {
            if (j >= 0 && j <= game[0].length - 1 && j!= col) {
                if (game[row][j] == isSnake) {
                    snakeyBois++;
                }
            }
        }
        return snakeyBois;
    }

    public int[] findTailRecursive(){
        return findTailRecursive(headPosition, headPosition);

    }



    public int[] findTailRecursive(int [] currentPosition, int [] previousPosition){
        int snakeyBois = 0;
        int snakeLength = 0;
        boolean isSnake = true;
        int [] snakeTail = {0,0,0};
        int [] newSnakePosition = new int [2];
        snakeyBois = snakeNeighbors(currentPosition[0], currentPosition[1]);
        if((currentPosition[0] == headPosition[0]) && (currentPosition[1] != headPosition[1])){
            if(snakeyBois == 1){
                recursiveChecks++;
                return currentPosition;
            }
        }
        // up
        if(currentPosition[0] - 1  >= 0 && game[currentPosition[0] - 1][currentPosition[1]] && (currentPosition[0] -1 != previousPosition[0])){
            snakeLength++;
            newSnakePosition[0] = currentPosition[0] - 1;
            newSnakePosition[1] = currentPosition[1];
            recursiveChecks++;
            return findTailRecursive(newSnakePosition, currentPosition);
        }
        // down
        else if(currentPosition[0] + 1 < game.length && (game[currentPosition[0] + 1][currentPosition[1]]) && (currentPosition[0] + 1 != previousPosition[0])){
            snakeLength++;
            newSnakePosition[0] = currentPosition[0] + 1;
            newSnakePosition[1] = currentPosition[1];
            recursiveChecks++;
            return findTailRecursive(newSnakePosition, currentPosition);
        }
        // right
        else if(currentPosition[1] + 1 < game.length && game[currentPosition[0]][currentPosition[1] + 1] && (currentPosition[1] + 1 != previousPosition[1])){
            snakeLength++;
            newSnakePosition[0] = currentPosition[0];
            newSnakePosition[1] = currentPosition[1] + 1;
            recursiveChecks++;
            return findTailRecursive(newSnakePosition, currentPosition);
        }
        //left
        else if(currentPosition[1] - 1 >= 0 && (game[currentPosition[0]][currentPosition[1] -1]) && (currentPosition[1]- 1 != previousPosition[1])){
            snakeLength++;
            newSnakePosition[0] = currentPosition[0];
            newSnakePosition[1] = currentPosition[1] - 1;
            recursiveChecks++;
            return findTailRecursive(newSnakePosition, currentPosition);
        }

        snakeTail[0] = currentPosition[0];
        snakeTail[1] = currentPosition[1];

        for(int i = 0; i < game.length; i++){
            for(int j = 0; j < game[i].length; j++){
                if(game[i][j] == isSnake){
                    snakeLength++;
                }
            }
        }
        snakeTail[2] = snakeLength;
        resetCounters();
        return snakeTail;
    }


    public void printBoard(){
        for(boolean[] i : game){
            System.out.println(Arrays.toString(i));
        }
    }
}


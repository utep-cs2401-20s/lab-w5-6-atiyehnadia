import java.util.Arrays;

public class SnakeGame {
    private boolean [][] game;
    private int [] headPosition;
    private static int exhaustiveChecks;
    private static int recursiveChecks;

    public static void main (String [] args){
        boolean [][] lol =  {{true, true, true, true, true},
                {false, false, true, false, true},
                {true, true, true, false, true},
                {true, false, false, false, true},
                {true, true, true, true, true}};
        SnakeGame SG1 = new SnakeGame(lol, 0,0);
        SG1.printBoard();
        //SG1.snakeNeighbors(1,1);
        SG1.findTailExhaustive();
//        SG1.findTailRecursive();

    }

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
        resetCounters();
        int snakeLength = 0;
        boolean isSnake = true;
        int snakeyBois = 0;
        for(int i = 0; i < game.length; i++ ){
            for (int j = 0; j < game[i].length; j++){
                if(game[i][j] == isSnake){
                    snakeyBois += snakeNeighbors(i,j);
                    if(snakeyBois == 1){
                        exhaustiveChecks++;
                        snakeLength = 1;
                        headPosition[0] = i;
                        headPosition[1] = j;
                    }
                    if(snakeyBois >= 2){
                        exhaustiveChecks++;
                        snakeLength++;
                        // TO - DO get the last tail position to the last true it traces on the snake
                        headPosition[0] = i ;
                        headPosition[1] = j;
                    }
                }
                if(game[i][j] == !isSnake){
                    exhaustiveChecks++;
                }
            }
        }

        System.out.println(snakeLength);
        System.out.print(headPosition[0] + "," + headPosition[1]);
        return headPosition;

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

//    public int[] findTailRecursive(){
//        return findTailRecursive(headPosition, headPosition);
//    }

//    public int[] findTailRecursive(int [] currentPosition, int [] previousPosition){
//        resetCounters();
//        int snakeLength = 0;
//        boolean isSnake = true;
//        int i = currentPosition[0];
//        int j = currentPosition[1];
//        int k = previousPosition[0];
//        int l = previousPosition[1];
//
//        //up
//        if((i >= 0) && (game[i +1][j] == isSnake) && ((i!=k )&& (j!=l))){
//            k = i;
//            l = j;
//            i = i + 1;
//            j = j;
//            recursiveChecks++;
//            snakeLength++;
//            return findTailRecursive(currentPosition,previousPosition);
//        }
//        //down
//        else if((i >= 0 && i <= game.length - 1) && (i!= k) && (j!=l)){
//            if((game[i-1][j] == isSnake)){
//                k = i;
//                l = j;
//                i = i - 1;
//                j = j;
//                recursiveChecks++;
//                snakeLength++;
//
//                return findTailRecursive(currentPosition,previousPosition);
//            }
//        }
//        //right
//        else if((j >= 0) && (game[i][j+1] == isSnake) && ((i!= k) && (j!= l))){
//            k = i;
//            l = j;
//            i = i;
//            j = j + 1;
//            recursiveChecks++;
//            snakeLength++;
//
//            return findTailRecursive(currentPosition,previousPosition);
//        }
//
//        //left
//        else if((j >= 0 && i <= game[0].length - 1) && (i!= k) && (j!=l)){
//            if((game[i][j-1] == isSnake)){
//                k = i;
//                l = j;
//                i = i;
//                j = j - 1;
//                recursiveChecks++;
//                snakeLength++;
//
//                return findTailRecursive(currentPosition,previousPosition);
//            }
//        }
//        return currentPosition;
//    }

    public void printBoard(){
        for(boolean[] i : game){
            System.out.println(Arrays.toString(i));
        }
    }
}


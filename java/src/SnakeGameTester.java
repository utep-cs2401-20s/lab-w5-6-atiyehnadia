import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SnakeGameTester {
//    @Test
//    public void testFindTailExauhstive1(){
//        // Tests the method with normal outputs that should give the tail position of the snake
//        // Assumes the board is square and the head position is at the starting postion of the array(0,0)
//        boolean [][] A = {{true, true, true, true, true},
//                          {false, false, false, false, true},
//                          {true, true, true, true, true},
//                          {true, false, false, false, false},
//                          {true, true, true, true, true}};
//        SnakeGame sol = new SnakeGame(A,0,0);
//        // expected output --> {4,4} and a length of 17 which is printed as the method is done looping
//        int[] B = {4,4};
//        assertArrayEquals(B, sol.findTailExhaustive());
//    }
//
//    @Test
//    public void testFindTailExauhstive2(){
//        // Tests the method with normal inputs that should give the tail position of the snake
//        // Assumes the board is square and the head position is at a different starting point in the array (1,4)
//        // and that it has neighbors before the starting point.
//        boolean [][] A = {{true, true, true, true, true},
//                          {false, false, false, false, true},
//                          {true, true, true, true, true},
//                          {true, false, false, false, false},
//                          {true, true, true, true, true}};
//        SnakeGame sol = new SnakeGame(A,1,4);
//        // expected output --> {4,4} and a length of 17 since the snake is starts before the starting point that is being evaluated
//        int[] B = {4,4};
//        assertArrayEquals(B, sol.findTailExhaustive());
//        //Shows us that the program needs to be modified to handle a case where the point in the snake that is being looked at is not the head position
//        // and identifies the head and tail positions in this case.
//    }
//    @Test
//    public void testFindTailExauhstive3(){
//        // Tests the method with normal inputs that should give the tail position of the snake
//        // Assumes the board is square and the head position is at the start of the array (0,0)
//        // and that the tail of the snake hits another part of the snake
//        boolean [][] A = {{true, true, true, true, true},
//                          {false, false, true, false, true},
//                          {true, true, true, false, true},
//                          {true, false, false, false, true},
//                          {true, true, true, true, true}};
//        SnakeGame sol = new SnakeGame(A,0,0);
//        // expected output --> {2,2} and a length of 19 since the snake is starts before the starting point that is being evaluated
//        // *expected to fail*
//        int[] B = {2,2};
//        assertArrayEquals(B, sol.findTailExhaustive());
//        //Shows us that the program needs to be able to handle a case where if the tail position hits another part of the
//        //snake it will return the last position it was true.
//    }
//    @Test
//    public void testFindTailExauhstive4(){
//        // Tests the method with normal inputs that should give the tail position of the snake
//        // Assumes the board is square and the head position is at starting position in array(0,0)
//        // and that the board has multiple snakes that have various different tail positions
//        boolean [][] A = {{true, true, true, true, true, true, true, true},
//                          {false, false, false, false, false, false, false, false},
//                          {true, true, true, true, true, false, false, false},
//                          {true, false, false, false, false, false, false, false},
//                          {true, true, true, true, true, true, true, true},
//                          {false, false, false, false, false, false, false, false},
//                          {true, true, true, true, true ,true, true, false},
//                          {false, false, false, false, false, true, false, false}};
//        SnakeGame sol = new SnakeGame(A,0,0);
//        // expected output --> {0,4} and a length of 8 since the snake that is being evaluated has a starting head position at (0,0)
//        // and should only take that snake and give the tail position of that specific snake
//        // expected to fail
//        int[] B = {0,7};
//        assertArrayEquals(B, sol.findTailExhaustive());
//        //Shows us that the program needs to be modified to be able to handle more than one snake, or needs to specify to the user
//        // that only one continuous snake can be used to play the game.
//    }
//
//    @Test
//    //EDGE CASE
//    public void testFindTailExauhstive5() {
//        // Tests the method with abnormal inputs that should not give the tail position of the snake
//        // Assumes the board is not square and the head position is at the starting point (0,0)
//        // Tests with ragged Array, and with neighbors in the space where there is supposed to be a gap
//        boolean[][] A = {{true, true, true, true, true},
//                         {false, false, true, false},
//                         {true, true, true, true},
//                         {true, false, false, false, false},
//                         {true, true, true}};
//        SnakeGame sol = new SnakeGame(A, 1, 4);
//        // expected output --> {0,4} and a length of 5 since the snake has multiple snakes within the array and the one being evaluated is the first one
//        // *expected to fail with OutOfBoundsExcpetion*
//        int[] B = {0, 4};
//        fail();
//        //Shows us that the program needs to be modified to handle a case the array is ragged, and/or needs to inform the user that an input such as this will not work
//        // Also shows us that in order for the game to work properly there must be a one cell gap between each row of snake
//    }
//
//    @Test
//    //EDGE CASE
//    public void testFindTailExauhstive5() {
//        // Tests the method with abnormal inputs that should not give the tail position of the snake
//        // Assumes the board is not square and the head position is at the starting point (0,0)
//        // Tests with ragged Array, and with neighbors in the space where there is supposed to be a gap
//        boolean[][] A = {{true, true, true, true, true},
//                {false, false, true, false},
//                {true, true, true, true},
//                {true, false, false, false, false},
//                {true, true, true}};
//        SnakeGame sol = new SnakeGame(A, 1, 4);
//        // expected output --> {0,4} and a length of 5 since the snake has multiple snakes within the array and the one being evaluated is the first one
//        // *expected to fail with OutOfBoundsExcpetion*
//        int[] B = {0, 4};
//        fail();
//        //Shows us that the program needs to be modified to handle a case the array is ragged, and/or needs to inform the user that an input such as this will not work
//        // Also shows us that in order for the game to work properly there must be a one cell gap between each row of snake
//    }


}

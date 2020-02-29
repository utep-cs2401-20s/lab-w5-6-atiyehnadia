import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SnakeGameTester {
    /* Exhaustive Method */
    @Test
    public void testFindTailExauhstive1(){
        // Tests the method with normal inputs that should give the tail position of the snake
        // Assumes the board is square and the head position is at the starting position of the array(0,0)
        boolean [][] A = {{true, true, true, true, true},
                          {false, false, false, false, true},
                          {true, true, true, true, true},
                          {true, false, false, false, false},
                          {true, true, true, true, true}};
        SnakeGame sol = new SnakeGame(A,0,0);
        // expected output --> {4,4} and a length of 17
        int [] B = {4,4,17};
        assertArrayEquals(B, sol.findTailExhaustive());
    }

    @Test
    public void testFindTailExauhstive2(){
        // Tests the method with normal inputs that should give the tail position of the snake
        // Assumes the board is square and the head position is at a different starting point in the array (1,3).
        boolean [][] A = {{false, false, false, false, false},
                          {false, false, false, true, false},
                          {true, true, true, true, false},
                          {true, false, false, false, false},
                          {true, true, true, true, true}};
        SnakeGame sol = new SnakeGame(A,1,3);
        // expected output --> {4,4} and a length of 11
        int[] B = {4,4,11};
        assertArrayEquals(B, sol.findTailExhaustive());
        // Shows that even if the head position is not at the starting position of the array it will still find the length and tail position of the snake
    }
    @Test
    public void testFindTailExauhstive3(){
        // Tests the method with normal inputs that should give the tail position of the snake
        // Assumes the board is square and the head position is at the start of the array (0,0)
        // and that the tail of the snake hits another part of the snake
        boolean [][] A = {{true, true, true, true, true},
                          {false, false, false, false, true},
                          {true, true, true, true, true},
                          {true, false, false, false, true},
                          {true, true, true, true, true}};
        SnakeGame sol = new SnakeGame(A,0,0);
        // expected output --> {-1,-1} and a length of 18
        int[] B = {-1,-1,18};
        assertArrayEquals(B, sol.findTailExhaustive());
        //Shows us that the method is able to handle the rules of the game, so that if the tail hits another part of the snake it will
        //default to the initialization of the array that the method returns
    }
    @Test
    public void testFindTailExauhstive4(){
        // Tests the method with normal inputs that should give the tail position of the snake
        // Assumes the board is square and the head position is at starting position in array(0,0),
        // tests it with a slightly bigger more complex board
        boolean [][] A = {{true, false, true, true, true, false, false, false, false, false},
                          {true, false, true, false, true, false, false, false, true, true},
                          {true, false, true, false, true, false, false, false, true, false},
                          {true, false, true, false, true, false, false, false, true, false},
                          {true, false, true, false, true, false, false, false, true, false},
                          {true, false, true, false, true, false, true, true, true, false},
                          {true, false, true, false, true, false, true, false, false, false},
                          {true, false, true, false, true, false, true, false, false, false},
                          {true, false, true, false, true, false, true, false, false, false},
                          {true, true, true, false, true, true, true, false, false, false}};

        SnakeGame sol = new SnakeGame(A,0,0);
        // expected output --> {1,9} and a length of 45
        int[] B = {1,9,45};
        assertArrayEquals(B, sol.findTailExhaustive());
    }

    @Test
    //EDGE CASE
    public void testFindTailExauhstive5() {
        // Tests the method with normal inputs that should give the tail position of the snake
        // Assumes the board is square and the head position is at the starting point (0,0)
        // Tests starting at position that is false
        boolean[][] A = {{true, true, true, true, true, true},
                         {false, false, false, false, false, true},
                         {false, false, false, false, false, true},
                         {false, false, false, false, false, true},
                         {false, false, false, false, false, true},
                         {false, false, false, true, true, true}};
        SnakeGame sol = new SnakeGame(A, 1, 0);
        // expected output --> {5, 3} and a length of 13
        int[] B = {5, 3, 13};
        assertArrayEquals(B, sol.findTailExhaustive());
        // Shows that even if the array starts evaluating from a false position it will still find the snake
        // and return the tail position
    }

    /* Recursive Method */

    @Test
    public void testFindTailRecursive1() {
        // Tests the method with normal inputs that should give the tail position of the snake
        // Assumes the board is square and the head position is at the starting point (0,0)
        boolean [][] A = {{true, true, true, true, true},
                          {false, false, false, false, true},
                          {true, true, true, true, true},
                          {true, false, false, false, false},
                          {true, true, true, true, true}};
        SnakeGame sol = new SnakeGame(A,0,0);
        // expected output --> {4,4} and a length of 17
        int [] C = {4,4,17};
        assertArrayEquals(C, sol.findTailRecursive());
    }

    @Test
    public void testFindTailRecursive2() {
        // Tests the method with normal inputs that should give the tail position of the snake
        // Assumes the board is square and the head position is at the starting point (1,2)
        // Tests starting at position that is false
        boolean[][] A = {{true, true, true, true, true},
                         {false, false, false, false, true},
                         {true, true, true, true, true},
                         {true, false, false, false, false},
                         {true, true, true, true, true}};
        SnakeGame sol = new SnakeGame(A, 1, 2);
        // expected output --> {4,4} and a length of 17
        int[] B = {4, 4, 17};
        assertArrayEquals(B, sol.findTailRecursive());
        //Shows that even if it starts evaluating at a position that is not true it will
        // still find the snake and return the tail position
    }

    @Test
    public void testFindTailRecursive3() {
        // Tests the method with normal inputs that should give the tail position of the snake
        // Assumes the board is square and the head position is at the starting point (4,4)
        // Test if the method works backwards
        boolean[][] A = {{true, true, true, true, true},
                         {false, false, false, false, true},
                         {true, true, true, true, true},
                         {true, false, false, false, false},
                         {true, true, true, true, true}};
        SnakeGame sol = new SnakeGame(A, 4, 4);
        // expected output --> {0,0} and a length of 17
        int[] B = {0, 0, 17};
        assertArrayEquals(B, sol.findTailRecursive());
        //Shows that even if it starts evaluating at a position that is not the start of the array it will still work
    }

    @Test
    public void testFindTailRecursive4() {
        // Tests the method with normal inputs that should give the tail position of the snake
        // Assumes the board is square and the head position is at the starting point (0,0)
        // Test if the method works with bigger more complex games
        boolean [][] A = {{true, false, true, true, true, false, true, true, true, false},
                          {true, false, true, false, true, false, true, false, true, false},
                          {true, false, true, false, true, false, true, false, true, false},
                          {true, false, true, false, true, false, false, false, true, false},
                          {true, false, true, false, true, false, false, false, true, false},
                          {true, false, true, false, true, false, true, true, true, false},
                          {true, false, true, false, true, false, true, false, false, false},
                          {true, false, true, false, true, false, true, false, false, false},
                          {true, false, true, false, true, false, true, false, false, false},
                          {true, true, true, false, true, true, true, false, false, false}};
        SnakeGame sol = new SnakeGame(A, 0, 0);
        // expected output --> {0,8} and a length of 49
        int[] B = {2, 6,49};
        assertArrayEquals(B, sol.findTailRecursive());
    }


    //EDGE CASE
    @Test
    public void testFindTailRecursive5() {
        // Tests the method with normal inputs that should give the tail position of the snake
        // Assumes the board is square and the head position is at the starting point (0,0)
        // and that the tail position hits another part of the snake
        boolean[][] A = {{true, true, true, true, true, true},
                         {false, false, false, false, false, true},
                         {false, false, false, true, true, true},
                         {false, true, true, true, false, true},
                         {false, true, false, false, false, true},
                         {false, true, true, true, true, true}};
        SnakeGame sol = new SnakeGame(A, 0, 0);
        // expected output --> {0,0} and length of 21
        int[] B = {0,0,21};
        assertArrayEquals(B, sol.findTailRecursive());
        //Shows that if the tail position of the snake hits another part of the snake it will default to position {0,0}
    }


}

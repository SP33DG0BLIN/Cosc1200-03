//bhavin Shuseevan 
//cosc1200
//assignment 3 - sudoku functions 
//this project's goal is to make sudoku grids and provide the solutions for them
import java.util.Collections;
//for lists and sets, i used it to shuffle the numbers
import java.util.ArrayList;

public class Numberstuff{
    public static int[][] makeSudokuGrid() {
        int[][] grid = new int[9][9];
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            numbers.add(i);


     }
     for (int row = 0; row < 9; row++) {
        Collections.shuffle(numbers);
        for (int col = 0; col < 9; col++) {
            grid[row][col] = numbers.get(col);
            //copys from number and puts in the grid
        }
    }
    
    return grid;
}
     public static int[][] makeporblem(int[][] grid) {
        int [][] problem = new int[9][9];
        //[][] was helpful for grids idr
        for (int i = 0; i <9; i++){
        System.arraycopy(grid[i], 0, problem[i], 0 , 9);
        }
      //  int del = 45;
        for (int i = 0 ; i <9;i++){
            int row = (int ) (Math.random()* 9);
            int colm = (int) (Math.random()*9);
            problem[row][colm] = 0;
// this is to get numbers for the grid
        }
        return problem;

     }
     public static void print(int[][] grid) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (grid[row][col] == 0) {
                    System.out.print(" . ");
                } else {
                    System.out.print(" " + grid[row][col] + " ");
                }
            }
            //this fills out the grid for numbers for us to guess
            System.out.println();
        }
     }
}
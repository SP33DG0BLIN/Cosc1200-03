//bhavin Shuseevan 
//cosc1200
//assignment 3 - sudoku functions 
//this project's goal is to make sudoku grids and provide the solutions for them
import java.util.Scanner;
public class Numberstuffgame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] sudokusqr = Numberstuff.makeSudokuGrid();
        int[][] problems = Numberstuff.makeporblem(sudokusqr);
        System.out.println("Sudoku Puzzle Game:");
        Numberstuff.print(problems);
        boolean running = true;
        while (running) {
            System.out.println("pick an option:");
            System.out.println("1 - get solution");
            System.out.println("2 - new puzzle");
            System.out.println("3 - exit");
            System.out.print("choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Solution:");
                Numberstuff.print(sudokusqr);
            } else if (choice == 2) {
                sudokusqr = Numberstuff.makeSudokuGrid();
                problems = Numberstuff.makeporblem(sudokusqr);
                System.out.println("New puzzle:");
                Numberstuff.print(problems);
            } else if (choice == 3) {
                System.out.println("Smell ya later!");
                running = false;
            } else {
                System.out.println("WRONG....please try aghain");
            }
        }
        scanner.close();
    }
}

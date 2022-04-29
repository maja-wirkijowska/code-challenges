public class Robot {
    public static void main(String[] args) {
        int[][] test1 = {{1, 1, 0},
                         {1, 1, 1},
                         {0, 0, 1},
                         {0, 1, 1}};
        int[][] test2 = {{1, 0, 1, 1},
                         {1, 1, 1, 0},
                         {0, 1, 1, 0}};
        int[][] test3 = {{1, 0},
                         {0, 1}};
        System.out.print("Test1: ");
        robotPath(4, 3, test1);
        System.out.print("\nTest2: ");
        robotPath(3, 4, test2);
        System.out.print("Test3: ");
        robotPath(2, 2, test3);
    }

    public static void robotPath(int rows, int columns, int[][] grid) {

        if (grid[rows - 1][columns - 1] == 0) {
            System.out.println("Bottom right cell is blocked. No valid path exists.");
            return;
        }
        int i = 0, j = 0, rGoal = rows - 1, cGoal = columns - 1;
        while (i < rows && j < columns) {
            if (grid[i + 1][j] == 0 && grid[i][j + 1] == 0) {
                System.out.println("Cell to the right AND one cell down are blocked. No valid path exists.");
                return;
            } else if (grid[i + 1][j] == 1) {
                i++;
            } else if (grid[i + 1][j] == 0 && grid[i][j + 1] == 1) {
                j++;
            }
            System.out.print("[" + i + "][" + j + "] ");
            if (i == rGoal && j == cGoal) {
                return;
            }
        }


    }

    /*
    Robot in a Grid: Imagine a robot sitting in the upper left corner of grid with r rows and c columns.
    The robot can only move in two directions, right and down, but certain cells are "off limits" such
    that the robot cannot step on them. Design an algorithm to find a path for the robot from the top
    left to the bottom right.
     */
}

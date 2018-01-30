import edu.illinois.cs.cs125.lib.mazemaker.Maze;

/**
 * Solve a randomly-generated maze.
 *
 * @see <a href="https://github.com/cs125-illinois/mazemaker">Mazemaker on GitHub</a>
 * @see <a href="https://cs125-illinois.github.io/mazemaker/">Mazemaker Documentation</a>
 * @see <a href="https://cs125.cs.illinois.edu/lab/2/#maze">Lab 2 Writeup</a>
 */
@SuppressWarnings("checkstyle:emptyblock")
public class SolveMaze {

    /**
     * Implement your maze solving algorithm in the main method below.
     *
     * @param unused unused input arguments
     */

    public static void main(final String[] unused) {
        /*
         * Create a new 10 x 10 maze. Feel free to change these values.
         */
        Maze maze = new Maze(5, 5);

        /*
         * Pick (0, 0), the bottom left corner, as the starting point.
         * Put the end in the top right corner.
         */
        maze.startAtZero();
        maze.endAtTopRight();

        /*
         * You should be able to solve a 10 x 10 maze in (far fewer than) 1000 steps.
         * Feel free to adjust this number if you experiment with other mazes.
         */
//        for (int step = 0; step < 1000; step++) {
            // Implement your maze solving algorithm here
        /*
int a = 0;
            while (a < 100000) {
                a++;
                int b = 0;
                int c = 0;
                maze.turnRight();
                if (maze.canMove() == true) {
                    maze.move();
                } else {
                    maze.turnLeft();
                    maze.turnLeft();
                    if (maze.canMove() == true) {
                        maze.move();
                        b++;
                    }
                    if (b == 0) {
                        maze.turnRight();
                        if (maze.canMove() == true) {
                            maze.move();
                            c++;
                        }
                    }
                    if (b ==0 && c == 0) {
                        maze.turnLeft();
                        maze.turnLeft();
                        maze.move();
                    }
                }
            }
//        }
*/

        for (int i = 0; i < 1000; i++){
            int a = 0;
            maze.turnLeft();
            if (maze.canMove() == true){
                maze.move();
            }
            else {
                maze.turnRight();
                if (maze.canMove() == true){
                    maze.move();
                }
                else {
                    maze.turnRight();
                    if (maze.canMove() == true){
                        maze.move();
                    }
                    else{
                        maze.turnRight();
                        maze.move();
                    }
                }
            }
        }
        if (maze.isFinished()) {
            System.out.println("You solved the maze!");
        } else {
            System.out.println("Try again!");
        }
    }
}

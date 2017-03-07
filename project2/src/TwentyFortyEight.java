import java.util.Random;
import java.util.Scanner;

public class TwentyFortyEight {
    //This instance variable represents the board. Use this to make changes.
    private int[][] board;
    //This variable keeps track of the current score.
    private int score;
    private int boardWidth;

    //Constructor
    public TwentyFortyEight(int boardWidth) {
        this.board = new int[boardWidth][boardWidth]; /*Create a new board and store it to the board variable*/
        this.score = 0; /*Set up the initial score for the game*/
        this.boardWidth = boardWidth;
        placeRandom();

    }

    //This function resets the board to its initial state
    public void reset() {
        /*Reset all squares on the board to 0*/
        this.board = new int[boardWidth][boardWidth]; /*Create a new board and store it to the board variable*/
        this.score = 0; /*Reset the score to 0*/
        placeRandom();/*Place a 2 randomly on the board*/

    }

    //This function returns the total number of blank spaces on the board
    public int numBlanks() {
        int result = 0;
        for (int i = 0; i < boardWidth; i++) {
            for (int j = 0; j < boardWidth; j++) {
                if (board[i][j] == 0)
                    result++;
            }
        }
        return result;
    }

    //This function places a 2 at a random blank space on the board.
    //It does nothing if there are no blank spaces.
    public void placeRandom() {
        if (numBlanks() != 0) {
//            put a new 2 in one of the blank spaces on the board
            while (true) {
                int m = generateRandomInt(boardWidth - 1, 0);
                int n = generateRandomInt(boardWidth - 1, 0);
                if (board[m][n] != 0) {
                    m = generateRandomInt(boardWidth - 1, 0);
                    n = generateRandomInt(boardWidth - 1, 0);
                } else {
                    board[m][n] = 2;
                    break;
                }
            }


        }

    }

    //This function attempts to move a cell at coordinates fromRow,fromCol to
    //the cell toRow,toCol. Refer to the handout for movement rules.
    public boolean moveTo(int fromRow, int fromCol, int toRow, int toCol) {
        /*moveTo will only move or merge a piece at most one space in any direction (i.e. the from piece and the to piece should be adjacent).*/
        /*Check bound*/
        if (checkBound(fromCol) && checkBound(fromRow) && checkBound(toRow) && checkBound(toCol)) {
            /*Check Adjacent*/
            if (checkAdj(fromRow, fromCol, toRow, toCol)) {
                if (board[fromRow][fromCol] == 0)
                    return false;
                if (board[toRow][toCol] == 0) {
                    board[toRow][toCol] = board[fromRow][fromCol];
                    board[fromRow][fromCol] = 0;
                    return true;
                }
                if (board[toRow][toCol] == board[fromRow][fromCol]) {
                    /*Success method*/
                    board[toRow][toCol] += board[fromRow][fromCol];
                    board[fromRow][fromCol] = 0;
                    /*Add score because the same number*/
                    this.score += board[toRow][toCol];
                    return true;
                }
                return false;
            }

        }
        return false;
    }

    //The following four functions move the board in a single direction.
    public boolean moveUp() {
        boolean result = false;
        int farthestIndex = 0;

        for (int i = farthestIndex; i < boardWidth; i++) {
            for (int j = farthestIndex; j < boardWidth; j++) {
                if (moveTo(j, i, j - 1, i)) {

                    result = true;
                }

            }
        }

        return result;
    }

    public boolean moveDown() {
        boolean result = false;
        int farthestIndex = boardWidth - 1;

        for (int i = 0; i < boardWidth; i++) {
            for (int j = farthestIndex; j >= 0; j--) {
                if (moveTo(j, i, j + 1, i)) {

                    result = true;
                }

            }
        }


        return result;
    }

    public boolean moveRight() {
        boolean result = false;
        int farthestIndex = boardWidth - 1;

        for (int i = 0; i < boardWidth; i++) {
            for (int j = farthestIndex; j >= 0; j--) {
                if (moveTo(i, j, i, j + 1)) {

                    result = true;
                }

            }
        }


        return result;
    }

    public boolean moveLeft() {
        boolean result = false;
        int farthestIndex = 0;

        for (int i = farthestIndex; i < boardWidth; i++) {
            for (int j = farthestIndex; j < boardWidth; j++) {
                if (moveTo(i, j, i, j - 1)) {

                    result = true;
                }

            }
        }


        return result;
    }

    ////////////////////////////////////////////////////////////////////////
    // Do not edit the methods below, they are for testing and running the
    // program.
    ////////////////////////////////////////////////////////////////////////
    public int[][] getBoard() {
        return board;
    }

    public void setBoard(int[][] newBoard) {
        board = newBoard;
    }


    /**
     * The main will allow you to play the game.
     *
     * @param args
     */
    public static void main(String args[]) {
        TwentyFortyEight tfe = new TwentyFortyEight(4);


        Scanner s = new Scanner(System.in);
        int bestScore = 0;
        boolean resetFlag = false;

        while (true) {
            System.out.println("Current score: " + tfe.getScore() + " | Best score: " + bestScore);
            tfe.showBoard();

            System.out.println("Enter up, down, left or right to move in that direction.");
            System.out.println("Enter reset to reset the game or quit to exit.");
            String line = s.nextLine();

            switch (line) {
                case "up":
                    while (tfe.moveUp()) {
                        // do nothing

                    }
                    break;
                case "down":
                    while (tfe.moveDown()) {
                        // do nothing
                    }
                    break;
                case "left":
                    while (tfe.moveLeft()) {
                        // do nothing

                    }
                    break;
                case "right":
                    while (tfe.moveRight()) {
                        // do nothing

                    }
                    break;
                case "reset":
                    tfe.reset();
                    resetFlag = true;
                    break;
                case "quit":
                    return;
                default:
                    System.out.println("Invalid move, Please try again!!!!\n");
                    continue;

            }

            bestScore = Math.max(bestScore, tfe.getScore());
            if (!resetFlag) {
                tfe.placeRandom();
            }
            resetFlag = false;
        }
    }


    public void showBoard() {
        for (int x = 0; x < boardWidth * 6 + 1; x++) {
            System.out.print("-");
        }
        System.out.println();

        for (int x = 0; x < boardWidth; x++) {
            for (int y = 0; y < boardWidth; y++) {
                String square = (board[x][y] == 0) ? "" : board[x][y] + "";
                System.out.printf("|%5s", square);
            }
            System.out.println("|");

            for (int y = 0; y < boardWidth * 6 + 1; y++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }

    public int getScore() {
        return score;
    }

    public int generateRandomInt(int max, int min) {
        Random random = new Random();
        int randomNumber = random.nextInt(max + 1 - min) + min;
        return randomNumber;
    }

    public boolean checkBound(int n) {
        return (n >= 0 && n < boardWidth);
    }

    public boolean checkAdj(int fromRow, int fromCol, int toRow, int toCol) {
        if (isInMatrix(fromRow + 1, fromCol)) {
            if ((fromRow + 1 == toRow) && (fromCol == toCol))
                return true;
        }
        if (isInMatrix(fromRow - 1, fromCol)) {
            if ((fromRow - 1 == toRow) && (fromCol == toCol))
                return true;
        }
        if (isInMatrix(fromRow, fromCol + 1)) {
            if ((fromRow == toRow) && (fromCol + 1 == toCol))
                return true;
        }
        if (isInMatrix(fromRow, fromCol - 1)) {
            if ((fromRow == toRow) && (fromCol - 1 == toCol))
                return true;
        }
        return false;

    }

    public boolean isInMatrix(int row, int column) {
        return (row < this.boardWidth && column < this.boardWidth && row >= 0 && column >= 0);
    }

    public void updateScore() {

    }
}

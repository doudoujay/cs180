/**
 * Created by jay on 2017/2/10.
 */
public class MatrixNeighbors {
    int rows;
    int columns;
    int[][] matrix;

    /*sets both the rows and columns fields, then creates a new matrix of size [rows]x[columns].*/
    MatrixNeighbors(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new int[rows][columns];

    }

    /*returns a String containing all the cell neighbors of the cell at row, column,
        starting directly above the specified cell and moving clockwise. If the cell is
        along any edge, be sure to omit the non-existent neighbors. See below for formatting.*/
    public String neighbors(int row, int column) {
        /*Handle a nonexistent cell*/
        String result = "";
        if (!isInMatrix(row,column))
            result = "cell does not exist";
        else {
            if(isInMatrix(--row,column)){
                result += row+","+column+";";
            }
            if(isInMatrix(row,++column)){
                result += row+","+column+";";
            }
            if(isInMatrix(++row,column)){
                result += row+","+column+";";
            }
            if(isInMatrix(++row,column)){
                result += row+","+column+";";
            }
            if(isInMatrix(row,--column)){
                result += row+","+column+";";
            }
            if(isInMatrix(row,--column)){
                result += row+","+column+";";
            }
            if(isInMatrix(--row,column)){
                result += row+","+column+";";
            }
            if(isInMatrix(--row,column)){
                result += row+","+column+";";
            }
        }
        return result;

    }


    public boolean isInMatrix(int row, int column) {
        return (row < this.rows && column < this.rows && row >= 0 && column >= 0);
    }
}

import java.util.Arrays;

/**
 * Created by ma438 on 2/14/17.
 */
public class Matrix {
    public void printMatrix(int[][] matrix) {
        for (int[] m : matrix) {
            System.out.println(Arrays.toString(m));
        }
    }

    public int[][] transposeMatrix(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        int[][] result = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public boolean isIdentity(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;


        if (m == n) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; i < n; j++) {
                    if (i == j) {
                        if (matrix[i][j] != 1) {
                            return false;
                        }
                    } else {
                        if (matrix[i][j] != 0) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public boolean isUpperTriangular(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i>j){
                    if(matrix[i][j] != 0)
                        return false;
                }
            }
        }
        return true;
    }

    public boolean isTridiagonal(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!(i==j || i==j+1 || j==i+1)){
                    if(matrix[i][j] != 0)
                        return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Matrix obj = new Matrix();
        int[][] originalMatrix = {{1,2},{3,4},{5,6}};
        System.out.println("Original Matrix");
        obj.printMatrix(originalMatrix);
        System.out.println("isIdentity: " + obj.isIdentity(originalMatrix));
        System.out.println("isUpperTriangular:" + obj.isUpperTriangular(originalMatrix));
        System.out.println("isTridiagonal:"+obj.isTridiagonal(originalMatrix));
        System.out.println("Tansposed matrix");
        int[][] transposedMatrix = obj.transposeMatrix(originalMatrix);
        obj.printMatrix(transposedMatrix);
    }
}

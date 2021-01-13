package Tenth;

public class Matrix {
    private final int row,col;
    private final int[][] mat;

    public Matrix(int row, int col) {
        this.col = col;
        this.row = col;

        mat = new int[row][col];
    }

    public void allocRandomMatrix() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%3d", mat[i][j]);
            }
            System.out.println("");

        }
    }
}
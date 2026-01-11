package Array;

public class reverseMatrix {
  public void reverseMat (int[][] matrix){
        int rows = matrix.length;
        int column = matrix[0].length;

        for (int i =0 ; i < rows*column/2; i++){

            int r1 = i/column;
            int c1 = i%column;

            int r2 = (rows*column -i - 1)/column;
            int c2 = (rows*column -i - 1)%column;

            int temp = matrix[r1][c1];
            matrix[r1][c1] = matrix[r2][c2];
            matrix[r2][c2] = temp;
        }
        System.out.println("print reversed matrix");
        for (int i = 0; i<rows; i++){
            for(int j = 0; j< column; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[]args){
        int [][] matrix ={ {1,2,3},{4,5,6},{7,8,9} };

        reverseMatrix rev = new reverseMatrix();
        rev.reverseMat(matrix);
    }
}

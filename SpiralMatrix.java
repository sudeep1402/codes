public class SpiralMatrix {
    public static void spiralOrder(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int sr=0,er=row-1,sc=0,ec=col-1;
        while(sr<=er && sc<=ec){

        for (int j = sc; j <=ec ; j++) {
            System.out.print(matrix[sr][j]+" ");
        }sr++;

        for (int i = sr; i <=er; i++) {
            System.out.print(matrix[i][ec]+" ");
        }ec--;

        if (sr <= er) {
            for (int j = ec; j >= sc; j--) {
                System.out.print(matrix[er][j] + " ");
            }
            er--; // Move end row up
        }

        if (sc <= ec) {
            for (int i = er; i >= sr; i--) {
                System.out.print(matrix[i][sc] + " ");
            }
            sc++; // Move start column right
        }     
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9, 10, 11, 12}
        };
        // int[][] result=
        spiralOrder(matrix);
     
    }
}
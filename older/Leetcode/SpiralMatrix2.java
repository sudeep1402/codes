import java.util.Arrays;
public class SpiralMatrix2 {
    public static int[][] spiralOrder(int n) {
        int k=1;
        //int row=matrix.length;
        //int col=matrix[0].length;
        int[][] matrix=new int[n][n];
        int sr=0,er=n-1,sc=0,ec=n-1;
        //for (int k = 1; k <= n*n; k++) {
        while(sr<=er && sc<=ec){

        for (int j = sc; j <=ec ; j++) {
            matrix[sr][j]=k++;
        }sr++;

        for (int i = sr; i <=er; i++) {
            matrix[i][ec]=k++;
        }ec--;

        if (sr <= er) {
            for (int j = ec; j >= sc; j--) {
                matrix[er][j]=k++;
            }
            er--; 
        }

        if (sc <= ec) {
            for (int i = er; i >= sr; i--) {
                matrix[i][sc]=k++;
            }
            sc++; 
        }     
        }
        return matrix;
            
        //}
    }
    public static void main(String[] args) {
        // int[][] matrix = {
        //     {1,  2,  3,  4},
        //     {5,  6,  7,  8},
        //     {9, 10, 11, 12}
        // };
        // int[][] result=
        
        int res[][]=spiralOrder(3);

        for (int[] row:res) {
            System.out.println(Arrays.toString(row));
            
        };
        
     
    }
}
public class ValidSudoku {
    public static boolean isvalidsudoku(char board[][]) {
        
        for (int row = 1; row <= 9; row++) {
            for (int col = 1; col <= 9; col++) {
                board[]
            }            
        }
    }
    public static void main(String[] args) {
        char board[9][9]=[["5","3",".",".","7",".",".",".","."]
                        ,["6",".",".","1","9","5",".",".","."]
                        ,[".","9","8",".",".",".",".","6","."]
                        ,["8",".",".",".","6",".",".",".","3"]
                        ,["4",".",".","8",".","3",".",".","1"]
                        ,["7",".",".",".","2",".",".",".","6"]
                        ,[".","6",".",".",".",".","2","8","."]
                        ,[".",".",".","4","1","9",".",".","5"]
                        ,[".",".",".",".","8",".",".","7","9"]]   
        boolean result=isvalidsudoku(board);
        System.out.println(" "+result);
                  
    }
}
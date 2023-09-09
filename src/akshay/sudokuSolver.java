package akshay;

import java.util.Arrays;

public class sudokuSolver {
    public static void main(String[] args) {
        char[][] board={{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
        solveSudoku(board);
    }
    static void solveSudoku(char[][] board) {
        solve(board,board.length,0,0);
        return;
    }
    static boolean solve(char[][] board, int n, int row, int col) {
        if (col == n) {
            row++;
            col = 0;
        }

        if (row >= n) return true;

        if (board[row][col] != '.')
            return solve(board, n, row, col + 1); //if not "." we go to next element in same row

        for (int i = 1; i <= 9; i++) {
            if (isPlace(board, row, col, i)) {
                board[row][col] = (char)(i+'0');
                if (solve(board, n, row, col+1)) return true;
                else board[row][col] = '.'; //incase of failure...backtrack
            }
        }

        return false;
    }
    static boolean isPlace(char[][] board,int row,int col,int num){
        for(int i=0;i<9;i++){
            if(board[row][i]!='.'){
                int curr= (board[row][i] - '0');
                if(num==curr){
                    return false;
                }
            }
        }
        for(int i=0;i<9;i++){
            if(board[i][col]!='.'){
                int curr= (board[i][col] - '0');
                if(num==curr){
                    return false;
                }
            }
        }
        int saver=(row/3)*3;
        int savec=(col/3)*3;
        for(int i=saver;i<saver+3;i++){
            for(int j=savec;j<savec+3;j++){
                if(board[i][j]!='.'){
                    int curr= (board[i][j] - '0');
                    if(num==curr){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

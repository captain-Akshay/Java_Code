package akshay;
public class nqueen {
    public static void main(String[] args) {
        boolean [][] board={
                {false,false,false,false},
                {false,false,false,false},
                {false,false,false,false},
                {false,false,false,false}
        };
        nqueenRecursion(board,0,0);
    }
    static void nqueenRecursion(boolean [][] board,int row,int col){
        if(row==board.length){
            print(board);
            System.out.println();
            return;
        }
        if(!board[row][col]){
            for(int i=0;i<board[0].length;i++) {
                if(isSafe(board,row,i)){
                    board[row][i]=true;
                    nqueenRecursion(board, row + 1, i);
                    board[row][i]=false;
                }
            }
        }
    }
    static boolean isSafe(boolean [][]board,int row, int col){
        int saver=row;
        int savec=col;
        while(row>=0){
            if(board[row--][col]){
                return false;
            }
        }
        row=saver;
        while(col>=0&&row>=0){
            if(board[row--][col--]){
                return false;
            }
        }
        row=saver;
        col=savec;
        while(col<board[0].length&&row>=0){
            if(board[row--][col++]){
                return false;
            }
        }
        return true;
    }
    static void print(boolean [][]board){
        for(boolean[] arr: board ) {
            for(boolean i:arr){
                if(i){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}

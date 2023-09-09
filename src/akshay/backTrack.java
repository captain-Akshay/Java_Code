package akshay;

public class backTrack {
    public static void main(String[]args) {
    System.out.println(countingPath(3,3));
    printPath(3,3,"");
    boolean [][] board={
            {true,true,true},
            {true,true,true},
            {true,true,true}
    };
    obstaclePath(board,0,0,"");
        allPath(board,0,0,"");
    }

    static void obstaclePath(boolean [][]board,int row,int col,String path){
      if(row==2&&col==2){
          System.out.println(path);
          return;
      }
      if(board[row][col]){
          if(col<2){
              obstaclePath(board,row,col+1,path+"R");
          }
          if(row<2){
              obstaclePath(board,row+1,col,path+"D");
          }
      }
      else{
          return;
      }
    };
    static int countingPath(int row,int col){
        if(row==1 || col==1){
            return 1;
        }
        return countingPath(row-1,col)+countingPath(row,col-1);
    }
    static void printPath(int row,int col,String ans){
        if(row==1 && col==1){
            System.out.println(ans);
            return;
        }
        if(col>1) {
            printPath(row, col - 1, ans + "R");
        }
        if(row>1){
            printPath(row-1,col,ans+"D");
        }
    }
    static void allPath(boolean [][]board,int row,int col,String ans){
        if(row==2&&col==2){
            System.out.println(ans);
            return;
        }
        if(board[row][col]){
            board[row][col]=false;
            if(col<2){
                allPath(board,row,col+1,ans+"R");
            }
            if(row<2){
                allPath(board,row+1,col,ans+"D");
            }
            if(col>0){
                allPath(board,row,col-1,ans+"L");
            }
            if(row>0){
                allPath(board,row-1,col,ans+"U");
            }
            board[row][col]=true;
        }
    }
}

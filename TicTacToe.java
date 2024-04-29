import java.util.Scanner;

/**
 * TicTacToe
 */
public class TicTacToe {
    static Scanner scan = new Scanner(System.in);

    
    public static void main(String[] args) {
        
        char[][] board = {
            {'_', '_', '_'},
            {'_', '_', '_'},
            {'_', '_', '_'},
        };

        System.out.println("Let's play tic tac toe");
        printBoard(board);

        for(int i=0; i<9; i++){
            if(i%2 == 0){
                System.out.println("Turn: X");
                int[] spot = askUser(board);
                board[spot[0]][spot[1]] = 'X';
                
            }else{
                System.out.println("Turn: O");
                int[] spot = askUser(board);
                board[spot[0]][spot[1]] = 'O';
            }

            printBoard(board);
            int count = checkWin(board);
            if(count == 3){
                System.out.println("X wins!!!");
                break;
            }else if(count == -3){
                System.out.println("O wins!!!");
                break;
            }
        }    

  
    }

    public static void printBoard(char[][] board){
        System.out.println("\t");
        for(int i=0; i<board.length; i++){
            System.out.print("\t");
            for(int j=0; j<board[i].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.print("\n\n");
        }
    }

    public static int[] askUser(char[][] board){
        System.out.print("pick a row and colum number: ");
        int[] spot = {scan.nextInt(), scan.nextInt()};

        while(board[spot[0]][spot[1]] != '_'){
            System.out.print("Spot taken, try again: ");
            spot[0] = scan.nextInt();
            spot[1] = scan.nextInt();
        }
        return spot;

    }

    public static int checkWin(char[][] board){
        int rows = checkRows(board);
        int columns = checkColumns(board);
        int leftDiagonal = checkLeft(board);
        int rightDiagonal = checkRight(board);
        
        if(Math.abs(rows) == 3) return rows;

        if(Math.abs(columns) == 3) return columns;
        
        if(Math.abs(leftDiagonal) == 3) return leftDiagonal;
        
        if(Math.abs(rightDiagonal) == 3) return rightDiagonal;

        return 0;

    }

    public static int checkRows(char[][] board){
        int count=0;
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j] == 'X'){
                    count++;
                }else if(board[i][j] == 'O'){
                    count--;
                }
                
            }

            if(count == 3 || count == -3){
               return count;
             }else{
                count = 0;
             }
            
        }

        return count;
    }

    public static int checkColumns(char[][] board){
        int count=0;
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[j][i] == 'X'){
                    count++;
                }else if(board[j][i] == 'O'){
                    count--;
                }
                
            }

            if(count == 3 || count == -3){
               return count;
             }else{
                count = 0;
             }
            
        }

        return count;
    }


    public static int checkLeft(char[][] board){
        int count=0;
        for(int i=0; i<board.length; i++){
            
            if(board[i][i] == 'X'){
                count++;
            }else if(board[i][i] == 'O'){
                count--;
            }
            
        }

        return count;
    }

    public static int checkRight(char[][] board){
        int count=0;
        for(int i=0; i<board.length; i++){
            if(board[2-i][i] == 'X'){
                count++;
            }else if(board[i][i] == 'O'){
                count--;
            }
            
        }

   
        return count;
    }



    
}
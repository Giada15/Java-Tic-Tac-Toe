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

    
}
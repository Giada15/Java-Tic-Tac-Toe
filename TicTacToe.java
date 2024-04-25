/**
 * TicTacToe
 */
public class TicTacToe {

    public static void main(String[] args) {

        char[][] board = {
            {'_', '_', '_'},
            {'_', '_', '_'},
            {'_', '_', '_'},
        };

        System.out.println("Let's play tic tac toe");
        printBoard(board);

        
    }

    public static void printBoard(char[][] board){
        System.out.println("\tnew line");
        for(int i=0; i<board.length; i++){
            System.out.print("\t");
            for(int j=0; j<board[i].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.print("\n\n");
        }
    }
}
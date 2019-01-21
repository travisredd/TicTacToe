/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *clsLogic class
 * @author reddt
 */
public class clsLogic {
    /**
     * String array to keep track of the board
     */
    public String[][] saBoard;
    /**
     * WinningMOve - keeps track of the winning move
     */
    public WinningMove eWinningMove;
    /**
     * Knows if the game has started returns true or false
     */
    public boolean bHasGameStarted;
    /**
     * Keeps track of the player location for array index
     */
    public int iPlayer;
    /**
     * Keeps track of player 1 score
     */
    public int iPlayer1Score;
    /**
     * Keeps track of player 2 score
     */
    public int iPlayer2Score;
    /**
     * Keeps track of the amount of ties
     */
    public int iTie;
    /**
     * Keeps track of clicks
     */
    public int iClick;
    /**
     * Passes the string to load into the array
     */
    public String sLoad = "";
    /**
     * Gets the location that Tag returns for the label and converts it to string called sLocation
     */
    public String sLocation = "";
    /**
     * clsAI creates an object class called clsAI
     */
    clsAI clsAI;
    
    /**
     * Constructor
     */
    public clsLogic() {
        //clsAI = new clsAI();
        saBoard = new String[3][3];
        bHasGameStarted = false;
        iPlayer1Score = 0;
        iPlayer2Score = 0;
        iTie = 0;
        iPlayer = 0;
    }
    
    /**
     * Keeps track of Winning Move
     */
    public enum WinningMove {
        Row1, 
        Row2, 
        Row3, 
        Col1, 
        Col2, 
        Col3, 
        Diag1, 
        Diag2
    }

    /**
     * Checks if winning move is true
     * @return 
     */
    public boolean isWinningMove() {
        if(isDiagonalWin() == true || isHorizonalWin() == true || isVerticalWin() == true) {
            return true;
        }
        return false;
    }
    
    /**
     * Checks if tie is true
     * @return 
     */
    public boolean isTie() {
        //saBoard.toString();
        if((saBoard[0][0] == "X" || saBoard[0][0] == "O") && (saBoard[0][1] == "X" || saBoard[0][1] == "O") && (saBoard[0][2] == "X" || saBoard[0][2] == "O")&&
           (saBoard[1][0] == "X" || saBoard[1][0] == "O") && (saBoard[1][1] == "X" || saBoard[1][1] == "O") && (saBoard[1][2] == "X" || saBoard[1][2] == "O")&&
           (saBoard[2][0] == "X" || saBoard[2][0] == "O") && (saBoard[2][1] == "X" || saBoard[2][1] == "O") && (saBoard[2][2] == "X" || saBoard[2][2] == "O")) {
            return true;
        }
        return false;
    }
    
    /**
     * Checks if diagonal win is true
     * @return 
     */
    public boolean isDiagonalWin() {
        if ((saBoard[0][0] == "X" && saBoard[1][1] == "X" && saBoard[2][2] == "X") || (saBoard[0][0] == "O" && saBoard[1][1] == "O" && saBoard[2][2] == "O")) {
            eWinningMove = WinningMove.Diag1;
            return true;
        }
        else if ((saBoard[0][2] == "X" && saBoard[1][1] == "X" && saBoard[2][0] == "X") || (saBoard[0][2] == "O" && saBoard[1][1] == "O" && saBoard[2][0] == "O")) {
            eWinningMove = WinningMove.Diag2;
            return true;
        }
        return false;
    }
    
    /**
     * Checks if vertical win is true
     * @return 
     */
    public boolean isVerticalWin() {
        if((saBoard[0][0] == "X" && saBoard[1][0] == "X" && saBoard[2][0] == "X") || (saBoard[0][0] == "O" && saBoard[1][0] == "O" && saBoard[2][0] == "O")) {
            eWinningMove = WinningMove.Col1;
            return true;
        }
        else if((saBoard[0][1] == "X" && saBoard[1][1] == "X" && saBoard[2][1] == "X") || (saBoard[0][1] == "O" && saBoard[1][1] == "O" && saBoard[2][1] == "O")) {
            eWinningMove = WinningMove.Col2;
            return true;
        }
        else if((saBoard[0][2] == "X" && saBoard[1][2] == "X" && saBoard[2][2] == "X") || (saBoard[0][2] == "O" && saBoard[1][2] == "O" && saBoard[2][2] == "O")) {
            eWinningMove = WinningMove.Col3;
            return true;
        }
        return false;
    }
    
    /**
     * Checks if horizonal win is true
     * @return 
     */
    public boolean isHorizonalWin() {
        if((saBoard[0][0] == "X" && saBoard[0][1] == "X" && saBoard[0][2] == "X") || (saBoard[0][0] == "O" && saBoard[0][1] == "O" && saBoard[0][2] == "O")) {
            eWinningMove = WinningMove.Row1;
            return true;
        }
        else if((saBoard[1][0] == "X" && saBoard[1][1] == "X" && saBoard[1][2] == "X") || (saBoard[1][0] == "O" && saBoard[1][1] == "O" && saBoard[1][2] == "O")) {
            eWinningMove = WinningMove.Row2;
            return true;
        }
        else if((saBoard[2][0] == "X" && saBoard[2][1] == "X" && saBoard[2][2] == "X") || (saBoard[2][0] == "O" && saBoard[2][1] == "O" && saBoard[2][2] == "O")) {
            eWinningMove = WinningMove.Row3;
            return true;
        }
        return false;
    }
    
    /**
     * Clears the array - sets all the text to ""
     */
    public void ClearArray() {
        for(int i = 0; i <= 2; i++) {
            for(int j = 0; j <= 2; j++) {
                saBoard[i][j] = "";
            }
        }
    }
}

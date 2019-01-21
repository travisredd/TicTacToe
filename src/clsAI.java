/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author reddt
 */
public class clsAI {
    
    /**
     * Variables
     */
    
    /**
     * 
     */
    clsLogic clsLogic;
    
    
    /**
     * Methods
     */
    public clsAI() {
        //clsLogic = new clsLogic();
    }
   
    
    /**
     * Got the idea from Brad recursion lecture - https://www.youtube.com/watch?v=UWLCSLp8_as&feature=youtu.be - 35:39
     */
    public void recursiveMove(int iRow, int iCol, boolean bFinished) {
        
        if (bFinished == false) {
            if((iRow > 0 && iRow < 3) && (iCol > 0 && iCol < 3)) {
                //if (array[iRow][iCol] == ' '){
                //  array[iRow][iCol] = 'O';    
                //  recursiveMove(iRow + 1, iCol, bFinished);
                //  recursiveMove(iRow, iCol + 1, bFinished);
                //  recursiveMove(iRow - 1, iCol, bFinished);
                //  recursiveMove(iRow, iCol - 1, bFinished);
                //}
            }
        }
    }
}

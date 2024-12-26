import java.lang.Math;
/**
 * Write a description of class Board here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Board
{
    private Square[][] board;
    private Player me;
    
    public Board()
    {
        this.board = new Square[5][5];
        for (int i = 0; i < this.board.length; i++)
        {
            for (int j = 0; j < this.board[i].length; j++)
            {
                this.board[i][j] = new Square(i, j);
            }
        }
        
        for (int i = 0; i <= 4; i++)
        {
            int row = (int) Math.random()*5;
            int col = (int) Math.random()*5;
            if (!this.board[row][col].getIsBomb())
            {
                this.board[row][col].setBomb();
            }
            else
            {
                i--;
            }
        }
    }
    
    // public void reveal()
    // {
    
    // }
    
    
    
}

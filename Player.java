
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    private int row;
    private int col;
    private char face;
    
    public Player(int rownum, int colnum)
    {
        this.row = rownum;
        this.col = colnum;
        this.face = 'w';
    }
    
    public void move(char direct)
    {
        if (direct == 'w')
        {
            this.row--;
        }
        else if (direct == 'a')
        {
            this.col--;
        }
        else if (direct == 's')
        {
            this.row++;
        }
        else if (direct == 'd')
        {
            this.col++;
        }
        else if (direct == ' ')
        {
            this.jump();
        }
    }
    
    private void jump()
    {
        if (this.face == 'w')
        {
            this.row -= 2;
        }
        else if (this.face == 'a')
        {
            this.col -= 2;
        }
        else if (this.face == 's')
        {
            this.row += 2;
        }
        else if (this.face == 'd')
        {
            this.col += 2;
        }
    }
}

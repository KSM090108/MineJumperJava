
/**
 * Write a description of class Square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square
{
    private boolean isDiscovered;
    private int num;
    private boolean isBomb;
    private int row;
    private int col;
    
    public Square(int rownum, int colnum)
    {
        this.isDiscovered = false;
        this.num = 0;
        this.isBomb = false;
        this.row = rownum;
        this.col = colnum;
    }
    
    public void setBomb()
    {
        this.isBomb = true;
    }
    
    public boolean getIsBomb()
    {
        return this.isBomb;
    }
    
    public void discover()
    {
        this.isDiscovered = true;
    }
    
    public void findNum(Square[][] grid, int row, int col)
    {
        if (grid[row-1][col-1].getIsBomb())
        {
            this.num++;
        }
        
        if (grid[row-1][col].getIsBomb())
        {
            this.num++;
        }
        
        if (grid[row-1][col+1].getIsBomb())
        {
            this.num++;
        }
        
        if (grid[row][col-1].getIsBomb())
        {
            this.num++;
        }
        
        if (grid[row][col+1].getIsBomb())
        {
            this.num++;
        }
        
        if (grid[row+1][col-1].getIsBomb())
        {
            this.num++;
        }
        
        if (grid[row+1][col].getIsBomb())
        {
            this.num++;
        }
        
        if (grid[row+1][col+1].getIsBomb())
        {
            this.num++;
        }
    }
    
    public int getNum()
    {
        return this.num;
    }
}

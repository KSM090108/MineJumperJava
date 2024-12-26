import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.lang.Math;
public class BoardComponent extends JComponent
{
    
    private Board game; 
    public BoardComponent()
    {
        this.game = new Board();
    }

    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
    }
}
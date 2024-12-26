//enter code here
import javax.swing.JFrame;
public class PlayGameHere
{
    public static void main(String[] args) throws InterruptedException
    {
        // create and configure the frame (window) for the program
        JFrame frame = new JFrame();
        
        frame.setSize(350 /* x */,350  /* y */);
        frame.setTitle("MineJumper");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // a frame contains a single component; create the Cityscape component and add it to the frame
        BoardComponent gameBoard = new BoardComponent();
        frame.add(gameBoard);
        
        // make the frame visible which will result in the paintComponent method being invoked on the
        //  component.
        frame.setVisible(true);
    }
}

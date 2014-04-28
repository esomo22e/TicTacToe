// TicTacToeCoGame.java


// awt
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import java.awt.Color;

// swing 
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


/**
 * TicTacToe encapsulates the GUI for TicTacToePanel
 * It takes Xs, 0s' and " "s as input and when you press a single TicTacToeSquare a X, 0 or " " will show.
 **/
public class TicTacToeCoGame extends TicTacToeGame 
{ 
   
    /** Instance Variables **/
    private Color ColorOfSq; 
    private boolean isOrange ;
   
    //the array of colors generated   
    public static final Color[] Square_Color = {Color.ORANGE, Color.YELLOW};
    
   
    //constructor
    public TicTacToeCoGame( int gridSize )
    {

	//call super constructor TicTacToegAME
	super( gridSize );

    }
    /**
     * Set the default size of the TicTacToe Board.
     **/
    public TicTacToeCoGame()
    {
	this(DEFAULT_SIZE);
    }
      /**
     * create GUI components
     **/ 
    public void initGUI()
    {

     // this will make the setBackground instance method of JButton actually work!
     try
	{
		UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
	} catch (Exception e) 
	{
		e.printStackTrace();
	}
     super.initGUI();


    }
       /** 
	 * Override the TicTacToeSquare's method to make a new TicTacToeCoSquare and return it. 
	 **/
	public TicTacToeSquare createTTTSquare()
	{
                // create a TicTacToeCoSquare (which "is a" TicTacToeSquare so the return type is still consistent
	    return new TicTacToeCoSquare();
	   
		
	}
} 

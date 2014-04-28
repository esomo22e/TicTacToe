
//TicTacToeCoApplet.java


// awt
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// swing 
import javax.swing.JButton;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/** 
 * TicTacToeApplet will display Xs, Os, and " "s when you press a button
 **/
public class TicTacToeCoApplet extends TicTacToeApplet
{
	/**
	 * Constructor, invoked for a new instance
	 **/
	public TicTacToeCoApplet()
	{
		// call super constructor
		super();
		
	}
	
	/** 
	 * Special method that will be invoked when applet is created
	 **/
	public void start()
	{
	    System.out.println( getParameter( "size" ) );
	    if( (getParameter( "size" ) != null ) ) {
	    // create an instance of TicTacToePanel and add it

	    String tictactoe = getParameter( "size" );
	    int gridSize = Integer.parseInt(tictactoe) ;// it wil take the string and turn it into a integer
	    add( new TicTacToeGame( gridSize ) );
	    }
	    else{
	        //otherwise, create an TicTacToeGame and add it
		 add( new TicTacToeGame() );

                }
	
	}
}
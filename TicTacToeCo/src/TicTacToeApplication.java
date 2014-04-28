//TicTacToeApplication.java

// swing
import javax.swing.JFrame;

/** 
 * Main application to show a TicTacToeFrame 
 **/
public class TicTacToeApplication
{
	/**
	 * show an X's and O's 
	 **/
     
	public static void main( String[] args )
	{
		// create a new JFrame to hold TicTacToeFrame
		JFrame tictactoeFrame = new JFrame();
		
		tictactoeFrame.setSize( 800, 800 );
		
		//saving the gridsize in string form because args is a string array in the variable tictactoe

		if(args.length == 0) // if(args.length == 1)
        	    { //if tictactoe has an actual value and not a null 
		    
		    tictactoeFrame.add( new TicTacToeGame() );
    
	        }
		else
		    {
		// create an TicTacToeFrame and add it
			String tictactoe = args[0];
		       int gridSize = Integer.parseInt(tictactoe) ;

			tictactoeFrame.add( new TicTacToeGame( gridSize ) );

		    }

		// exit normally on closing the window
		tictactoeFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		// show frame
		tictactoeFrame.setVisible( true );	
	
	}
}
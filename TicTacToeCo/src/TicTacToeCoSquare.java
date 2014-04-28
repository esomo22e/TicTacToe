// TicTacToeCoSquare.java

// awt
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

// swing 
import javax.swing.JButton;


public class TicTacToeCoSquare extends TicTacToeSquare
 {
     /**Instance Variables**/
     private Color ColorOfSq; 
     private boolean isOrange ;
     private Color myColor;
       
     //array of colors generated
    public static final Color[] Square_Color = {Color.ORANGE, Color.YELLOW};
 
     
     /**
      * Constructor with one square that will extend to the JButton
      **/
     
     public TicTacToeCoSquare()
     {
	  //this will refer to the TicTacToeSquare which will display the the TicTacToeCoSquare
	 super();
	 	
      }
    
     /**
      * The refreshDisplay will display the X's and 0's if pressed on each square.
      * As well, as random colors when you pressed the square. 
      * But if not pressed the Tic Tac Toe Square will be blank. 
      **/
      
     public void refreshDisplay( boolean turn )
     {
	 //this will refer to TicTacToeSquare which will refreshdisplay in TicTacToeSquare
	 super.refreshDisplay( turn );

	 //this will randomly generate colors 
	 getRandom();
	 this.setBackground( myColor);

       
	       
     }
     /**
      * The method will refer to the Color variable
      **/
     public Color getColor(){
	
	 
	return myColor;
     }
     // this will randomly generate the colors in arrays
         public void getRandom()
     {
	 //will get a random color
	int color = (int)Math.floor(Math.random()*2); 
	myColor = Square_Color[color];
	
     }
    
     /** 
	 * Override the matches method to additionally check if the colors are the same. 
	 * return true if two squares have the same mark or are the same color.
	 **/
    public boolean matches( TicTacToeSquare sq )
     {
	 // make sure it's actually a TicTacToeCoSquare
	 if( sq instanceof TicTacToeCoSquare )
	     {
	     // now that we know it is a TicTacToeCoSquare, cast it so we have access
		 TicTacToeCoSquare coSq = (TicTacToeCoSquare)sq;
	    
		 if(this.getText().equals(sq.getText()) || this.getColor().equals(sq.getColor()) )
		     return true;

		 else
		     return false;
	     }

	 else
	     //this is not a match
          return false;

     }
    
}

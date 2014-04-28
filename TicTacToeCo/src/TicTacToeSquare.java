// TicTacToeSquare.java


// awt
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

// swing 
import javax.swing.JButton;



public class TicTacToeSquare extends JButton 
 {
     
     //instance variable
     private static final int BLANK = -1;
     private static final int X = 0;
     private static final int O = 1;
     private int state;
      private Color myColor;
         
     /**
      * Constructor with one square that will extend to the JButton
      **/
     public TicTacToeSquare()
     {
	 //this will refer to the JButton which will display the the Tic Tac Toe Square
	 super();
	 	 state = BLANK;
	 setBackground(Color.WHITE);
	//it will use the actionPerformed to display the X's and O's if pressed
	 state = 0;
       }
    
     /**
      * The refreshDisplay will display the X's and 0's if pressed on each square.
      * But if not pressed the Tic Tac Toe Square will be blank. 
      **/
     public void refreshDisplay( boolean turn )
     {
	 //	System.out.println("the actionperformed method was invoked");
	 if( turn == true )
	     this.setText("X");//if pressed on a row or column then it will activate the state of X
	 
	 else
	     this.setText("O");//if pressed on a row or column a second time then it will activate the state of 0
	
     }
      public Color getColor(){
	
	 
	return myColor;
     }
     /**
      * This will allow the action of displaying X's and O's when buttons are pressed. 
      **/

    public boolean matches( TicTacToeSquare sq )
     {
	 if(this.getText().equals(sq.getText()))
	     return true;
	 else
	     return false;
     }
    
}

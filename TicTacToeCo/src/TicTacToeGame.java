// TicTacToeGame.java
// Audrey St. John

// awt
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

// swing 
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;


/**
 * TicTacToe encapsulates the GUI for TicTacToePanel
 * It takes Xs, 0s' and " "s as input and when you press a single TicTacToeSquare a X, 0 or " " will show.
 **/
public class TicTacToeGame extends JPanel implements ActionListener
{ 
    //instance variables
    private int gridSize;
    protected TicTacToeSquare[][] board;
    private boolean turn;

    public static final int DEFAULT_SIZE = 3;

    // instance variable for winner
    private int n;
   
   
    //constructor
    public TicTacToeGame( int gridSize )
    {

	//call super constructor JPanel
	super();
	
	//use border layout will set the size each square to fit in each Panel
	this.setLayout(new BorderLayout());
	
	this.gridSize= gridSize;
	n = gridSize;
	turn = true;


	//call instance method to initialize the graphics
	initGUI();

    }
    public TicTacToeGame()
    {
	this(DEFAULT_SIZE);
    }
      /**
     * create GUI components
     **/ 

    public void setTurn()
    {
	if(turn == true)
	    turn = false;
	else
	    turn = true;
    }

	
    public void initGUI()
    {
	System.out.println("in initGUI (tttg). gridsize = " + gridSize);
	//first create label that will display
	//and add to north
     JLabel directions = new JLabel("<html><b><u>Tic Tic Toe!!!</u></b><br/>Click a square to place your piece.<br/>If you complete a row,      column or diagonal with your pieces,<br/>YOU'RE THE WINNER!!!<br/></html>");
     this.add(directions,BorderLayout.NORTH);
   
     //then, create panel to hold input
     JPanel grid = new JPanel();
     if(gridSize == 0){
	 gridSize = 3;
     }

     // use Grid Layout that will display 4 X 4 squares
     grid.setLayout( new GridLayout(gridSize,gridSize));

     /**
      * Create a for loop that will repeatedly create 4 rows and columns of TicTacToe squares
      **/ 
      board = new TicTacToeSquare[gridSize][gridSize];
	
      //for loop will create 4 squares in 4 rows
	for(int row = 0; row< gridSize; row++)
        {  
	    //for loop will create 4 squares in 4 columns
	    for(int col = 0; col < gridSize; col++)
            {
		//it will add the TicTacToeSquare to the grid panel
		//	board[row][col] = new TicTacToeSquare();
		board[row][col] = createTTTSquare();// create a new instance of a TicTacToeSquare
		grid.add( board[row][col] );
		board[row][col].addActionListener(this);
	    }
	}
	//add the grid to the Center
	this.add(grid,BorderLayout.CENTER);
	
	//then, add another label that will display
	//add to South

    }
    /**
     * Make a new TicTacToeSquare and return it.
     **/ 
    public TicTacToeSquare createTTTSquare()
    {
	return new TicTacToeSquare();
    }
       /** 
	 * Checks if the piece at (row,col) grid location completes a match,
	 * meaning a full row/column/diagonal of pieces that are all equal.
	 * Returns true if there is a match and false otherwise.
	 **/
     
    public boolean completesMatch( int row, int col)
    {
	System.out.println("you are completing match");
	int vert = 0;

	int hor = 0;

	int diag1 = 0;

	int diag2 = 0;

	for( int i = 0; i< n; i ++)
	    {
		if(board[row][col].matches(board[i][col]))
		   vert = vert +1;
		   if(vert == n)
		       return true;   
	    }

	for( int i = 0; i< n; i++)
		    { 
			if(board[row][col].matches(board[row][i]))
			    hor = hor + 1;
			if(hor == n)
			   return true;
		    }
   	for(int i = 0; i< n; i++)
	    {
		if(board[row][col].matches(board[i][i]))
		    diag1 = diag1 + 1;

		if(diag1 == n)
		    return true;
	    }	
	for( int i = 0; i< n; i++)
	  {
	      if(board[row][col].matches(board[i][i]))		  
	           if(diag2 == n)
		       return true;
	  }	
	return false;
    } 	
       public void actionPerformed(ActionEvent e)
    {


	for(int i = 0; i< n; i++)
	    {
		for(int j = 0; j< n; j++)
		    {   
			if ( board[i][j] == e.getSource() ){
			      board[i][j].refreshDisplay(turn);
			  setTurn();
			  completesMatch( i,j );
			  if(completesMatch(i,j) == true){
			      if(board[i][j].getText().equals("X") ){
				  Uwin("1");
			      } 
			      else {
				  Uwin("2");
			      }
			  }	  
			}
		    }
 
	   }
    }
    public void Uwin(String playernum)
    {
	
	JOptionPane.showMessageDialog(null,"Player " + playernum + " You Win!", " shows actionPerformed", JOptionPane.INFORMATION_MESSAGE);
	
    }
}
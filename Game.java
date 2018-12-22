package javagame;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
public class Game extends StateBasedGame
{
	
	public static final String gameName = "Bernards game!";
	public static final int menu = 0; 
	public static final int play = 1;

	// Constructor
	public Game(String gameName) 
	{
		// Calls super class StateBasedGame - creates title at top window
		super(gameName);
		// Add menu state to the game
		this.addState(new Menu(menu));
		// Add playing state to the game 
		this.addState(new Play(play));	
	}
	
	// Give this a list of states to tell the gamecontainer what kind of states
	// the game will consist of
	public void initStatesList(GameContainer gc) throws SlickException
	{
		// Tell about menu state
		this.getState(menu).init(gc, this);
		// Tell about play state
		this.getState(play).init(gc, this);
		// Show the user the menu state FIRST.
		this.enterState(menu);
	}
	
	
	public static void main(String[] args) 
	{
		// Create the window for the game
		AppGameContainer appgc; 
		
		try 
		{
			// Set the window to hold the game 
			appgc = new AppGameContainer(new Game(gameName));
			// Set the size of the window 640x360. Fullscreen? False
			appgc.setDisplayMode(1800, 900, false);
			// Create the window on the screen
			appgc.start();			
		} 
		catch (SlickException e) 
		{
			e.printStackTrace();
		}
	}

}
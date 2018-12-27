package javagame;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Play extends BasicGameState
{
	// Constructor
	public Play(int state)
	{
		
	}
	
	//
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException
	{
		
	}
	
	// Draw stuff on the screen. graphics objects draws the stuff.
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException
	{
		g.drawString("this is the play state", 100, 100);
	}
	
	// Update graphics for animation 
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException
	{
		
	}
	
	// Play state ID is 1
	public int getID()
	{
		return 1;
	}
	
}
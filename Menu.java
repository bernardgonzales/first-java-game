package javagame;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Menu extends BasicGameState
{
	public String mouse = "No mouse input";
	
	// Constructor
	public Menu(int state)
	{
		
	}
	
	//
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException
	{
		
	}
	
	// Draw stuff on the screen. graphics objects draws the stuff.
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException
	{
		g.drawString("Welcome!!!!", 50, 50);
		g.drawString(mouse, 300, 50);
		g.drawRect(50, 50, 100, 20); // x,y, width, height
		Image dino = new Image("/res/small-mario.png");
		g.drawImage(dino, 200, 130);
		
	}
	
	// Update graphics when things change
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException
	{
		int xpos = Mouse.getX();
		int ypos = Mouse.getY();
		mouse = "Mouse position: "+ xpos + "," + ypos;
	}
	
	// Menu state ID is 0
	public int getID()
	{
		return 0;
	}
	
}
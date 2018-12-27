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
		g.drawString("This is the menu state", 80, 70);
		g.fillOval(75,100,100,100);
		g.drawString(mouse, 50, 50);
	}
	
	// Update graphics when things change
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException
	{
		// Stores user's input from keyboard/mouse
		Input input = gc.getInput();
		int xpos = Mouse.getX();
		int ypos = Mouse.getY();
		
		mouse = "Mouse position: "+ xpos + "," + ypos;
		if((xpos>75 && xpos<175) && (ypos>700 && ypos<800))
		{
			if(input.isMouseButtonDown(0))
			{
				sbg.enterState(1);
			}
		}
	}
	
	// Menu state ID is 0
	public int getID()
	{
		return 0;
	}
	
}
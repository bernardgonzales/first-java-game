package javagame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Menu extends BasicGameState
{

	Image picture; 
	int pictureX = 250;
	int pictureY = 300; 
	
	// Constructor
	public Menu(int state)
	{
		
	}
	
	//
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException
	{
		picture = new Image("res/Dinosaur-PNG-HD.png");
	}
	
	// Draw stuff on the screen. graphics objects draws the stuff.
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException
	{
		g.drawImage(picture, pictureX, pictureY);
	}
	
	// Update graphics when things change
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException
	{
		Input input = gc.getInput();
		if (input.isKeyDown(Input.KEY_UP))
		{
			pictureY -= 4;
		}
		if (input.isKeyDown(Input.KEY_DOWN))
		{
			pictureY += 4;
		}
		if(input.isKeyDown(Input.KEY_LEFT))
		{
			pictureX -= 4;
		}
		if(input.isKeyDown(Input.KEY_RIGHT))
		{
			pictureX += 4;
		}
	}
	
	// Menu state ID is 0
	public int getID()
	{
		return 0;
	}
	
}
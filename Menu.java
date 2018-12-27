package javagame;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Menu extends BasicGameState
{
	Image startGame;
	Image exitGame; 
	Image iconLeft;
	Image iconRight;
	Image title; 
	Image layout;
	public String mouse = "No mouse input";
	
	// Constructor
	public Menu(int state)
	{
		
	}
	
	//
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException
	{
		startGame = new Image("res/start_game.png");
		exitGame = new Image("res/exit_game.png");
		iconRight = new Image("res/icon_right.png");
		iconLeft = new Image("res/icon_left.png");
		title = new Image("res/title.png");
		layout = new Image("res/layout.png");
	}
	
	// Draw stuff on the screen. graphics objects draws the stuff.
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException
	{
		layout.draw(0,0);

		g.drawString(mouse, 100, 800);
		title.draw(325,50);
		iconRight.draw(100,50);
		iconLeft.draw(1500,50);
		startGame.draw(600,500);
		exitGame.draw(600,700);

	}
	
	// Update graphics when things change
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException
	{
		int xpos = Mouse.getX();
		int ypos = Mouse.getY();
		mouse = "Mouse position: " + xpos + "," + ypos;
	
		Input input = gc.getInput();
		
		// START GAME button state change
		if ((xpos > 600 && xpos < 1100) && (ypos > 300 && ypos < 400))
		{
			// 0 is for left click. 1 for right click.
			if (input.isMouseButtonDown(0))
				sbg.enterState(1);
		}
		
		// EXIT GAME button state change
		if ((xpos > 600 && xpos < 1100) && (ypos > 115 && ypos < 200))
		{
			if (input.isMouseButtonDown(0))
				System.exit(0);
		}		
		
	
	}
	
	// Menu state ID is 0
	public int getID()
	{
		return 0;
	}
	
}
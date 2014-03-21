package Ant;

public class ant {
	private int colour;
	private int id;
	private boolean carry_food;
	private int direction;
	private int[] location;
	
	public ant(int colour, int id, int x, int y)
	{
		location = new int [2];
		this.colour = colour;
		this.direction = 0;
		location[0] = x;
		location[1] = y;
	}
	public void turn_left()
	{
		if(direction ==0)
		{
			direction = 5;
		}
		else
		{
			direction--;
		}
	}
	public void turn_right()
	{
		if(direction == 5)
		{
			direction = 0;
		}
		else
		{
			direction++;
		}
	}
	public void move_ahead()
	{
		if(direction ==0)
		{
			location[0]++;
		}
		else if(direction ==1)
		{
			location[1]++;
			if(location[1]%2!=0)
			{
				location[0]++;
			}
		}
		else if(direction ==2)
		{
			location[1]++;
			if(location[1]%2==0)
			{
				location[0]--;
			}
		}
		else if(direction ==3)
		{
			location[0]--;
		}
		else if(direction ==4)
		{
			location[1]--;
			if(location[1]%2==0)
			{
				location[0]--;
			}
		}
		else if(direction ==5)
		{
			location[1]--;
			if(location[1]%2!=0)
			{
				location[0]++;
			}
		}
	}
	public void sense_cell(int x, int y)
	{
		
	}
}

package World;

public class cell 
{
	private int specifier;
	private int amount_of_food;
	private int[] location;
	
	public cell(int specifier)
	{
		location = new int [2];
		this.specifier = specifier;
		if (specifier < 10)
		{
			amount_of_food = specifier;
		}
		else
		{
			amount_of_food = 0;
		}
	}
	public void set_location(int x, int y)
	{
		location[0] = x;
		location[1] = y;
	}
	public int get_amount_of_food()
	{
		return amount_of_food;
	}
	public int get_specifier()
	{
		return specifier;
	}
	public void food_decrease()
	{
		if (specifier<10 && amount_of_food > 0)
		{
			amount_of_food--;
		}
	}
	public void food_increase()
	{
		if (specifier<10)
		{
			amount_of_food++;
		}
	}
}

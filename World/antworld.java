package World;
import java.util.Random;

public class antworld
{
	private int worldsize_x;
	private int worldsize_y;
	private cell [][] grid;
	
	public antworld(int worldsize_x, int worldsize_y)
	{
		this.worldsize_x = worldsize_x;
		this.worldsize_y = worldsize_y;
		grid = new cell[worldsize_x*2][worldsize_y*2];
	}
	
	public void setcell(int row, int column, cell C)
	{
		grid[row*2][column*2] = C;
	}
	
	public void fillworld()
	{
		Random rangen = new Random();
		for(int i = 0; i< worldsize_x; i++)
		{
			cell C = new cell(10);
			this.setcell(0, i, C);
		}
		for (int row = 0; row < worldsize_y; row++)
		{
			for (int column = 0; column < worldsize_x; column++)
			{
				if (row > 0 && row < worldsize_y-1 && column > 0 && column < worldsize_x-1)
				{
					
				}
				else
				{
					
				}
			}
		}
	}
	
	public void printworld()
	{
		for(int i =0; i<worldsize_y*2;i++)
		{
			for(int j=0; j<worldsize_x*2;j++)
			{
				if (i % 2 == 0)
				{
					System.out.print(grid[i][j]+" ");
				}
				else
				{
					System.out.print(" a");
				}
			}
			System.out.println();
		}
	}
}


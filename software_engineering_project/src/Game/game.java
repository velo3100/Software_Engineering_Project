package Game;
import World.antworld;

public class game {
	public static void main(String[] args)
	{
		game g = new game();
	}
	public game()
	{
		int worldsize_x = 10;
		int worldsize_y = 10;
		rungame(worldsize_x, worldsize_y);
	}
	private void rungame(int worldsize_x, int worldsize_y)
	{
		antworld world = new antworld(worldsize_x, worldsize_y);
		world.printworld();
	}
}

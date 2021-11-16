package info.gridworld.testerASpec;

import info.gridworld.actor.*;
import info.gridworld.grid.*;

public class JumperRunnerASpec {

	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		Jumper frog = new Jumper();
		world.add(frog);
		frog.setDirection(Location.EAST);
		frog.moveTo(new Location(5, 3));

		Rock rock = new Rock();
		world.add(rock);
		rock.moveTo(new Location(5, 5));

		Jumper frog2 = new Jumper();
		world.add(frog2);
		frog2.moveTo(new Location(2, 4));
		frog2.setDirection(Location.EAST);

		Flower flower = new Flower();
		world.add(flower);
		flower.moveTo(new Location(2, 6));

		world.show();
	}
}

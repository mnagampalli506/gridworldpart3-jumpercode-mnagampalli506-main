package info.gridworld.testerBSpec;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import info.gridworld.actor.Jumper;

public class JumperRunnerBspec {

	public static void main(String[] args) {
		
		 ActorWorld world = new ActorWorld();
		 Jumper j = new Jumper();	 
	     world.add(j);
	     j.moveTo(new Location(1,1));
	     
	     world.show();
		
	}

}

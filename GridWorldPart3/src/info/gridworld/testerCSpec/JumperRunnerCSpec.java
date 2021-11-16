package info.gridworld.testerCSpec;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.*;
import info.gridworld.actor.*;

public class JumperRunnerCSpec {
	 public static void main(String[] args)
	    {
	        ActorWorld world = new ActorWorld();
	        
	        Jumper buggy = new Jumper();
	        world.add(buggy);
	        buggy.setDirection(90);
	        buggy.moveTo( new Location (0,9));
	        
	        
	        Jumper buggy2 = new Jumper();
	        world.add(buggy2);
	        buggy2.setDirection(-90);
	        buggy2.moveTo( new Location (5,0));
	        
	        
	       //world.add( new Bug());
	       // world.add(new Rock());
	        
	        world.show();
	    }

}

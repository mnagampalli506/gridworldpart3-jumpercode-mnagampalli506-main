package info.gridworld.testerDSpec;

import java.awt.Color;

import info.gridworld.actor.*;

import info.gridworld.grid.Location;

public class JumperRunnerDSpec {
	 public static void main(String[] args)
	    {
	        ActorWorld world = new ActorWorld();
	        Jumper frog = new Jumper();
	        world.add(frog);
	        frog.setDirection(Location.EAST);
	        frog.moveTo( new Location( 5, 3));
	        
	        
	        Actor actor = new Actor();
	        world.add(actor);
	        actor.setColor(Color.ORANGE);
	        actor.moveTo(new Location(5,5));
	        
	        
	       
	        
	        world.show();
	    }
}

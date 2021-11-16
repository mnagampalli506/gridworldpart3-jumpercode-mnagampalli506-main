package info.gridworld.actor;

import java.awt.Color;

import info.gridworld.grid.*;

public class Jumper extends Bug {

	public Jumper() {

		setColor(Color.RED);

	}

	public void turn() {
		super.turn();
	}

	public void move() {
		Grid<Actor> gr = getGrid();
		if (gr == null)
			return;
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		if (gr.isValid(next))
			moveTo(next);
		else
			removeSelfFromGrid();
	}

	public void act() {

		if (canJump()) {
			jump();
		} else if (!canJump() && canMove()) {
			move();
			while (!canMove()) {
				turn();
			}
		} else if (canMove()) {
			move();
		} else {
			turn();
		}

	}

	public boolean canMove() {
		Grid<Actor> gr = getGrid();
		if (gr == null)
			return false;
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		// If jump location is not occupied return true
		if (gr.isValid(next) && gr.get(next) == null)
			return true;

		return false;
	}

	public boolean canJump() {
		Grid<Actor> gr = getGrid();
		if (gr == null)
			return false;
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		Location afterNext = next.getAdjacentLocation(getDirection());

		// If jump location is not occupied return true
		if (gr.isValid(afterNext) && gr.get(afterNext) == null)
			return true;

		return false;
	}

	public void jump() {
		Grid<Actor> gr = getGrid();
		if (gr == null)
			return;
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		Location afterNext = next.getAdjacentLocation(getDirection());
		moveTo(afterNext);
	}
}

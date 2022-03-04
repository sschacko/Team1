import java.util.HashSet;
import java.util.ArrayList;
import javax.swing.JComponent;

public class PacMan{
	String myName;
	Location myLoc;
	Map myMap;
	Location shift;

	public PacMan(String name, Location loc, Map map) {
		this.myLoc = loc;
		this.myName = name;
		this.myMap = map;
	}

	public ArrayList<Location> get_valid_moves() {
		return null;
	}

	public boolean move() {
		return false;
	}

	public boolean is_ghost_in_range() {
		boolean foundGhost = false;

		if (myMap.getLoc(new Location(myLoc.x + 1, myLoc.y)).contains(Map.Type.GHOST)) {
			foundGhost = true;
		}

		else if (myMap.getLoc(new Location(myLoc.x - 1, myLoc.y)).contains(Map.Type.GHOST)) {
			foundGhost = true;
		}

		else if (myMap.getLoc(new Location(myLoc.x, myLoc.y + 1)).contains(Map.Type.GHOST)) {
			foundGhost = true;
		}

		else if (myMap.getLoc(new Location(myLoc.x, myLoc.y - 1)).contains(Map.Type.GHOST)) {
			foundGhost = true;
		}

		else if (myMap.getLoc(new Location(myLoc.x + 1, myLoc.y + 1)).contains(Map.Type.GHOST)) {
			foundGhost = true;
		}

		else if (myMap.getLoc(new Location(myLoc.x - 1, myLoc.y - 1)).contains(Map.Type.GHOST)) {
			foundGhost = true;
		}

		else if (myMap.getLoc(new Location(myLoc.x + 1, myLoc.y - 1)).contains(Map.Type.GHOST)) {
			foundGhost = true;
		}

		else if (myMap.getLoc(new Location(myLoc.x - 1, myLoc.y + 1)).contains(Map.Type.GHOST)) {
			foundGhost = true;
		}

		return foundGhost;
	}
  
	public JComponent consume() {
 		if(myMap.getLoc(myLoc).contains(Map.Type.COOKIE)) {
			return myMap.eatCookie(myName);
		} else {
			return null;
		}
	}
}

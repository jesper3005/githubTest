package taggame;

public class Room {
    String description;
    Room north, south, east, west;
    Room nLocked, sLocked, eLocked, wLocked;
    

    public void setLocked(Room locked) {
        this.nLocked = locked;
    }

    public void setnLocked(Room nLocked) {
        this.nLocked = nLocked;
    }

    public void setsLocked(Room sLocked) {
        this.sLocked = sLocked;
    }

    public void seteLocked(Room eLocked) {
        this.eLocked = eLocked;
    }

    public void setwLocked(Room wLocked) {
        this.wLocked = wLocked;
    }

    public Room getnLocked() {
        return nLocked;
    }

    public Room getsLocked() {
        return sLocked;
    }

    public Room geteLocked() {
        return eLocked;
    }

    public Room getwLocked() {
        return wLocked;
    }

    public Room getLocked() {
        return nLocked;
    }
    private boolean trap = false;


    public void setDescription(String description) {
        this.description = description;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public void setTrap(boolean trap) {
        this.trap = trap;
    }

    public String getDescription() {
        return description;
    }

    public Room getNorth() {
        return north;
    }

    public Room getSouth() {
        return south;
    }

    public Room getEast() {
        return east;
    }

    public Room getWest() {
        return west;
    }

    public boolean isTrap() {
        return trap;
    }

    public Room(String description) {
        this.description = description;
        
    }

    
   
    
   

  
    
}

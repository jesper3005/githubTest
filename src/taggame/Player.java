package taggame;

public class Player {

    String name;
    int health;
    int gold;
    private Room location;

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getGold() {
        return gold;
    }
    

    public void setLocation(Room location) {
        this.location = location;
    }

    public Room getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
        
    }

    
}

package taggame;

import java.io.File;
import static taggame.Display.playSound;

public class Controller {

    Display display = new Display();
    Player player;
    Room startRoom;                 //RUM 1
    Room hallRoom;                  //RUM 2
    Room livingRoom;                //RUM 3
    Room libaryRoom;                //RUM 4
    Room labatoryRoom;              //RUM 5
    Room diningRoom;                //RUM 6
    Room kitchenRoom;               //RUM 7
    Room officeRoom;                //RUM 8
    Room therapyRoom;               //RUM 9
    Room hallwayRoom;               //RUM 10
    Room corridorRoom;              //RUM 11
    Room corridorRoom1;             //RUM 12
    Room basementEntranceRoom;      //RUM 13
    Room basementCellRoom;          //RUM 14
    Room basementPrisonRoom;        //RUM 15
    Room weaponRoom;                //RUM 16
    Room tortureRoom;               //RUM 17
    Room treasureRoom;              //RUM 18
    Room bossRoom;                  //RUM 19    
    Room endRoom;                   //RUM 21

    File Door = new File("door.wav");
    File HeartBeat = new File("heartbeat.wav");
    File HountedHouse = new File("hauntedhouse.wav");

    public void start() throws InterruptedException {
        createRoom();
        playSound(HeartBeat);
        playSound(HeartBeat);
        player = new Player(display.nameInput(), 100);
        player.setLocation(startRoom);
        display.welcomeMessage();
        playSound(HountedHouse);
        System.out.println(player.getLocation().getDescription());

        while (true) {
            playerControl();
        }
    }

    private void nextRoom(String way) throws InterruptedException {
        Room room = player.getLocation();
        switch (way) {
            case "north":
                if (room.getEast() != null) {
                    player.setLocation(player.getLocation().getNorth());
                    playSound(Door);
                    display.transitText();
                    System.out.println(room.getDescription());
                } else {
                    System.out.println("There is no door!");
                }
                break;
            case "south":
                if (room.getEast() != null) {
                    player.setLocation(player.getLocation().getSouth());
                    playSound(Door);
                    display.transitText();
                    System.out.println(room.getDescription());
                } else {
                    System.out.println("There is no door!");
                }
                break;
            case "east":
                if (room.getEast() != null) {
                    player.setLocation(player.getLocation().getEast());
                    playSound(Door);
                    display.transitText();
                    System.out.println(room.getDescription());
                } else {
                    System.out.println("There is no door!");
                }
                break;
            case "west":
                if (room.getEast() != null) {
                    player.setLocation(player.getLocation().getWest());
                    playSound(Door);
                    display.transitText();
                    System.out.println(room.getDescription());
                } else {
                    System.out.println("There is no door!");
                }
                break;
        }
    }

    public void playerControl() throws InterruptedException {
        switch (display.playerInput()) {
            case "north":
            case "n":
                nextRoom("north");
                break;
            case "south":
            case "s":
                nextRoom("south");
                break;
            case "east":
            case "e":
                nextRoom("east");
                break;
            case "west":
            case "w":
                nextRoom("west");
                break;
            case "help":
            case "h":
                display.helpInput();
                break;
            case "exit":
            case "quit":
                display.Exit();
        }
    }

    public void ifWinCondition() {
        if (player.getLocation().equals(endRoom)) {
            System.exit(0);
        }
    }

    public void createRoom() {
        startRoom = new Room("\nYou wake up with a set! You quickly get yourself standing, and look around."
                + "\nWhere are you? What happend last night?"
                + "\nSlowly you remember walking down the dark path leading to the house, and that you ran in fear."
                + "\nCould this be that very mansion that you find yourself in?"
                + "\n"
                + "\nThis room seems like an entrance, it has no objects or furniture, "
                + "\nexcept a enormous carpet leading to a door east from you");          //Rum 1
        hallRoom = new Room("You are in large hallway, there is a statue to your left, its shiny like it has been polished recently."
                + " There is nothing else in this room, you see a door that goes south and east.");                //Rum 2
        livingRoom = new Room("");                  //Rum 3
        libaryRoom = new Room("");                  //Rum 4
        labatoryRoom = new Room("");                //Rum 5
        kitchenRoom = new Room("");                 //Rum 6
        diningRoom = new Room("");                  //Rum 7
        officeRoom = new Room("");                  //Rum 8
        therapyRoom = new Room("");                 //Rum 9
        hallwayRoom = new Room("");                 //Rum 10
        corridorRoom = new Room("");                //Rum 11
        corridorRoom1 = new Room("");               //Rum 12
        basementEntranceRoom = new Room("");        //Rum 13
        basementCellRoom = new Room("");            //Rum 14
        basementPrisonRoom = new Room("");          //Rum 15
        weaponRoom = new Room("");                  //Rum 16
        tortureRoom = new Room("");                 //Rum 17     
        treasureRoom = new Room("");                //Rum 18   
        bossRoom = new Room("");                    //Rum 19
        endRoom = new Room("");                     //Rum 20

        //Rum 1
        startRoom.setEast(hallRoom);
        //Rum 2    
        hallRoom.setSouth(livingRoom);
        hallRoom.setEast(kitchenRoom);
        hallRoom.setWest(null);
        //Rum 3
        livingRoom.setNorth(hallRoom);
        livingRoom.setSouth(labatoryRoom);
        livingRoom.setEast(diningRoom);
        livingRoom.setWest(libaryRoom);
        //Rum 4
        libaryRoom.setEast(livingRoom);
        //Rum 5
        labatoryRoom.setNorth(livingRoom);
        //Rum 6
        kitchenRoom.setSouth(diningRoom);
        kitchenRoom.setWest(hallRoom);
        //Rum 7
        diningRoom.setNorth(kitchenRoom);
        diningRoom.setWest(livingRoom);
        //Rum 8
        officeRoom.setNorth(therapyRoom);
        officeRoom.setSouth(corridorRoom);
        officeRoom.setwLocked(diningRoom);
        //Rum 9
        therapyRoom.setSouth(officeRoom);
        therapyRoom.setEast(hallwayRoom);
        //Rum 10
        hallwayRoom.setSouth(corridorRoom);
        hallwayRoom.setWest(therapyRoom);
        //Rum 11
        corridorRoom.setNorth(hallwayRoom);
        corridorRoom.setEast(corridorRoom1);
        corridorRoom.setWest(officeRoom);
        //Rum 12
        corridorRoom1.setNorth(basementEntranceRoom);
        corridorRoom1.setWest(corridorRoom);
        //Rum 13
        basementEntranceRoom.setNorth(weaponRoom);
        basementEntranceRoom.setSouth(corridorRoom1);
        basementEntranceRoom.setWest(tortureRoom);
        //Rum 14
        basementCellRoom.setSouth(weaponRoom);
        //Rum 15
        basementPrisonRoom.setSouth(treasureRoom);
        //Rum 16
        weaponRoom.setNorth(basementCellRoom);
        weaponRoom.setSouth(basementEntranceRoom);
        weaponRoom.setWest(treasureRoom);
        //Rum 17
        tortureRoom.setNorth(treasureRoom);
        tortureRoom.setSouth(bossRoom);
        tortureRoom.setWest(basementEntranceRoom);
        //Rum 18
        treasureRoom.setNorth(basementPrisonRoom);
        treasureRoom.setSouth(tortureRoom);
        treasureRoom.setEast(weaponRoom);
        treasureRoom.setWest(endRoom);
        //Rum 19
        bossRoom.setNorth(tortureRoom);
        //Rum20

    }

}

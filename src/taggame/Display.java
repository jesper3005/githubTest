package taggame;

import java.io.File;
import java.util.Scanner;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Display {
    Scanner sc = new Scanner(System.in);  
    
   
        
    public String playerInput() {        
        System.out.print("> ");
        String input = sc.next();
        
        System.out.println("Hej");
        return input.toLowerCase();
        
    }
    
    public String nameInput() throws InterruptedException {
        System.out.print("\nWhat is your name? ");
        String name = sc.next();
        System.out.println("\nWelcome " + name + " to the text adventure of Arkham Asylum!");
        Thread.sleep(1500);
        return name;
    }
    
    public void transitText() throws InterruptedException {
        System.out.println("Walking....");
        Thread.sleep(1500);
        System.out.println("You have entered a new room!");
    }
    
    public void welcomeMessage() {
        System.out.println("\nYou've been out drinking and find yourself on your way home"
                + "\nyou walk down a dark passage in belief that it will bring you home faster. "
                + "\nAt the end of the passage is a giant mansion, it looks abandonded until the light in one of the rooms turns on. "
                + "\nYou quickly turn around and start running as fast as possible but then, all of the sudden "
                + "\neverything..."
                + "\nturns... "
                + "\ndark..."
                + "\nIf you somehow can't figure out how to play the game, simply type in help/h");
    }
    
    public void helpInput() {
        System.out.println("\nDont worry, even the best needs help sometimes, kappa!"
                + "\nYou are playing a text adventure game, you need nothing but a keyboard."
                + "\nIf you feel like you want to exit the game type in exit/quit");
    }
    
    public void Exit() {
        System.out.println("\nDo you want to exit? The game can't be saved, and you will have to restart");
        String choice = sc.next();
        if(choice.equals("yes")) {
            System.exit(0);
        } else if (choice.equals("no")) {
            System.out.println("Type in your next move");
        }
    }
    
    public void takeAction() {
        
    }
    public static void slowPrint(String text) throws InterruptedException{
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            Thread.sleep(250);
        }
    }
     static void playSound(File Sound) {

        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();

            Thread.sleep(clip.getMicrosecondLength()/1000);
        } catch (Exception e)
        {
        }

    }
}

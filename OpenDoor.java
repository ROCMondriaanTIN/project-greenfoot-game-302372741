import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CloseDoorMid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OpenDoor extends HUD
{
      /**
     * Act - do whatever the ClosedDoorMid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
         applyVelocity();
         openDoor();
    }   
    public void openDoor()
    {
            setImage(new GreenfootImage("door_openMid.png"));
      }
    }


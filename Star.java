import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Star here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Star extends HUD
{
     public boolean isGepakt;
     public static int starTeller;
   
    public Star(boolean isGepakt)
    {
        this.isGepakt = isGepakt;
        setImage(new GreenfootImage("star.png"));
    }
    public void act() 
    {
        if (isGepakt == false)
        {
        applyVelocity();
        }
    
    }    

}

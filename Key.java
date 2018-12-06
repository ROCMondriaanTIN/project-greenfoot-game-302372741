import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Key here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Key extends HUD
{
    public boolean isGepakt;
    /**
     * Act - do whatever the Key wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Key(boolean isGepakt)
    {
        this.isGepakt = isGepakt;
    }  
    public void act() 
    {
        if (isGepakt == false)
        {
        applyVelocity();
    }
    }    
}

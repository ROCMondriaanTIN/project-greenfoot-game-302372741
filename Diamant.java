import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Diamant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Diamant extends HUD
{
    public boolean isGepakt;
    /**
     * Act - do whatever the Diamand wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Diamant(boolean isGepakt) 
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

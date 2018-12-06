import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenCoin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenCoin extends HUD
{
    public boolean isGepakt;
    /**
     * Act - do whatever the GreenCoin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GreenCoin(boolean isGepakt)
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

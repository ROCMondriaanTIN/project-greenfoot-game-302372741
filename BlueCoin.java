import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlueCoin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueCoin extends HUD
{
    public boolean isGepakt;
    /**
     * Act - do whatever the BlueCoin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BlueCoin(boolean isGepakt)
    {
        this.isGepakt = isGepakt;
        setImage("hud_p2Alt.png");
    }  
    public void act() 
    {
        if (isGepakt == false)
        {
        applyVelocity();
    }
    }    
}

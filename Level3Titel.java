import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Letter1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3Titel extends Actor
{
    /**
     * Act - do whatever the Letter1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        click();
    }    
    private void click()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new LevelSand());
        }
}
}

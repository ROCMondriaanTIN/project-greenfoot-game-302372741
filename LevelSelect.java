import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelSelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelSelect extends World
{

    /**
     * Constructor for objects of class LevelSelect.
     * 
     */
    public LevelSelect()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        prepare();
    }
    private void prepare()
    {
       Level1Titel level1titel = new Level1Titel();
       Level2Titel level2titel = new Level2Titel();
       Level3Titel level3titel = new Level3Titel();
       Level4Titel level4titel = new Level4Titel();
       Level5Titel level5titel = new Level5Titel();
       addObject(level1titel, 387, 282);
       addObject(level2titel, 585, 192);
       addObject(level3titel, 610, 410);
       addObject(level4titel, 443, 533);
       addObject(level5titel, 877, 755);
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("1"))
        {
            Greenfoot.setWorld(new MyWorld());
        }
        if(Greenfoot.isKeyDown("2"))
        {
            Greenfoot.setWorld(new LevelSnow());
        }
        if(Greenfoot.isKeyDown("3"))
        {
            Greenfoot.setWorld(new LevelSand());
        }
        if(Greenfoot.isKeyDown("4"))
        {
            Greenfoot.setWorld(new LevelForest());
        }
        if(Greenfoot.isKeyDown("5"))
        {
            Greenfoot.setWorld(new LevelCave());
        }
    }
}

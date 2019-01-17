import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelSelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public final class LevelSelect extends World
{
    /**
     * Constructor for objects of class LevelSelect.
     * 
     */
    public LevelSelect()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        addObject(new Level1Titel(), 330, 282);
        addObject(new Level2Titel(), 585, 192);
        addObject(new Level3Titel(), 610, 410);
        addObject(new Level4Titel(), 300, 533);
        addObject(new Level5Titel(), 610, 530);
    }
    
    
    public void clickLevel()
    {
        /*if(Greenfoot.mouseClicked(level1)== true)
        {
            Greenfoot.setWorld(new MyWorld());
        }
        /*if(Greenfoot.mouseClicked(Level2Titel.class))
        {
            Greenfoot.setWorld(new LevelSnow());
        }
        if(Greenfoot.mouseClicked(Level3Titel.class))
        {
            Greenfoot.setWorld(new LevelForest());
        }
        if(Greenfoot.mouseClicked(Level4Titel.class))
        {
            Greenfoot.setWorld(new LevelSand());
        }
        if(Greenfoot.mouseClicked(Level5Titel.class))
        {
            Greenfoot.setWorld(new LevelCave());
        }*/
    }    
        
    }


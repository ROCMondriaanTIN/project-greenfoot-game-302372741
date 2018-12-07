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
       addObject(new Level1Titel(), 387, 282);
       addObject(new Level2Titel(), 585, 192);
       addObject(new Level3Titel(), 610, 410);
       addObject(new Level4Titel(), 443, 533);
       addObject(new Level5Titel(), 877, 755);
    }
    /*public void click()
    {
         
    
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new MyWorld());
        }
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new LevelSnow());
        }
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new LevelForest());
        }
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new LevelSand());
        }
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new LevelCave());
        }
    }    */
        
    }


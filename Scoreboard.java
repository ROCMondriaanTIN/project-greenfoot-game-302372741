import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoreboard extends Actor
{
    private int xPositieStar = 30;
    private int xPositieKey = 30;
    private int xPositieDiamant = 945;
    private int xPositieBlueCoin = 945;
    private int xPositiePinkCoin = 945;
    private int xPositieGreenCoin = 945;
    private int score = 0;
    
    public void act()
    {
        
    }
    public void updateScoreStar()
    {
        score ++;
        getWorld().addObject(new Star(true), xPositieStar, 50);
        xPositieStar += 40;
    }
    public void updateScoreKey()
    {
        score ++;
        getWorld().addObject(new Key(true), xPositieKey, 110);
        xPositieKey += 40;
    }
    public void updateScoreDiamant()
   {
        score ++;
        getWorld().addObject(new Diamant(true), xPositieDiamant,50);
        xPositieDiamant -= 55;
    }
    public void updateScoreBlueCoin()
    {
        score ++;
        getWorld().addObject(new BlueCoin(true), xPositieBlueCoin,120);
        xPositieBlueCoin -= 55;
    }
    public void updateScorePinkCoin()
    {
        score ++;
        getWorld().addObject(new PinkCoin(true), xPositiePinkCoin,120);
        xPositiePinkCoin -= 55;
    }
    public void updateScoreGreenCoin()
    {
        score ++;
        getWorld().addObject(new GreenCoin(true), xPositieGreenCoin,120);
        xPositieGreenCoin -= 55;
    }
}

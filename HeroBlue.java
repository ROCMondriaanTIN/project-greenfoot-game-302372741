import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HeroBlauw here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HeroBlue extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    private int charStatus = 1;
    GreenfootImage[] images = new GreenfootImage[11];
    int imageNumber;
    public static int HudSter = 0;
    
  
    
    Scoreboard sb;
    
    
    
    public HeroBlue() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.6;
        setImage("p3_stand.png");
        GreenfootImage myImage = getImage();
        int myNewHeigth = (int) myImage.getHeight()*3/4;
        int myNewWidth = (int)myImage.getWidth()*3/4;
        myImage.scale(myNewWidth, myNewHeigth);
        for( int i=0; i<images.length; i++ ) images[i] = new GreenfootImage( "p3_walk" + (i+1) + ".png" );
        setImage( images[imageNumber] );
    }
    public int charCoin;
    @Override
    public void act() {
        handleInput();
        charSwitch();
        
        
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        if (sb == null){
            sb = new Scoreboard();
            getWorld().addObject(sb, -10, -10);
        }
        
        applyVelocity();

        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                Greenfoot.playSound("oehsound.wav");
                getWorld().removeObject(this);
                
                return;
            }
        
        }
       
        
        
        for (Actor ClosedDoorMid : getIntersectingObjects(ClosedDoorMid.class)) {
            if ( ClosedDoorMid != null) {
                Greenfoot.setWorld(new LevelForest());
                return;
            }
        }
            
        Actor Star = getOneIntersectingObject(Star.class); 

        if(Star != null) { 
            getWorld().removeObject(Star); 
            sb.updateScoreStar();
            
            
        } 
   
        Actor Key = getOneIntersectingObject(Key.class); 

        if(Key != null) { 
            getWorld().removeObject(Key); 
            sb.updateScoreKey();
            
        } 
        Actor Diamant = getOneIntersectingObject(Diamant.class); 

        if(Diamant != null) { 
            getWorld().removeObject(Diamant); 
            sb.updateScoreDiamant();
            
        } 
        Actor BlueCoin= getOneIntersectingObject(BlueCoin.class); 

        if(BlueCoin != null) { 
            getWorld().removeObject(BlueCoin); 
            sb.updateScoreBlueCoin();
            
            charCoin ++;
            charStatus = 2;
        } 
        Actor PinkCoin = getOneIntersectingObject(PinkCoin.class);
        if(PinkCoin != null) { 
            getWorld().removeObject(PinkCoin); 
            sb.updateScorePinkCoin();
            
            charCoin ++;
            charStatus = 3;
        }
        Actor GreenCoin = getOneIntersectingObject(GreenCoin.class);
        if(GreenCoin != null) { 
            getWorld().removeObject(GreenCoin); 
            sb.updateScoreGreenCoin();
            
            charCoin ++;
            charStatus = 1;
        }
        
            
        
    }
        
    
    public void animation()
    {
        imageNumber = ( imageNumber + 1 ) % images.length;
        setImage( images[imageNumber] );
    }  
    public boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Tile.class);
        return under != null;
    }
        
    public void handleInput() {
        if ((Greenfoot.isKeyDown("up"))&&(onGround()== true)) {
            velocityY = -15;
        }

        if (Greenfoot.isKeyDown("left")) {
            if (onGround() == true) {
                animation();
            }
            velocityX = -10;
        } else if (Greenfoot.isKeyDown("right")) {
            if (onGround() == true) {
                animation();
            }
            velocityX = 10;
    }
}

    public int getWidth() {
        return getImage().getWidth() - 5;
    }

    public int getHeight() {
        return getImage().getHeight() - 5;
    }
    public void charSwitch(){
        switch (charStatus) {
            case 1: setImage("p1_stand.png");
                    break;
            case 2: setImage("p2_stand.png");
                    break;
            case 3: setImage("p3_stand.png");
                    break;
    }
    }
}     

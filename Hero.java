import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    public static int starteller;
    private final double gravity;
    private final double acc;
    private final double drag;
    protected static int karakter;
    public static int wereld = 1;
    private int charStatus = 1;
    GreenfootImage[] images = new GreenfootImage[11];
    int imageNumber;
    public static int HudSter = 0;
    public boolean right = true;
    public boolean mirror = true;
    public int frame;
    public int getal;
   
  
    
    Scoreboard sb;
    
    
    
    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.6;
        setImage("p1_stand.png");
        //GreenfootImage myImage = getImage();
        //int myNewHeigth = (int) myImage.getHeight()*3/4;
        //int myNewWidth = (int)myImage.getWidth()*3/4;
        //myImage.scale(myNewWidth, myNewHeigth);
        //for( int i=0; i<images.length; i++ ) images[i] = new GreenfootImage( "p1_walk1.png");
        //setImage( images[imageNumber] );
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
                setLocation(200, 300);
                Greenfoot.setWorld(new GameOver());
                getWorld().removeObject(this);
                
                return;
            }
        }  
        for (Actor waterTile : getIntersectingObjects(WaterTile.class)) {
            if (waterTile != null) {
                setLocation(200, 300);
                Greenfoot.setWorld(new GameOver());
                getWorld().removeObject(this);
            }
        }
        
    
        for (Actor ClosedDoorMid : getIntersectingObjects(OpenDoor.class)) {
            if ( ClosedDoorMid != null) {
                if(starteller == 3){
                    Greenfoot.setWorld(new LevelSelect());   
                    return;
                } else {
                }
                
            }
        }
            
        Actor Star = getOneIntersectingObject(Star.class); 

        if(Star != null) { 
            getWorld().removeObject(Star); 
            sb.updateScoreStar();
            starteller ++;
  
            
            
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
    public void Animate(){
    switch(frame){
    case 1:
    setImage("p1_walk01.png");
    break;
    case 2:
    setImage("p1_walk02.png");
    break;
    case 3:
    setImage("p1_walk03.png");
    break;
    case 4:
    setImage("p1_walk04.png");
    break;
    case 5 :
    setImage("p1_walk05.png");
    case 6 :
    setImage("p1_walk06.png");
    break;
    case 7:
    setImage("p1_walk07.png");
    break;
    case 8 :
    setImage("p1_walk08.png");
    case 9 :
    setImage("p1_walk09.png");
    break;
    case 10:
    setImage("p1_walk10.png");
    break;
    case 11:
    setImage("p1_walk11.png");
    
    frame=0;
    break;
}
frame++;
mirrorImage();
}
public void AnimateRoze(){
    switch(frame){
    case 1:
    setImage("p3_walk01.png");
    break;
    case 2:
    setImage("p3_walk02.png");
    break;
    case 3:
    setImage("p3_walk03.png");
    break;
    case 4:
    setImage("p3_walk04.png");
    break;
    case 5 :
    setImage("p3_walk05.png");
    case 6 :
    setImage("p3_walk06.png");
    break;
    case 7:
    setImage("p3_walk07.png");
    break;
    case 8 :
    setImage("p3_walk08.png");
    case 9 :
    setImage("p3_walk09.png");
    break;
    case 10:
    setImage("p3_walk10.png");
    break;
    case 11:
    setImage("p3_walk11.png");
    
    frame=0;
    break;
}
frame++;
mirrorImage();
}
public void AnimateBlauw(){
    switch(frame){
    case 1:
    setImage("p2_walk01.png");
    break;
    case 2:
    setImage("p2_walk02.png");
    break;
    case 3:
    setImage("p2_walk03.png");
    break;
    case 4:
    setImage("p2_walk04.png");
    break;
    case 5 :
    setImage("p2_walk05.png");
    case 6 :
    setImage("p2_walk06.png");
    break;
    case 7:
    setImage("p2_walk07.png");
    break;
    case 8 :
    setImage("p2_walk08.png");
    case 9 :
    setImage("p2_walk09.png");
    break;
    case 10:
    setImage("p2_walk10.png");
    break;
    case 11:
    setImage("p2_walk11.png");
    
    frame = 0;
    break;
}
frame++;
mirrorImage();
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
    public void mirrorImage(){
        if (mirror && right){ 
    getImage().mirrorHorizontally();
}
    else if (!mirror && right){
    getImage().mirrorHorizontally();
}
}

}     
    
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelCave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelCave extends World
{
    
    private CollisionEngine ce;
    
    /**
     * Constructor for objects of class LevelCave.
     * 
     */
    public LevelCave()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1, false); 
        
        int map [][] = {
            {150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150},
{150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150},
{150,-1,-1,-1,-1,-1,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,-1,-1,-1,-1,-1,-1,-1,150},
{150,-1,-1,-1,-1,-1,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,-1,-1,-1,-1,-1,-1,-1,150},
{150,-1,-1,-1,-1,-1,-1,-1,150,150,150,150,150,150,-1,-1,-1,-1,102,-1,-1,-1,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,-1,-1,-1,-1,-1,-1,-1,150},
{150,-1,-1,-1,-1,-1,-1,-1,150,150,150,150,150,150,-1,-1,-1,-1,104,-1,-1,-1,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,-1,-1,-1,-1,-1,-1,-1,150},
{150,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,104,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,96,-1,-1,-1,-1,-1,-1,-1,-1,150},
{150,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,128,-1,104,-1,128,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,96,126,-1,-1,-1,-1,-1,-1,-1,150},
{150,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,-1,104,-1,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,150},
{150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,-1,104,-1,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150},
{150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,-1,104,-1,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150},
{150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,-1,104,-1,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150},
{150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,-1,104,-1,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150},
{150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,-1,104,-1,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150},
{150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,-1,104,-1,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150},
{150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,-1,104,-1,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150},
{150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,-1,104,-1,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150},
{150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,-1,104,-1,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150},
{150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,-1,104,-1,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150},
{150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,-1,104,-1,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150},
{150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,-1,104,-1,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150},
{150,150,150,150,150,150,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,104,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,150,150,150,150,150,150,150,150},
{150,150,150,150,150,150,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,104,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,150,150,150,150,150,150,150,150},
{150,150,150,150,150,150,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,104,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,150,-1,-1,-1,-1,-1,-1,150},
{150,150,150,150,150,150,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,104,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,99,-1,-1,-1,-1,-1,-1,150},
{150,150,-1,-1,-1,151,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,104,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,99,-1,-1,-1,-1,-1,-1,150},
{150,150,-1,-1,-1,151,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,104,128,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,99,-1,-1,-1,-1,-1,-1,150},
{150,150,97,97,165,150,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,154,-1,-1,-1,-1,-1,-1,-1,-1,-1,165,165,165,165,165,165,165,150},
{150,150,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,-1,-1,-1,-1,-1,-1,-1,-1,-1,165,150,150,150,150,150,150,150,150},
{150,150,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,-1,-1,-1,-1,-1,-1,-1,-1,165,150,150,150,150,150,150,150,150,150},
{150,150,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,-1,-1,-1,-1,152,165,165,165,150,150,150,150,150,150,150,150,150,150},
{150,150,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,-1,-1,-1,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,150},
{150,150,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,-1,-1,-1,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,150},
{150,150,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,165,-1,-1,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,150},
{150,150,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,-1,-1,-1,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,150},
{150,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,-1,-1,-1,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,150},
{150,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,-1,-1,-1,-1,165,150,150,150,150,150,150,150,150,150,150,150,150,150},
{150,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,-1,-1,-1,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,150},
{150,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,-1,-1,-1,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,150},
{150,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,165,-1,-1,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,150},
{150,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,-1,-1,-1,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,150},
{150,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,-1,-1,-1,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,150},
{150,-1,-1,165,165,165,165,165,165,165,165,165,165,165,165,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,-1,-1,-1,-1,165,150,150,150,150,150,150,150,150,150,150,150,150,150},
{150,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,-1,-1,-1,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,150},
{150,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,-1,-1,-1,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,150},
{150,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,165,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,150},
{150,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,150},
{150,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,150},
{150,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,150},
{150,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,165,165,165,165,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,150},
{150,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,165,150,150,150,150,165,165,165,165,165,165,165,165,165,165,165,165,150},


    };
    // Declareren en initialiseren van de TileEngine klasse om de map aan de world toe te voegen
        TileEngine te = new TileEngine(this, 60, 60, map);
        // Declarenre en initialiseren van de camera klasse met de TileEngine klasse 
        // zodat de camera weet welke tiles allemaal moeten meebewegen met de camera
        Camera camera = new Camera(te);
        // Declareren en initialiseren van een main karakter van het spel mijne heet Hero. Deze klasse 
        // moet de klasse Mover extenden voor de camera om te werken
        Hero hero = new Hero();

        // Laat de camera een object volgen. Die moet een Mover instatie zijn of een extentie hiervan.
        camera.follow(hero);

        // Alle objecten toevoegen aan de wereld: camera, main karakter en mogelijke enemies
        addObject(camera, 0, 0);
        addObject(hero, 96, 433);
        addObject(new Enemy(), 871, 3170);
        
        // Initialiseren van de CollisionEngine zodat de speler niet door de tile heen kan lopen.
        // De collision engine kijkt alleen naar de tiles die de variabele solid op true hebben staan.
        ce = new CollisionEngine(te, camera);
        // Toevoegen van de mover instantie of een extentie hiervan
        ce.addCollidingMover(hero);
    }
        
    @Override
    public void act() {
        ce.update();
    }
}


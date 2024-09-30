import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{

    Label titleLabel = new Label("Hungry elephant", 60); 
    Label instructions = new Label("Use <- and -> to move", 40);
    Label instructionPlay = new Label("press <SPACE> to start!", 40);
    GreenfootSound bgMusic = new GreenfootSound("Peace Of Mind (Instrumental).mp3");
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, getWidth()/2, getHeight()/6);
        addObject(instructions, getWidth()/2, getHeight()/3); 
        addObject(instructionPlay, getWidth()/2, getHeight()/2); 
        prepare();
        
    }

    public void act()
    {
        bgMusic.playLoop(); 
        
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld(); 
            Greenfoot.setWorld(gameWorld);
            bgMusic.stop();
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,288,306);
    }
}

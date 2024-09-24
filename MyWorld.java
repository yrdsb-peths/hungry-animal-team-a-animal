import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        spawnFood();
        
    }
    

    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }

    public void spawnFood()
    {
        int rand = Greenfoot.getRandomNumber(2);
        Food food;
        if(rand == 0) {
            food = new Apple();
        } else {
            food = new Cherry();
        }
        int x = Greenfoot.getRandomNumber(600);
        addObject(food, x, 0);
    }
        
}



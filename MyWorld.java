import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    GreenfootSound bgMusic = new GreenfootSound("Peace Of Mind (Instrumental).mp3");
    public int score = 0;
    Label scoreLabel;
    
    int level = 1;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        bgMusic.playLoop(); 
        spawnFood();
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300,300);
        
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    

    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }

    
    public void increaseScore(int value)
    {
        score++;
        scoreLabel.setValue(score); 
        if(score % 5 == 0)
        {
            level += 1;
        }
    }
    
    
    public void spawnFood()
    {
        int rand = Greenfoot.getRandomNumber(2);
        Food food;
        if(rand == 0) {
            Apple apple = new Apple();
            apple.setSpeed(level);
            int x = Greenfoot.getRandomNumber(600);
            int y = 0; 
            addObject(apple, x, y);
        } else {
            Cherry cherry = new Cherry();
            cherry.setSpeed(level);
            int x = Greenfoot.getRandomNumber(600);
            int y = 0; 
            addObject(cherry, x, y);
        }
    }
        
}



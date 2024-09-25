import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{    

    GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");

    //arrays for directions elephant is facing
    GreenfootImage[] idleRight = new GreenfootImage[8];
    GreenfootImage[] idleLeft = new GreenfootImage[8];
    
    //direction elephant is facing
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    
    /**
     * Constructor
     */
    public Elephant()
    {
        //set up array for elephant animations
        for(int i = 0; i < idleRight.length;i++)
        {
            idleRight[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
        }
        for(int i = 0; i < idleLeft.length;i++)
        {
            idleLeft[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleLeft[i].mirrorHorizontally();
        }
        
        animationTimer.mark();
        
    }
    
    /**
     * Animate the elphant
     */
    int imageIndex = 0;
    public void animateElephant()
    {
        if(animationTimer.millisElapsed() < 100)
        {
            return;
        }
        animationTimer.mark();
        
        if(facing.equals("right"))
        {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        }
        else
        {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
    }
    
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            move(-5);
            facing = "left"; 
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(5);
            facing = "right"; 
        }
        
        //remove apple and spawn new one if elephant eats it
        eat();
        
        //animate elephant
        animateElephant();
    }
    
    /**
     * Eat the apple and spawn new apple if apple is eaten
     */
    public void eat()
    {
        if(isTouching(Food.class))
        {
            elephantSound.play();
            removeTouching(Food.class);
            //cast back world elephant class lives in to call methods in world class
            MyWorld world = (MyWorld) getWorld();
            
            //call createApple and increaseScore classes
            world.spawnFood();
            //world.increaseScore();
        }
    }
}

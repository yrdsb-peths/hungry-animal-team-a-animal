import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor implements Moveable
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
    
    
    public void move()
    {
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
    }
    
    
    public void act()
    {
        // Add your action code here.
        //move method from interface. 
        move(); 
        
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
        Actor actor = getOneIntersectingObject(Food.class); 
        
        if(actor != null)
        {
            Food food = (Food) actor;
            elephantSound.play();            
            MyWorld world = (MyWorld) getWorld();
            
            //call createApple and increaseScore classes
            world.spawnFood();
            
            world.increaseScore(food.value);
            getWorld().removeObject(food);
        }
    }
}

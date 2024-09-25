import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{    
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            move(-5);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(5);
        }
        
        //remove apple and spawn new one if elephant eats it
        eat();
    }
    
    /**
     * Eat the apple and spawn new apple if apple is eaten
     */
    public void eat()
    {
        if(isTouching(Food.class))
        {
            removeTouching(Food.class);
            
            //cast back world elephant class lives in to call methods in world class
            MyWorld world = (MyWorld) getWorld();
            
            //call createApple and increaseScore classes
            world.spawnFood();
            //world.increaseScore();
                    }
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Food implements Destructible, Moveable
{
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */    
    
    public Apple()
    {
        super(5);
    }
    
    public void act()
    {
        move();
        destroy(); 
    }
    
    public void destroy()
    {
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this); 
        }
    }
    
    public void move()
    {
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y); 
    }
}

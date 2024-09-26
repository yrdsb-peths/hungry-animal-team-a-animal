import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Food
{
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed;// = 1;
    
    public Apple()
    {
        super(1);
    }
    
    
    public void act()
    {
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y); 
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this); 
        }
    }
    
    public void setSpeed(int spd)
    { 
        speed = spd; 
    } 
    
}

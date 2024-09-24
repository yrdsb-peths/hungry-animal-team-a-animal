import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cherry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cherry extends Food
{
    /**
     * Act - do whatever the Cherry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Cherry()
    {
        super(10); 
    }
    
    public void act()
    {
        setLocation(getX(), getY() + 4);
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.removeObject(this); 
        }
    }
}

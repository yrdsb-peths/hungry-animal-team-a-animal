import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public abstract class Food extends Actor {
    int value,speed;
    
    public Food(int value) {
        this.value = value;
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}

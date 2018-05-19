import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tutorial extends World
{

    /**
     * Constructor for objects of class tutorial.
     * 
     */
    public tutorial()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
     private void prepare()
    {
       kembali back = new kembali();
       addObject(back, 75,278);    
    }
}

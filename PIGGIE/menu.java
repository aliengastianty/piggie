import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menu extends World
{
    public static GreenfootSound titleSound;
    
    /**
     * Constructor for objects of class menu.
     * 
     */
    public menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();   
        if(this.getClass(). getName(). equalsIgnoreCase("menu"))
        {
            titleSound = new GreenfootSound("lagu.mp3");
            titleSound.stop();
        titleSound.setVolume(50);
        titleSound.playLoop();
    }
            
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        mulai mulai = new mulai();       
        addObject(mulai,383,289);
    
    }
}

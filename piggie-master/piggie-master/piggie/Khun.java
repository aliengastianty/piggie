import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Khun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Khun extends Actor
{
    private boolean jatuh;
    private int y=3;
    private int cepat=1;
    private int naik=10;
    /**
     * Act - do whatever the Khun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       move();
    } 
    public void move()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            loncat();
        }
    }
    public void loncat()
    {
        if(jatuh==false)
        {
            y=-naik;
            bawah();
        }
    }
    public void bawah()
    {
        jatuh=true;
    }
}

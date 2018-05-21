import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class akhir here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class akhir extends Actor
{
    /**
     * Act - do whatever the akhir wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       prepare();
    } 
    public void prepare()
    {
       out kel = new out();
       addObject(kel , 400, 278);
    }
}

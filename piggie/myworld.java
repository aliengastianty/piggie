import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class myworld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class myworld extends World
{
    int jeda=100;
    /**
     * Constructor for objects of class myworld.
     * 
     */
    public Khun khun= new Khun();
    public Pohon pohon = new Pohon();
    public myworld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        addObject(khun,getWidth()/10,getHeight()/2);
    }
    public void act(){
    if(jeda==0){
    addObject(new Pohon(), getWidth(), getHeight());
    jeda=100;
   }
   else{
    jeda--;
   }
}
}

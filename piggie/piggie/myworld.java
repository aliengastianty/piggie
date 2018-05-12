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
    public Pohon1 pohon = new Pohon1();
    public Kalah kalah = new Kalah();
    public Background Background = new Background();
    public myworld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Khun(),50 ,210);
    }
    

    public void act(){
    if(jeda==0){
        addObject(new Pohon1(),555, 220);
        jeda=50;
   }
   else{
    jeda--;
   }
   
}

}

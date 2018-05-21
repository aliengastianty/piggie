import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Khun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Khun extends Actor
{
    int a=2;//percepatan
    int v=1;//kecepatan
    public static GreenfootSound titleSound;
    /**
     * Act - do whatever the Khun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     // Add your action code here.
        setLocation(getX(),getY()+v);
        v+=a;//v=v+a
        
        if(Greenfoot.isKeyDown("up")){
            v=-20;
            }       
            else
               setLocation(50,210); 
               {
                   if (isTouching(Pohon1.class)){
                       Greenfoot.stop();
                            titleSound = new GreenfootSound("lagu.mp3");
                            titleSound.stop();
                       getWorld().addObject(new akhir() , 300, 200);
                       getWorld().addObject(new btn_rst(), 500, 320);                   
                           {
                             if(Greenfoot.mouseClicked(this))
                              {
                               Greenfoot.setWorld(new menu());
                              } 
                                }                            
                }                
            }
  }
    }




     
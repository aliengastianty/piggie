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
    /**
     * Act - do whatever the Khun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     // Add your action code here.
        setLocation(getX()+1,getY()+1+v);
        v+=a;//v=v+a
        
        if(Greenfoot.isKeyDown("up")){
            v=-20;
            }
            else
               setLocation(50,210);   
               {
                   if (isTouching(Pohon1.class)){
                       Greenfoot.stop();
                       getWorld().addObject(new Kalah() , 300, 210);
                      
                    }
                } 
            }
            public void moveKhun()
            {
                if(Greenfoot.isKeyDown(""))
                {
                    move(7);
                    }
                    if(Greenfoot.isKeyDown("right"))
                    {
                        move(7);
                        }
                
            }
            }


    
    
        
      
   


        
        
    
                  
                        
                
                       
       
    
    



     
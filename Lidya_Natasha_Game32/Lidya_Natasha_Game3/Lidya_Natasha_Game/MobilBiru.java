import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MobilBiru here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MobilBiru extends Pendukung
{
    int speed = 3;
    public void act()
    {
        MobilBiru a = new MobilBiru();
        Actor i = getOneIntersectingObject(MobilBiru.class);
        move(speed);
        checkdouble(i);
        end();
    }
}

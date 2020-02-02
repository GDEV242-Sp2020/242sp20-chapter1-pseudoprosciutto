/**
 * This class represents a simple picture.
 * 
 * You can set it to black-and-white display and back to colors.
 *
 * This class was adapted to draw my own image 
 * using code originating from Michael Kšlling and David J. Barnes
 * 
 * @author Matthew Sheehan
 * @version 2020.02.02
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Person person;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        person = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.changeColor("blue");
            wall.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
           
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
    }
    
    /**
     * Create a sunset - moves sun vertically down off the screen.
     */
    public void sunset()
    {
        sun.slowMoveVertical(300);
        comeHome(); //Person walks up to house after sunset
    }
    
    /**
     * Person walks up to house
     */
    public void comeHome()
    {          
        person.moveHorizontal(-50);
        person.moveVertical(140);
        person.makeVisible();
        person.slowMoveVertical(-100);
    }
        
}

/**
 * This class represents a simple picture of a Firetruck and a fireman.
 * 
 * You can set it to black-and-white display and back to colors.
 *
 * @author Matthew Sheehan
 * @version 2020.02.02
 */
public class MyPictureFireTruck
{
    private Square ground;
    
    private Square sky;
    private Triangle window1;
    private Square window2;
    private Square truck1;
    private Square truck2;
    private Square truck3;
    private Square truck4;
    private Square truck5;
    private Circle wheelBack;
    private Circle wheelFront;
    private Person person;
    private boolean drawn;

    /**
     * Constructor for objects of class MyPictureFireTruck
     */
    public MyPictureFireTruck()
    {
        ground = new Square();
        sky = new Square();
        window1 = new Triangle();
        window2 = new Square();
        truck1 = new Square();
        truck2 = new Square();  
        truck3 = new Square();
        truck4 = new Square();  
        
        wheelBack = new Circle();
        wheelFront = new Circle();
        person = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            sky.setAll("sky",500,0,0);
            sky.makeVisible();
            
            ground.changeSize(500);
            ground.setPosition(0,180);
            ground.changeColor("ground");
            ground.makeVisible();
    
            truck1.changeSize(80);
            truck1.makeVisible();
            
            truck2.changeSize(80);
            truck2.moveHorizontal(-60);
            truck2.makeVisible();
            
            truck3.changeSize(80);
            truck3.moveHorizontal(-120);
            truck3.makeVisible();

            truck4.setAll("red", 30, 380, 170);
            truck4.makeVisible();

            window1.setAll("window",40,50,385,130);
            window1.makeVisible();
            
            window2.setAll("window",40, 335, 130);
            window2.makeVisible();
            
            wheelBack.setAll("black",40,210,175);
            wheelBack.makeVisible();
           
            wheelFront.setAll("black",40,340,175);
            wheelFront.makeVisible();
            
            person.setAll("black",60,30,160,190);
            person.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        sky.changeColor("white");
        ground.changeColor("white");
        truck1.changeColor("black");
        truck2.changeColor("black");
        truck3.changeColor("black");
        truck4.changeColor("black");
        window1.changeColor("white");
        window2.changeColor("white");
        wheelFront.changeColor("black");
        wheelBack.changeColor("black");
        person.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        sky.changeColor("sky");
        ground.changeColor("ground");
        truck1.changeColor("red");
        truck2.changeColor("red");
        truck3.changeColor("red");
        truck4.changeColor("red");
        window1.changeColor("window");
        window2.changeColor("window");
        wheelBack.changeColor("black");
        wheelFront.changeColor("black");
        person.changeColor("black");
    }
    
 
}

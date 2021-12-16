import java.io.File;
import java.io.IOException;

public class TestPic
{
    public static void main(String[] args)
    {
        // Get a reference to the canvas for this drawing and set its title.
        Canvas pic = Canvas.getCanvas();
        pic.setTitle("Shapes Constructor Test Picture");
        
        // Draw my picture
        Circle c1 = new Circle(175,75,450,Canvas.getColor("red"));
        Circle c2 = new Circle(280,275,25,Canvas.getColor("black"));
        Circle c3 = new Circle(500,275,25,Canvas.getColor("black"));
        Circle c4 = new Circle(300,525,50,Canvas.getColor("black"));
        Circle c5 = new Circle(460,525,50,Canvas.getColor("black"));
        Arc a1 = new Arc(150,75,150,120,150,Canvas.getColor("white"));
        Arc a2 = new Arc(500,75,150,270,150,Canvas.getColor("white"));
        Arc a3 = new Arc(247,218,110,135,180,Canvas.getColor("black"));
        Arc a4 = new Arc(445,218,110,225,180,Canvas.getColor("black"));
        Arc a5 = new Arc(250,225,100,135,180,Canvas.getColor("white"));
        Arc a6 = new Arc(450,225,100,225,180,Canvas.getColor("white"));
        Rect r1 = new Rect(220,150,100,74,Canvas.getColor("white"));
        Rect r2 = new Rect(480,150,100,74,Canvas.getColor("white"));
        Triangle t1 = new Triangle(400,350,200,300,Canvas.getColor("red"));
        c1.makeVisible();
        t1.makeVisible();
        c4.makeVisible();
        c5.makeVisible();
        a1.makeVisible();
        a2.makeVisible();
        a3.makeVisible();
        a4.makeVisible();
        a5.makeVisible();
        a6.makeVisible();
        r1.makeVisible();
        r2.makeVisible();
        c2.makeVisible();
        c3.makeVisible();
        

        // Save the picture to a file
        String filename = "testpic.png";
        try {
            pic.saveToFile(new File(filename));
            System.out.println("Picture saved to " + filename);
        } catch (IOException e) {
            System.err.println(e);
            System.err.println("Could not save file.");
        }
    }
}
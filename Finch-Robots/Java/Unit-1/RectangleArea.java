/*
Unit 1-Lesson 3?
You just did the HelloName.java program.
In this lesson, we will create a formula for solving the area of a rectangle.
Let's go!
*/

public class RectangleArea
{ 
    public static void main(String[] args) { 
        double l = Double.parseDouble(args[0]);
        double w = Double.parseDouble(args[1]);

        double area = l*w;

        System.out.println(area);
    }
}

/*
Now can you modify the program above to solve for the area of a circle?
*/

import java.util.*;

class Area {
    double rad;
    int length, breadth;

    // Constructor for circle
    Area(double r) {
        rad = r;
    }

    // Constructor for rectangle
    Area(int l, int b) {
        length = l;
        breadth = b;
    }

    // Method to calculate the area of the circle
    double CircleAr() {
        return Math.PI * rad * rad;
    }

    // Method to calculate the area of the rectangle
    int RectArea() {
        return length * breadth;
    }

    // Main method
    public static void main(String[] args) {
        Area arCir = new Area(5.0); // Create object for circle
        System.out.println("Area of Circle: " + arCir.CircleAr()); // Call the method to calculate the circle's area

        // If you want to test for a rectangle, you can also add this:
        Area arRect = new Area(4, 6); // Create object for rectangle
        System.out.println("Area of Rectangle: " + arRect.RectArea()); // Call the method to calculate rectangle area
    }
}

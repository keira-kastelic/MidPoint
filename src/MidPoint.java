import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MidPoint {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);// prompting user for coordinates for two points
        System.out.println("Enter the x coordinate for the first point");
        int x1 = s.nextInt(); // creating point objects with those coordinates
        System.out.println("Enter the f coordinate for the first point");
        int y1 = s.nextInt();
        System.out.println("Enter the x coordinate for the second point");
        int x2 = s.nextInt();
        System.out.println("Enter the y coordinate for the second point");
        int y2 = s.nextInt();
        Point p1 = new Point (x1, y1);
        Point p2 = new Point (x2, y2);
        System.out.println("Your first point is...");
        System.out.println(p1);
        System.out.println("Your second point is...");
        System.out.println(p2);
        double p1x = p1.getX();
        double p1y = p1.getY();
        double p2x = p2.getY();
        double p2y = p2.getY();
        int midPointX = (int)((p1x + p2x)/2);
        int midPointY = (int)((p1y + p2y)/2);
        Point midPoint = new Point (midPointX, midPointY);
        System.out.println("The mid point is...");
        System.out.println(midPoint);
    }
}

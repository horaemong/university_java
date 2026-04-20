import java.util.Scanner;

public class Point {

    // TODO: Define the data fields of the Point class.
    private double point_x = 0;
    private double point_y = 0;
    private int quadrant;

    // TODO: Define the constructors of the point class.
    Point() {
        setQuadrant();
    }

    Point(double x, double y){
        point_x = x;
        point_y = y;
        setQuadrant();
    }
    // TODO: Define the instance methods of the Point class.
    double getxCoordinate() {
        return point_x;
    }

    double getyCoordinate() {
        return point_y;
    }

    int getQuadrant() {
        return quadrant;
    }

    void setQuadrant() {
        if (point_x > 0 && point_y > 0) {
            quadrant = 1;
        } else if (point_x < 0 && point_y > 0) {
            quadrant = 2;
        } else if (point_x < 0 && point_y < 0) {
            quadrant = 3;
        } else if (point_x > 0 && point_y < 0) {
            quadrant = 4;
        } else {
            quadrant = 0;
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter point 1: ");
        double x = in.nextDouble();
        double y = in.nextDouble();
        Point p1 = new Point(x, y);
        
        System.out.print("Enter point 2: ");
        x = in.nextDouble();
        y = in.nextDouble();
        Point p2 = new Point(x, y);
        
        System.out.println("Quadrant of (" + p1.getxCoordinate() + ", " + 
        		+ p1.getyCoordinate() + ") = " + p1.getQuadrant());
        System.out.println("Quadrant of " + "(" + p2.getxCoordinate() + ", " + 
        		+ p2.getyCoordinate() + ") = " + p2.getQuadrant());
        
        System.out.println("Distance between 2 points (" + p1.getxCoordinate() 
        		+ ", " + p1.getyCoordinate() + ") and (" + p2.getxCoordinate() 
        		+ ", " + p2.getyCoordinate() + ") = "
        		+ String.format("%.2f", distanceBetweenPoints(p1, p2)) );
        
        in.close();
        
    }

    public static double distanceBetweenPoints(Point p1, Point p2) {
        // TODO: Write definition for this static method.
        return Math.sqrt(Math.pow(p1.getxCoordinate() - p2.getxCoordinate(), 2)
                + Math.pow(p1.getyCoordinate() - p2.getyCoordinate(), 2));

    }

}
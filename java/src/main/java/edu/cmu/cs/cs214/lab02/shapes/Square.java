package edu.cmu.cs.cs214.lab02.shapes;

public class Square implements Shape {
    private double sideLen;

    public Square(double sideLen) {
        this.sideLen = sideLen;
    }
    
    public double getArea() {
        return sideLen * sideLen;
    }

    public void draw() {
        double area = this.getArea();
        System.out.println("Shape printed\n" + "Its area is " + area);
    }
}

package org.fasttrackIT;

public class Divide {
    double x;
    double y;

    public Divide(double x,double y) {
        this.x = x;
        this.y = y;
    }

    public double getTotal() {
        return x / y;
    }

    public void getResult() {
        System.out.println("If you Divide " + x + " to " + y + " you get the total of " + getTotal());
    }
}

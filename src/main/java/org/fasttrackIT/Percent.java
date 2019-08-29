package org.fasttrackIT;

public class Percent {

    double x;
    double y;

    public Percent(double percent, double total) {
        this.x = percent;
        this.y = total;
    }

    public double getTotal() {

        return (x / y) * 100;

    }

    public void getResult() {
        System.out.println("The " + x + " % of " + y + " is equal to " + getTotal());
    }
}

package org.fasttrackIT;

public class Multiply {
    int x;
    int y;

    public Multiply(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getTotal() {
        return x * y;
    }

    public void getResult() {
        System.out.println("If you multiply " + x + " to " + y + " you get the total of " + getTotal());
    }
}

package org.fasttrackIT;

public class Minus {
    int a;
    int b;

    public Minus(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getTotal() {

        return a - b;
    }

    public void getResult() {
        System.out.println("The number " + a + " - " + b + " is equal to " + getTotal());
    }
}

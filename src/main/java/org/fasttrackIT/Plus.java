package org.fasttrackIT;

public class Plus {
    int a;
    int b;

    public Plus(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getTotal() {

        return a + b;
    }

    public void getResult() {
        System.out.println("The total between " + a + " + " + b + " is equal to " + getTotal());
    }

}

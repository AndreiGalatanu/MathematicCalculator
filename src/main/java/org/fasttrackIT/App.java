package org.fasttrackIT;


public class App {
    public static void main(String[] args) {
        // This is a Plus
    Plus one =new Plus(5,10);
        System.out.println("Using Plus");
    one.getTotal();
        System.out.println("Total is "+one.getTotal());
        one.getResult();
        // This is a Multiply
        Multiply two= new Multiply(5,18);
        System.out.println("Using multiply");
        System.out.println("Total is "+two.getTotal());
        two.getResult();
        //This is Divide
       Divide three=new Divide(110,20);
        System.out.println("Using Divide");
        System.out.println("Total is "+three.getTotal());
        three.getResult();
       //This is using Percent
        Percent four =new Percent(31,60);
        System.out.println("Using Percentage");
        System.out.println("Total is "+four.getTotal()+" %");
       four.getResult();
       //This is Minus
        Minus five = new Minus(10,2);
        System.out.println("Using Minus");
        System.out.println("Total is "+five.getTotal()+"");
        five.getResult();
    }
}

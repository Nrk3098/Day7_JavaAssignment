//Program6: To demonstrate static variable, method and block
package com.basicjava;

public class StaticDemo {
    static int a=5;
    static int b;
    static int count=0;
    public static void increment() {

      count++;

    }
    static{
        System.out.println("Static block executed");
        b=a+4;
    }
    public static void main(String args[]) {
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println("initial count: "+count);
        increment();
        increment();
        System.out.println("final count: "+count);


    }

}

/**
 * 
 */
package com.bhuwan.java.basics.immutable;

/**
 * Without using new operator it is possible to create a object for the classes. Such type of classes objects we can called it as
 * first-class objects.
 * 
 * @author bhuwan
 */
public class StringDemo {
    Integer a = 5;

    public static void main(String[] args) {
        String name = "Bhuwan Gautam";
        System.out.println("name: " + name);
        name.concat(" My Address");
        System.out.println("name: " + name);
        // name = name.concat(" My Address 2");
        // System.out.println("name: " + name);

        // mutable class
        StringBuffer name1 = new StringBuffer("Bhuwan Gautam2");
        System.out.println("name: " + name1);
        name1.append(" My Address");
        System.out.println("name: " + name1);

        // mutable class
        StringBuilder name2 = new StringBuilder("Bhuwan Gautam3");
        System.out.println("name: " + name2);
        name2.append(" My Address");
        System.out.println("name: " + name2);

    }

    /**
     * Add two primitive type integers.
     * 
     * @param a
     * @param b
     * @return
     */
    public double add(int a, int b) {
        return a + b;
    }
}

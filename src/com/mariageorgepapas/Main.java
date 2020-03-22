package com.mariageorgepapas;

public class Main {

    public static void main(String[] args) {
	    // byte
        // short
        // int
        // long                     These are the 8 Primitive Data Types
        // float
        // double
        // char
        // boolean
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);                         // here numberString is treated as a String and not

        String lastString = "10";                                 // as an int.
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is equal to " + lastString);     // there is no addition here because you can
        double doubleNumber = 120.47d;                                  // not add a String and an int, so lastString
        lastString = lastString + doubleNumber;                         // is printed out as the two numbers next to
        System.out.println("lastString is equal to " + lastString);     // one another.
    }
}

package com.proftelran.org.lessonfour;

public class ChildTwo extends Parent{

    public static final String HELLO = "Hello";

//    public static printHello() {
//        System.out.println("Hello I am a child two ");
//    }

    @Override
    public void printGreetings() {
        System.out.println("Hello I am a child two " + name);
    }

    public void printAll(){
        printGreetings();
        printThanks();
        printWishes();
    }
}

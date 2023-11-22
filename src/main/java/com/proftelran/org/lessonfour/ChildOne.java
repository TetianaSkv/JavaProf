package com.proftelran.org.lessonfour;

public class ChildOne extends MiddleChild{




    @Override
    public void printGreetings() {
        System.out.println("Hello I am a child one");
    }
    public static ChildOne create(){
        return new ChildOne();
    }
}

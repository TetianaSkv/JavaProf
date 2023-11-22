package com.proftelran.org.LessonTwo;

public class LittleCat extends Cat {

    public LittleCat(int age) {
        super(age); // call constructor for Cat
    }

    public void jump(){
        System.out.println("I can jump"); // метод только для этого класса
    }

}

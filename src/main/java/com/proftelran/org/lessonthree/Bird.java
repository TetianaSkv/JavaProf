package com.proftelran.org.lessonthree;

public class Bird implements Flyable, Eatable{
    @Override
    public void fly() {
        System.out.println("I am a bird, I can fly");
    }

    @Override
    public boolean canEat() {
        return true;
    }
}

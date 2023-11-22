package com.proftelran.org.LessonTwo;

public class SeaCat extends  BigCat {
    public SeaCat(int age) {
        super(age);
    }

    public void swim(){
        System.out.println("I can swim ");
    }


    @Override
    public void voice() {
        System.out.println("Hello"); // наследование от гланого Родителя BigCat
    }
}

package com.proftelran.org.LessonTwo;

//import com.proftelran.org.lessonone.Dog;

public class LessonTwoApp {
    public static void main(String[] args) {
        Cat cat = new Cat(15);
        cat.voice();
        // наследование из другого класса
        // com.proftelran.org.lessonone.Dog dog = new com.proftelran.org.lessonone.Dog();
        cat.setColor("Red");

        WildCat wildCat = new WildCat(10);
        wildCat.voice();
        int age = wildCat.getAge();
        wildCat.setColor("While");


        LittleCat littleCat = new LittleCat(20);
        littleCat.voice();
        littleCat.jump();
        littleCat.setColor("Black");

        LittleCat littleCatTwo = new LittleCat(30);
        littleCatTwo.voice();
        littleCatTwo.setColor("Yellow");

        SeaCat seaCat = new SeaCat(57);
        seaCat.voice();
        seaCat.setHeight(20);
        seaCat.swim();
        seaCat.setColor("Blue");


        System.out.println("Color Cat = " + cat.getColor());
        System.out.println("Color WildCat = " + wildCat.getColor());
        System.out.println("Color LittleCat = " + littleCat.getColor());
        System.out.println("Color LittleTwoCat = " + littleCatTwo.getColor());
        System.out.println("Color SeaCat = " + seaCat.getColor());

    }
}

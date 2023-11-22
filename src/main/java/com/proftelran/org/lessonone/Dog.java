package com.proftelran.org.lessonone;

public class Dog {

   private String breed;
   private int age;
   private String color;
   private int weight;

    public Dog() {
        System.out.println("Hello from construction without params");
    }

    public Dog(String breed, String color) {
        System.out.println("Hello from construction with params");
        this.breed = breed;
        this.color = color;
    }

    public Dog(String breed, int age, String color, int weight) {
        this.breed = breed;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color){
       this.color = color;
   }
   public String getColor(){
       return color;
   }


    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}


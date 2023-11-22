package com.proftelran.org.LessonTwo;

public class WildCat extends Cat{

    public WildCat(int age) {
        super(age);
    }

    @Override // подсказка нам
    public void voice() {
        //super.voice(); //закоментить, чтоб добавить.изменить св-во, т.к оно вызывает метод из родителя
        System.out.println("AAAAAAAA!");
    }

    public void print(){
        super.voice(); // обратиться к методу родит. класса
    }
}

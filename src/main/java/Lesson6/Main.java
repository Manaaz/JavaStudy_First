package Lesson6;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args){

        Cat cat1 = new Cat("Kuzya");
        Cat cat2 = new Cat("Vasya");
        Cat cat3 = new Cat("Leonid");
        Dog dog1 = new Dog("Juchka");
        Dog dog2 = new Dog("Belka");

        cat1.run(300);
        cat1.swim(10);

        cat2.run(150);
        cat3.swim(0);

        cat3.run(100);
        cat3.swim(-10);

        dog1.run(300);
        dog1.swim(100);

        dog2.run(600);
        dog2.swim(5);

        System.out.println("Cat counter: " + cat1.CAT_COUNTER + " (" + "Animal counter: " + cat1.COUNTER + ")");
        System.out.println("Dog counter: " + dog2.DOG_COUNTER + " (" + "Animal counter: " + cat2.COUNTER + ")");
    }
}

abstract class Animal{

    static final AtomicInteger COUNTER = new AtomicInteger(0);

    private int maxDistanceRun;
    private int maxDistanceSwim;
    private String kindAnimal = "";
    private String name = "";

    public Animal(String name, String kindAnimal, int maxDistanceRun, int maxDistanceSwim){
        this.name = name;
        this.kindAnimal = kindAnimal;
        this.maxDistanceRun = maxDistanceRun;
        this.maxDistanceSwim = maxDistanceSwim;
        COUNTER.addAndGet(1);
    }

    public void run(int distance){
        String textTemplate = getTemplate();
        distance = getMaxDistance(distance, this.maxDistanceRun);
        if(isEqualsZero(distance)){
            System.out.println(textTemplate + " can`t run!");
        } else {
            System.out.println(textTemplate + " run " + distance);
        }
    }

    public void swim(int distance){
        String textTemplate = getTemplate();
        distance = getMaxDistance(distance, this.maxDistanceSwim);
        if(isEqualsZero(distance)){
            System.out.println(textTemplate + " can`t swim!");
        } else {
            System.out.println(textTemplate + " swim " + distance);
        }
    }

    private int getMaxDistance(int distance, int MaxDistance){
        if(MaxDistance < distance && distance > 0){
            distance = MaxDistance;
        } else if (distance < 0){
            distance = 0;
        }
        return distance;
    }

    private boolean isEqualsZero(int value){
        return Objects.equals(value, 0);
    }

    private String getTemplate(){
        return this.kindAnimal + " " + this.name;
    }
}

class Cat extends Animal{

    static final AtomicInteger CAT_COUNTER = new AtomicInteger(0);

    public Cat(String name) {
        super(name, "Cat", 200, 0);
        CAT_COUNTER.addAndGet(1);
    }

}

class Dog extends Animal{

    static final AtomicInteger DOG_COUNTER = new AtomicInteger(0);

    public Dog(String name){
        super(name, "Dog", 500, 10);
        DOG_COUNTER.addAndGet(1);
    }

}
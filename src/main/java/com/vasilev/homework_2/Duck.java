package com.vasilev.homework_2;

public class Duck extends Animal implements Flying{
    @Override
    public void say(){
        System.out.println("Кря");
    }
    @Override
    public void fly() {
        System.out.println("Я лечу");
    }
}
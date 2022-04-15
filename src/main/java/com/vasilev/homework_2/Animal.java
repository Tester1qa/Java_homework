package com.vasilev.homework_2;

public class Animal {
    private String name;
    private int age;
    private int weight;
    private String color;

    void fly() {
        System.out.println();
    }

    public void say(){
        System.out.println("Я говорю");
    }
    public void go(){
        System.out.println("Я иду");
    }
    public void drink(){
        System.out.println("Я пью");
    }
    public void eat(){
        System.out.println("Я ем");
    }

    public String getAge (int num) {
        int a = num % 100 / 10;
        if (a == 1) {
            return " лет";
        }
        switch (num % 10) {
            case 1:
                return " год";
            case 2:
            case 3:
            case 4:
                return " года";
            default:
                return " лет";
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Привет! меня зовут " + name + '\'' +
                ", мне " + age + getAge(age) +
                ", я вешу " + weight + " кг" +
                ", мой цвет " + color + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
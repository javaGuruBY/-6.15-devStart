package com.tutrit.java.quickstart.bean;

import java.util.Objects;

public class Animal {
    private int age;
    private double price;
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Double.compare(animal.price, price) == 0 && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, price, name);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}

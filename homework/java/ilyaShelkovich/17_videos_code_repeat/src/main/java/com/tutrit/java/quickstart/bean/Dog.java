package com.tutrit.java.quickstart.bean;

import java.util.Objects;

public class Dog extends Animal {

    private String collar;


    public Dog(int a, double b) {
        this.setAge(a);
        this.setPrice(b);
    }

    public Dog() {
    }

    public String getCollar() {
        return collar;
    }

    public void setCollar(String collar) {
        this.collar = collar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(collar, dog.collar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), collar);
    }

    @Override
    public String toString() {
        return super.toString() + "<-Dog{" +
                "collar='" + collar + '\'' +
                '}';
    }
}

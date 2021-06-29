package com.tutrit.java.quickstart.bean;

import java.util.Objects;

public class Wolf extends Animal{

    private String pride;

    public Wolf() {
    }

    public String getPride() {
        return pride;
    }

    public void setPride(String pride) {
        this.pride = pride;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wolf)) return false;
        if (!super.equals(o)) return false;
        Wolf wolf = (Wolf) o;
        return Objects.equals(pride, wolf.pride);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pride);
    }

    @Override
    public String toString() {
        return super.toString() + "Wolf{" +
                "pride='" + pride + '\'' +
                '}';
    }
}

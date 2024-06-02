package com.hamzakh.prototype;

import java.util.Objects;

public class ConcreteCell implements Cell {
    private final String geneticMaterial;
    private final int age;

    public ConcreteCell(String geneticMaterial, int age) {
        this.geneticMaterial = geneticMaterial;
        this.age = age;
    }

    public ConcreteCell(ConcreteCell otherCell) {
        this.geneticMaterial = otherCell.geneticMaterial;
        this.age = otherCell.age;
    }

    @Override
    public ConcreteCell copy() {
        return new ConcreteCell(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConcreteCell otherCell = (ConcreteCell) obj;
        return age == otherCell.age &&
                Objects.equals(geneticMaterial, otherCell.geneticMaterial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(geneticMaterial, age);
    }
}

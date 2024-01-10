package com.armaan.wineanddinebackend.TypeClasses;

public class Supplement {

    private String description;
    private String name;

    public Supplement() {

    }

    public Supplement(String description, String name) {
        this.description = description;
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Supplement [description=" + description + ", name=" + name + "]";
    }

}

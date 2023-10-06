package org.example;

public class Sheep implements AnimalPrototype{
    private String name;

    public Sheep(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public AnimalPrototype clone() {
        return new Sheep(this.name);
    }
}

package com.serenitydojo;

public class Dog {
    String name;
    String favoriteToy;
    int age;

    public Dog(String name, String toy, int age) {
        this.name = name;
        this.favoriteToy = toy;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getFavoriteToy() {
        return this.favoriteToy;
    }

    public int getAge(){
        return this.age;
    }
}

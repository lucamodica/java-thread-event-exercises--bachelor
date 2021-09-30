package org.prog3.turn3.model;

import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    ArrayList<Item> ownedItems;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        ownedItems = new ArrayList<>();
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

    public void addItem(Item item){
        ownedItems.add(item);
    }

    public void removeItem(Item item){
        if (ownedItems.contains(item)){
            ownedItems.remove(item);
        }
    }

    public int totalValue(){
        int sum = 0;
        for (Item item : ownedItems) {
            sum += item.getValue();
        }

        return sum;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ownedItems=" + ownedItems +
                '}';
    }
}

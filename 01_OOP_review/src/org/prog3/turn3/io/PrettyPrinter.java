package org.prog3.turn3.io;

import org.prog3.turn3.model.Item;
import org.prog3.turn3.model.Person;

import java.util.ArrayList;

public class PrettyPrinter {

    public static ArrayList<Person> createPeople(){
        ArrayList<Person> people = new ArrayList<>();

        Person p1 = new Person("Luca", 21);
        p1.addItem(new Item("xbox", 300));
        p1.addItem(new Item("tablet", 400));
        p1.addItem(new Item("cuscino", 30));

        Person p2 = new Person("Andrea", 21);
        p2.addItem(new Item("xbox", 300));
        p2.addItem(new Item("tablet", 400));
        p2.addItem(new Item("cuscino", 30));

        Person p3 = new Person("Marco", 21);
        p3.addItem(new Item("xbox", 300));
        p3.addItem(new Item("tablet", 400));
        p3.addItem(new Item("cuscino", 30));

        people.add(p1);
        people.add(p2);
        people.add(p3);

        return people;
    }

    public static void printPeople(ArrayList<Person> people){
        for (Person person : people) {
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("Name: " + person.getName() + ", Age: " +
                    person.getAge() + ", Owned Value: " + person.totalValue());
        }
        System.out.println("------------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        ArrayList<Person> people = createPeople();
        printPeople(people);
    }
}

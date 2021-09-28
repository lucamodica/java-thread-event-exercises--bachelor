package org.prog3.turn3.model;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person person = new Person("Luca", 21);

    @org.junit.jupiter.api.Test
    void totalValue() {
        person.addItem(new Item("xbox", 300));
        person.addItem(new Item("tablet", 400));
        person.addItem(new Item("cuscino", 30));
        assertEquals(730, person.totalValue());
        assertNotEquals(740, person.totalValue());
    }
}
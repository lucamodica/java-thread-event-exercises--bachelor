package org.prog3.turn3.model;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    Library library;

    @org.junit.jupiter.api.BeforeEach
    void setUp(){
        library = new Library();
    }

    @org.junit.jupiter.api.Test
    void capacity() {
        assertEquals(0, library.capacity());
    }

    @org.junit.jupiter.api.Test
    void addBook() {
        library.addBook(new Book("Divina Commedia", "Dante Alighieri", 1000));
        assertEquals(1,library.capacity());
    }
}
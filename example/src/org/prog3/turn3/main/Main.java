package org.prog3.turn3.main;

import org.prog3.turn3.model.Book;
import org.prog3.turn3.model.Library;

public class Main {

    public static Library createLibrary(){
        Library library = new Library();
        library.addBook(new Book("Divina Commedia", "Dante Alighieri", 1000));
        library.addBook(new Book("I Promessi Sposi", "Alessandro Manzoni", 600));
        library.addBook(new Book("Il fu Mattia Pascal", "Giovanni Pirandello", 500));

        return library;
    }

    public static void main(String[] args) {
        Library library = createLibrary();
        library.printLibrary();
    }
}

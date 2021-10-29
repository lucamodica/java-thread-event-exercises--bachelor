package main;

import kernel_modulo.SortableArray;
import modules.SortableListImpl;

public class mainSortableList {

    public static void main(String[] args) {

        //Test with String element
        SortableArray<String> arrString = new SortableArray<>(new SortableListImpl());
        arrString.add("ciao");
        arrString.add("iao");
        arrString.add("aaaaa");
        //arrString.add(3);
        arrString.sort();
        arrString.print();

        //Test with Integer element
        SortableArray<Integer> arrInt = new SortableArray<>(new SortableListImpl());
        arrInt.add(3);
        arrInt.add(1);
        arrInt.add(2);
        //arrInt.add("caio");
        arrInt.sort();
        arrInt.print();

    }
}

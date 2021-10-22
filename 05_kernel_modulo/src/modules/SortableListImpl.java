package modules;

import kernel_modulo.SortableList;

import java.util.ArrayList;
import java.util.Comparator;

public class SortableListImpl implements SortableList {

    private ArrayList arr;

    public SortableListImpl() {
        this.arr = new ArrayList();
    }

    @Override
    public void add(Comparable c) {
        arr.add(c);
    }

    @Override
    public void remove(Comparable c) {
        arr.remove(c);
    }

    @Override
    public void sort() {
        arr.sort(null);
    }

    @Override
    public void print() {
        System.out.println(arr);
    }
}

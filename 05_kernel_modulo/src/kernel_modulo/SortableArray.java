package kernel_modulo;

public class SortableArray <T extends Comparable>{

    private SortableList sortableList;

    public SortableArray(SortableList sortableList) {
        this.sortableList = sortableList;
    }

    public void addModulo(SortableList sortableList){
        this.sortableList = sortableList;
    }

    public void add(T elem){
        sortableList.add(elem);
    }

    public void remove(T elem){
        sortableList.remove(elem);
    }

    public void sort(){
        sortableList.sort();
    }

    public void print(){
        sortableList.print();
    }
}

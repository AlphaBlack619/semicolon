package MyList;

public class LinkList {
    private int size;
    private int capacity;
    private Object [] elementLIst;
    private boolean isEmpty;

    public LinkList(int capacity){
        this.capacity = capacity;
        elementLIst = new Object[capacity];
    }
    public LinkList(){
        capacity = 10;
        elementLIst = new Object[capacity];
    }

    public Object getFirst() {

            return elementLIst[0];


    }

    public Object getLast() {
        return elementLIst[size];
    }

}

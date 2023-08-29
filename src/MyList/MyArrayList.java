package MyList;

import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.List;

public class MyArrayList {
    private Object[] list;
    private int size;
    private boolean isEmpty;
    private int capacity;
    public MyArrayList(){
        list = new Object[10];

    }
    public MyArrayList(int size){
        this.size = 0;
        capacity = size;
        list = new Object[capacity];

    }



    public Object[] getList() {
        return list;
    }

    public void setList(Object[] list) {
        this.list = list;
    }
    public void sort(){
        Object e1 = list[0];
        for (int x = 0; x < capacity; x++){
            for (int y = 0; y < capacity; y++){
                Integer t = (Integer) list[x], u = (Integer) list[y];
                if (t < y){
                    list[x] = list[y];}}}
    }
    public void replaceAll(Object o){
        for (int x = 0; x < capacity; x++) {
            list[x] = o;
        }
    }
    public void trimToSize(){
        capacity = size;
    }
    public void ensureCapacity(int minCapacity){
        if (capacity == size){
            capacity *= minCapacity;
        }
    }
    public Object clone() throws CloneNotSupportedException {
        try {
            Object clone = super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        Object [] newList;
        newList = list;
        return newList; }



    public int size() {
        return size;
    }


    public boolean isEmpty() {
        isEmpty = size != 0;
        return isEmpty;
    }
    public boolean contains(Object o) {
        for (Object element: list) {
            if (o == element){
                return true;
            }
        }
        return false;
    }


    public void iterator () {
        Iterator<Object> objectIterator  = Arrays.stream(list).iterator();
        while (Arrays.stream(list).iterator().hasNext()){
            System.out.println(Arrays.stream(list).iterator());
        }
    }


    public Object  [] toArray() {
        return new Object[0];
    }
    public void add(Object o) {
        if (size < capacity){
            list[size] = o;
            size = size + 1;
        }
        else if (size == capacity){
            ensureCapacity(2);
            list[size] = o;
            size = size + 1;

        }
    }
    public boolean remove(Object o) {
        int z = size;
        return false;
    }
    public void addAll(Collection<Object>collection) {
        for (Object collection1: collection ) {

        }

    }
    public void addAll(int i,  Collection collection) {

    }
    public void clear() {
        size = 0;

    }
    public Object get(int i) {
        Object element = null;
        for (int x = 0; x < capacity; x++){
            if (x == i){
                element = list[x];
            }
        }
        return element;
    }
    public Object set(int i, Object o) {

        return null;
    }
    public void add(int i, Object o) {
        list[i] = o;
        size+=1;

    }
//    public Object remove(int i) {
//
//        return null;
   // }
    public int indexOf(Object o) {
        int xy = 0;
        for (int x = 0; x < capacity; x++){
            if (list[x] == o){
                xy = x;
            }
        }
        return xy;
    }
    public int lastIndexOf(Object o) {
        int xy = 0;
        for (int x = 0; x < capacity; x++){
            if (list[x] == o){
                xy = x;
            }
        }
        return xy;
    }
//    @NotNull
//    public ListIterator<Object> listIterator(int i) {
//        return null;
//    }

    @NotNull
    public List<Object> subList(int i, int i1) {
        List<Object> xy = Collections.singletonList(new MyArrayList());
        return xy;
    }

    public boolean retainAll(List<Object> collection) {
        return false;
    }
    public boolean removeAll( List<Object>collection) {
        for (Object element: collection ) {
            for (Object ee: list ) {

            }
        }
        return false;
    }
    public boolean containsAll( List<Object> collection) {
        boolean checker = false;
        for (Object ee: list  ) {
        for (Object element: collection) {
            checker = element == ee;

        }}
        return checker;
    }

    @NotNull
    public Object @NotNull [] toArray(@NotNull Object @NotNull [] objects) {
        Object [] newList;
        newList = new Object[size];
        newList = list;
        return newList;
    }


}

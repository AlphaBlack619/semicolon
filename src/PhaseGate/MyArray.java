package PhaseGate;

import java.util.ArrayList;

public class MyArray {
    private static int size1;
    private static int [] arrays;
    private static ArrayList<Integer> arrayList;
    private  static int size;
    public MyArray(int size){
        size1 = size;
        arrays = new int[size];
        arrayList = new ArrayList<>();
    }
    private static int getSize1(){
        return size1;
    }
    private static int even(int x){
        int z;
        if (x % 2 == 0){
            z = 0;
        }else z = 1;
        return z;
    }
    private static void add(int [] array){
        size1 = array.length;
        MyArray q1 = new MyArray(size1);
        for (int index = 0; index < arrays.length; index++){
            arrays[index]+=array[index];

        }}
    private  static void oddNumber(){
        for (int element: arrays) {
            if (even(element) != 0){
                arrayList.add(element-2);
                size++;
            }}
    }
    public static int [] arraysReturn(int [] a){
        add(a);
        oddNumber();
        int [] returned = new int[size];
        for (int index = 0; index < size; index++){
            returned[index] = arrayList.get(index);
        }
        return returned;
    }

}


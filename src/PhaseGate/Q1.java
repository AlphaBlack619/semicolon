package PhaseGate;

public class Q1 {
    private final int size;
    public int [] arrays;
    public Q1(int size){
        this.size = size;
        arrays = new int[size];
    }
    public int getSize(){
        return size;
    }
    public int even(int x){
        int z;
        if (x % 2 == 0){
            z = 0;
        }else z = 1;
        return z;
    }
    public void add(int [] array){
        for (int index = 0; index < arrays.length; index++){
            arrays[index]+=array[index];

        }


    }
    public int [] switcher(){
        if (getSize() % 2 == 0){
        for (int index = 0; index < arrays.length; index++){
            if (even(index) == 0){
                int temp = arrays[index];
                arrays[index] = arrays[index + 1];
                arrays[index + 1] = temp;
            }
        }}else {
            for (int index = 0; index < arrays.length - 1; index++){
                if (even(index) == 0){
                    int temp = arrays[index];
                    arrays[index] = arrays[index + 1];
                    arrays[index + 1] = temp;
                }}}
        return arrays;
    }
    public int [] evenSwitcher(){
        int z = 0;
        if (even(arrays.length) == 0){
        for (int x = 0; x < arrays.length; x++){
            while (z < arrays.length-1){
            if (even(arrays[z]) != 0 && even(arrays[z + 1]) != 0) {
                int temp = arrays[z];
                arrays[z] = arrays[z + 1];
                arrays[z + 1] = temp;
            }
            z++;}
    }}else {
            for (int x = 0; x < arrays.length; x++){
                while (z < arrays.length-1){
                    if (even(arrays[z]) != 0 && even(arrays[z + 1]) != 0) {
                        int temp = arrays[z];
                        arrays[z] = arrays[z + 1];
                        arrays[z + 1] = temp;
                    }
                    z++;}
        }}
        return arrays;
    }
    public int [] switcher3(){

        if (even(size) == 0){
            int t = (arrays.length/2) - 1;
            int p = arrays[t+1], w = arrays[t];
            arrays[t] = p;
            arrays[t+1] = w;
            int z = (arrays.length) - 1;
        for (int x = 0; x < t; x++){
            int temp = arrays[z];
            int temp2 = arrays[x];
            arrays[x] = temp;
            arrays[z] = temp2;
            z = z-1;
        }}else {
            int t = (arrays.length/2) - 1;
            int z = (arrays.length) - 1;
            for (int x = 0; x < t; x++){
                int temp = arrays[z];
                int temp2 = arrays[x];
                arrays[x] = temp;
                arrays[z] = temp2;
                z = z-1;
        }   int p = arrays[t], w = arrays[t+2];
            arrays[t] = w;
            arrays[t+2] = p;}
        return arrays;
    }


}

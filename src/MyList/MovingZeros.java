package MyList;

import java.util.Arrays;

public class MovingZeros {
    public static int [] movingZeros(int [] arrays){
        for (int x = 0; x < arrays.length; x++){
            if (arrays[x] == 0 && x+1 < arrays.length){
                int temp = 0;
                temp = arrays[x + 1];
                arrays[x+1] = arrays[x];
                arrays[x]  = temp;
            }
        }
        return arrays;
    }

    public static int number(int [] array){
        int counter = 0;
        for (int x = 0; x < array.length; x++) {
            if (array[x] == 0)
                counter++;
        }
        return counter;
    }

    public static int [] orginalMover(int [] arrays){
        for (int x = 0; x < number(arrays); x++){
            movingZeros(arrays);}
        return arrays;
    }

    public static void main(String[] args) {
        int [] arrays = {4,3,0,0,0,4,10,12};
        System.out.println(Arrays.toString(orginalMover(arrays)));
    }
}

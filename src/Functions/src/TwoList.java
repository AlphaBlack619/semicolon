import java.util.Arrays;

public class TwoList {
    public static void addingTwoList(String [] array1, String [] array2){
        int length = array1.length + array2.length;
        String [] array = new String[length];
        int index = 0;
        for (String element : array1){
            array[index] = element;
            index++;
        }
        for (String element : array2){
            array[index] = element;
            index++;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        String[] array1 = {"1","2","3"};
        String[] array2 = {"a","b","c"};

        addingTwoList(array1, array2);
    }
}

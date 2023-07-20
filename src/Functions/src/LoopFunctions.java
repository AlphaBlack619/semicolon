public class LoopFunctions {
    public static int sumTotal(int [] arrays){
        int total = 0;
        for (int index = 0; index < arrays.length; index++) total+=arrays[index];
        return total;}
    public static int sumTotal1(int [] array){
        int index1 = 0, total = 0;
        while (index1 < array.length){
            total+=array[index1];
            index1++;
        }
        return total;
    }

    public static int sumTotal2(int [] array){
        int index1 = 0, total = 0;
        do {
            total+=array[index1];
            index1++;

        }
        while (index1 < array.length);
        return total;
    }

    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6};
       System.out.println("the sum is " + sumTotal(array));
        System.out.println("the sum is " + sumTotal1(array));
        System.out.println("the sum is " + sumTotal2(array));
    }
}

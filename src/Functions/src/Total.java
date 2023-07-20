public class Total {
    public static int sumTotal(int [] arrays){
        int total = 0;
        for (int index = 0; index < arrays.length; index++) total+=arrays[index];
        return total;}

    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6};
        System.out.println("the sum is " + sumTotal(array));
    }
}

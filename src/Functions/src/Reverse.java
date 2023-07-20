public class Reverse {
    public static void reverse (String [] list){
        int index = list.length-1;
        for (; index >= 0; index--){
            System.out.print(" " + list[index]);
        }
    }

    public static void main(String[] args) {
        String [] array = {"alpha", "eddi", "chibuzor", "moyin", "12", "₦5"};
        reverse(array);
    }
}

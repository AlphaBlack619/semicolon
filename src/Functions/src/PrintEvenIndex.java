public class PrintEvenIndex {
    public static void printEvenIndex(String [] array){
        for (int index = 0; index < array.length; index++){
            if (index % 2 != 0){System.out.print(" " + array[index]);}
        }
    }

    public static void main(String[] args) {
        String [] array = {"12","young","Chibozur","Moyin","18+","Alpha"};
        printEvenIndex(array);
    }
}

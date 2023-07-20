public class PrintOddIndex {
    public static void printOddIndex(String [] array){
        for (int index = 0; index < array.length; index++){
            if (index % 2 == 0){System.out.print(" " + array[index]);}
        }
    }

    public static void main(String[] args) {
        String [] array = {"12","young","Chibozur","Moyin","18+","Alpha"};
        printOddIndex(array);
    }
}

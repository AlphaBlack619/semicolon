package PhaseGate;

import java.util.ArrayList;

public class Aug24Classwork {
    public static int [] split(int [] array){
        String [] converter = new String[array.length];
        int [] returned = new int[array.length * 2];
        StringBuilder holder = new StringBuilder();
        for (int index = 0; index < array.length; index++) converter[index] = String.valueOf(array[index]);
        for (String s : converter) holder.append(s);
        for (int x = 0; x < returned.length; x++) returned[x] = Integer.parseInt(String.valueOf(holder.charAt(x)));
        return returned;}
    public static int [] arrayAdding(int [] array){
        StringBuilder holder = new StringBuilder();
        ArrayList<Integer> returned = new ArrayList<>();
        for (int i : array) holder.append(String.valueOf(i));
        int con = Integer.parseInt(String.valueOf(holder)) + 1;
        String con2 = String.valueOf(con);
        int z = con2.length();
        for (int x = 0; x < z; x++) {returned.add(Integer.parseInt(String.valueOf(con2.charAt(x))));}
        int [] returned2 = new int[returned.size()];
        for (int x = 0; x < returned2.length; x++){returned2[x] = returned.get(x);}
        return returned2;}
}

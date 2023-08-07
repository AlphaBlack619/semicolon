package tdd;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

public class Example {
    Scanner input = new Scanner(System.in);
    Scanner input1 = new Scanner(System.in);
    ArrayList<Integer> q = new ArrayList<Integer>();
    boolean cc = true;
    String regex = "(?!^0*$)(?!^0*\\.0*$)^\\d{1,5}(\\.\\d{1,3})?$";
    public void ttt(String ab){
        if (ab.matches("^(\\d)*(\\.)?([0-9]{1})?$"));
    }
    public boolean nnnnn(String aaaa){
        if (aaaa.strip().equalsIgnoreCase("no")){
            cc = false;
        }
        return cc;
    }
    public void uyuyu(){
        while (cc){
            System.out.println("EEEEEEEEEEE");
            Integer qq = input.nextInt();
            q.add(qq);
            System.out.println("WEWERRWEE");
            String mmm = input1.nextLine();
            nnnnn(mmm);
        }
        System.out.println(q);
    }

    public static void main(String[] args) {
        Example example = new Example();
        example.uyuyu();
    }
}

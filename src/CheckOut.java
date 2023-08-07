import java.util.ArrayList;
import java.util.Scanner;

public class CheckOut {
    ArrayList<Integer> pieces = new ArrayList<>();
    ArrayList<Double> price = new ArrayList<>();
    ArrayList<Double> totalPrice = new ArrayList<>();
     ArrayList<String> item = new ArrayList<>();
    String name;
    boolean stillCalculating = true;
    boolean validate1 = true, validate2 = false, validate3 = false;
    static Scanner input = new Scanner(System.in);
    static Scanner input1 = new Scanner(System.in);

    public void setName() {
        System.out.println("what your name?");
        String name = input1.nextLine();
        if (name.matches("^\\D+$*")){
            this.name = name;}
        else {System.out.println("Invalid Name");
        setName();}
    }

    public void stillCalculatingInput(){
        System.out.println("Add more item?");
        String stillCalculatingAns = input1.nextLine();
        if (stillCalculatingAns.strip().equalsIgnoreCase("no")){stillCalculating = false;}
        else if (!stillCalculatingAns.strip().equalsIgnoreCase("yes") && !stillCalculatingAns.strip().equalsIgnoreCase("no")){
            System.out.println("Invalid command\nEnter a valid command(Yes\\No)");
            stillCalculatingInput();}
    }
    public void validate(String item){
        if (item == null || item.isBlank()){validate1 = false;
            System.out.println("Invalid Item");}}
    public void validate1(String price){
        if (price.matches("^(0|[1-9]\\d*)(\\.\\d+)?$") && Double.parseDouble(price) > 0){validate2 = true;}
        else System.out.println("Invalid Price");
    }
    public  void validate2(String pieces){
        if (pieces.matches("^\\d*") && Integer.parseInt(pieces) > 0){validate3 = true;}
        else System.out.println("Invalid Quantity");}
    public void setPricesTotal(){
        for (int index = 0; index < price.size(); index++){
            totalPrice.add(price.get(index) * pieces.get(index));
        }
        System.out.println(totalPrice);
    }
    public  void dataCollection(){
        setName();
        while (stillCalculating){
            System.out.println("what did the user buy?");
            String userItem = input1.nextLine();
            System.out.println("How many pieces?");
            String userPieces = input.nextLine();
            System.out.println("How much per unit?");
            String userPrice = input.nextLine();
            validate(userItem);
            validate2(userPieces);
            validate1(userPrice);
            if (validate1 && validate2 && validate3){
                pieces.add(Integer.parseInt(userPieces));
                price.add(Double.parseDouble(userPrice));
                item.add(userItem);
            }
            stillCalculatingInput();
        }
        System.out.println(pieces);System.out.println(price);System.out.println(item);
    }

    public static void main(String[] args) {
        CheckOut cc = new CheckOut();
        cc.dataCollection();
        cc.setPricesTotal();
    }
}

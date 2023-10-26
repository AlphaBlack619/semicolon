import java.util.ArrayList;
import java.util.List;

public class Sep26 {
    String firstName = "";
    String middleName = "";
    String lastName = "";
    int count = 1;
    int c = 0;

    public String collector(String name) {
        firstName = String.valueOf(name.charAt(0));
        for (int x = 0; x < name.length(); x++) {
            if (name.charAt(x) == ' ' && count == 1) {middleName = name.substring(x);count++;c++;}
            if (name.charAt(x) == ' ' && count >= 2) {lastName = name.substring(x);count++;c++;}}
        if (c == 2 ) {return firstName.toUpperCase() + "." + middleName.strip().toUpperCase();}
        if (c == 3) {return firstName.toUpperCase() + "." + String.valueOf(middleName.charAt(1)).toUpperCase() + "." + lastName.strip().toUpperCase();}
        return "Incorrect name format";
    }

    public static void main(String[] args) {
        Sep26 sep26 = new Sep26();
        System.out.println(sep26.collector("name alpha"));
    }
}
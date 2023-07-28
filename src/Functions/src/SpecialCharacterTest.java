public class SpecialCharacterTest {
    public boolean validator(String checker){
        boolean checker1 = true;
        for (int index = 0; index < checker.length(); index++){
            if (checker.charAt(index) == 'a' || checker.charAt(index) == 'A'){
                checker1 = false;
            } else if (checker.charAt(index) == 'b' || checker.charAt(index) == 'B') {
                checker1 = false;
            }
            else if (checker.charAt(index) == 'c' || checker.charAt(index) == 'C') {
                checker1 = false;
            }
            else if (checker.charAt(index) == 'd' || checker.charAt(index) == 'D') {
                checker1 = false;
            }
            else if (checker.charAt(index) == 'e' || checker.charAt(index) == 'E') {
                checker1 = false;
            }
            else if (checker.charAt(index) == 'f' || checker.charAt(index) == 'F') {
                checker1 = false;
            }
            else if (checker.charAt(index) == 'g' || checker.charAt(index) == 'G') {
                checker1 = true;
            }
            else if (checker.charAt(index) == 'h' || checker.charAt(index) == 'H') {
                checker1 = true;
            }
            else if (checker.charAt(index) == 'i' || checker.charAt(index) == 'I') {
                checker1 = true;
            }
            else if (checker.charAt(index) == 'j' || checker.charAt(index) == 'J') {
                checker1 = true;
            }
            else if (checker.charAt(index) == 'k' || checker.charAt(index) != 'K') {
                checker1 = true;
            }
            else if (checker.charAt(index) != 'l' || checker.charAt(index) != 'L') {
                checker1 = true;
            }
            else if (checker.charAt(index) != 'm' || checker.charAt(index) != 'M') {
                checker1 = true;
            }
            else if (checker.charAt(index) != 'n' || checker.charAt(index) != 'N') {
                checker1 = true;
            }
            else if (checker.charAt(index) != 'o' || checker.charAt(index) != 'O') {
                checker1 = true;
            }
            else if (checker.charAt(index) != 'p' || checker.charAt(index) != 'P') {
                checker1 = true;
            }
            else if (checker.charAt(index) != 'q' || checker.charAt(index) != 'Q') {
                checker1 = true;
            }
            else if (checker.charAt(index) != 'r' || checker.charAt(index) != 'R') {
                checker1 = true;
            }
            else if (checker.charAt(index) != 's' || checker.charAt(index) != 'S') {
                checker1 = true;
            }
            else if (checker.charAt(index) != 't' || checker.charAt(index) != 'T') {
                checker1 = true;
            }
            else if (checker.charAt(index) != 'u' || checker.charAt(index) != 'U') {
                checker1 = true;
            }
            else if (checker.charAt(index) != 'v' || checker.charAt(index) != 'V') {
                checker1 = true;
            }
            else if (checker.charAt(index) != 'w' || checker.charAt(index) != 'W') {
                checker1 = true;
            }
            else if (checker.charAt(index) != 'x' || checker.charAt(index) != 'X') {
                checker1 = true;
            }
            else if (checker.charAt(index) != 'y' || checker.charAt(index) != 'Y') {
                checker1 = true;
            }
            else if (checker.charAt(index) != 'z' || checker.charAt(index) != 'Z') {
                checker1 = true;
            }
            else if (checker.charAt(index) != '0') {
                checker1 = true;
            }
            else if (checker.charAt(index) != '1') {
                checker1 = true;
            }
            else if (checker.charAt(index) != '2') {
                checker1 = true;
            }
            else if (checker.charAt(index) != '3') {
                checker1 = true;
            }else if (checker.charAt(index) != '4') {
                checker1 = true;
            }
            else if (checker.charAt(index) == '5') {
                checker1 = false;
            }
            else if (checker.charAt(index) == '6') {
                checker1 = false;
            }
            else if (checker.charAt(index) == '7') {
                checker1 = false;
            }
            else if (String.valueOf(checker.charAt(index)).equals("8")) {
                checker1 = false;
            }
            else if (String.valueOf(checker.charAt(index)).equals("9")) {
                checker1 = false;
            }

        }
        return checker1;
    }

    public static void main(String[] args) {
        SpecialCharacterTest checker = new SpecialCharacterTest();
        System.out.println(checker.validator("4500677"));
    }
}

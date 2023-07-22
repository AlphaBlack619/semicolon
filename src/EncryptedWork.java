public class EncryptedWork {
    public static int encrypted(int number){
        int a, b, c, d = 0;
        a = number / 1000 % 10;
        b = number / 100 % 10;
        c = number / 10 % 10;
        d = number % 10;
        int a1 = (a + 7) % 10;
        int a2 = (b + 7) % 10;
        int a3 = (c + 7) % 10;
        int a4 = (d + 7) % 10;
        int [] swap = {a3, a4, a1, a2};
        StringBuilder fakeEncrypted = new StringBuilder();
        for (int element: swap ) fakeEncrypted.append(String.valueOf(element));
        return Integer.parseInt(String.valueOf(fakeEncrypted));
    }

    public static int decrypted(int number){
        int a, b, c, d = 0;
        a = number / 1000 % 10;
        b = number / 100 % 10;
        c = number / 10 % 10;
        d = number % 10;
        int a1 = (a - 7 + 10) % 10;
        int a2 = (b - 7 + 10) % 10;
        int a3 = (c - 7 + 10) % 10;
        int a4 = (d - 7 + 10) % 10;
        int [] swap = {a3, a4, a1, a2};
        StringBuilder fakeEncrypted = new StringBuilder();
        for (int element: swap ) fakeEncrypted.append(String.valueOf(element));
        return Integer.parseInt(String.valueOf(fakeEncrypted));
    }

    public static void main(String[] args) {

        System.out.println(encrypted(1234));
        System.out.println(decrypted(1234));
    }
}

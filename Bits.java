import java.util.Scanner;

public class Bits {

    int convertToBinary(int n) {

        if (n == 0) {
            return 0;
        }

        String res = "";

        while (n >= 1) {
            int rem = n % 2;
            res = res + rem;
            n = n / 2;
        }

        // Reverse the binary string
        res = new StringBuilder(res).reverse().toString();

        return Integer.parseInt(res);
    }

    public static void main(String[] args) {
        Bits b = new Bits();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(b.convertToBinary(n));

    }
}
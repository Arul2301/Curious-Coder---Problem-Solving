import java.util.Scanner;

import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        while (0 < n) {
            int rem = n % 10;
            System.out.print(rem);
            n/=10;

        }

    }
}


import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        while (0 < n) {
            int rem = n % 10;
            count += 1;
            n/=10;

        }
        System.out.println(count);
    }
}

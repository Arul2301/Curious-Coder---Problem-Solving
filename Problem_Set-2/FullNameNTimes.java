import java.util.Scanner;
public class FullNameNTimes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstName = in.next();
        String lastName = in.next();
        int n = in.nextInt();
        for (int i =1;i<=n;i++) {
            System.out.println(firstName + lastName);
        }
    }
}

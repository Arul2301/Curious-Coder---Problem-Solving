import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Mark = in.nextInt();
        if ( Mark >= 90) {
            System.out.println("Grade A");
        } else if (Mark >= 80) {
            System.out.println("Grade B");
        } else if ( Mark >= 60) {
            System.out.println("Grade C");
        } else if (Mark >= 35) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }

    }
}

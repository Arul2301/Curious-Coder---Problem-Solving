import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int fact =1;
        for(int i=2;i<=N;i++){
            fact*=i;

        }
        System.out.println(fact);
    }
}

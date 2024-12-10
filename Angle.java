import java.util.Scanner;
public class Angle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int angle1 = in.nextInt();
        int angle2 = in.nextInt();
        int angle3 = in.nextInt();
        int sum = angle1 + angle2 + angle3;
        if(sum != 180){
            System.out.println("Triangle cannot be formed");
        }
        else{
            System.out.println("Triangle can be formed");
        }
    }
}

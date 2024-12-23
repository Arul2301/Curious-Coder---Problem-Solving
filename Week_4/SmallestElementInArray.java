import java.util.Scanner;
public class SmallestElementInArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr;
        arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        int small = arr[0];
        for (int j : arr) {
            if (small > j) {
                small = j;
            }
        }
        System.out.println(small);
    }
}

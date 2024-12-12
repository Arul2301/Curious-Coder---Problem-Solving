import java.util.Scanner;
public class PrimeNumbersIn_N {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int v=2;v<=N;v++){
            int flag =0;
            for(int i=2;i<v;i++){
                if(v%i==0){
                    flag=1;
                }
            }
            if(flag==0) {
                System.out.print(v+" ");
            }

        }

    }

}

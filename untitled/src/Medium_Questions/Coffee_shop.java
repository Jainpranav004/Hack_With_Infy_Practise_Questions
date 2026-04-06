package Medium_Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Coffee_shop {
    public static long MaxPoints(int N, List<Integer> R, List<Integer> type){
        if(N==0)return 0;

        long[] dp=new long[N+3];

        for(int i=N-1;i>=0;i--){
            long skip=dp[i+1];
            long claim=0;
            if(type.get(i)==0){
                claim=R.get(i)+dp[i+1];
            }else{
                claim=R.get(i)+dp[i+3];
            }
            dp[i]=Math.max(skip,claim);
        }
        return dp[0];
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        if(!sc.hasNextInt())return;

        int N=sc.nextInt();

        List<Integer> R=new ArrayList<>();

        for(int i=0;i<N;i++){
            R.add(sc.nextInt());
        }
        List<Integer> type=new ArrayList<>();
        for(int i=0;i<N;i++){
            type.add(sc.nextInt());
        }
        System.out.println(MaxPoints(N,R,type));
    }
}

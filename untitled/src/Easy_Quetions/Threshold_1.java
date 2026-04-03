//Threshold 1
//        PROBLEM DESCRIPTION
//        You are given an array A of N integers representing heights, and two integers X and K.
//        You start at index 0 and want to move as far right as possible. To move from index i to index i+1,
//        apply the following rule:
//        Step 1: Compare A[i+1] with A[i] + X.
//        Step 2: If A[i+1] <= A[i] + X -> move to i+1 for free (no power-up
//        used).
//        If A[i+1] > A[i] + X -> you MUST use one power-up to move to i+1.
//        Step 3: If a power-up is needed but K = 0 -> STOP at index i.
//        Find the maximum index you can reach.
//        NOTE: You start with exactly K power-ups. Each power-up is consumed once used. You stop
//        immediately when a required power-up is unavailable.
//        INPUT FORMAT
//        • The first line contains an integer N.
//        • The next line contains an integer X.
//        • The next line contains an integer K.
//        • Each of the N subsequent lines contains an integer describing A[i] (0-indexed).
//        CONSTRAINTS
//        • 1 <= N <= 2*10^5
//        • 1 <= X <= 50
//        • 0 <= K <= 10^3
//        • 1 <= A[i] <= 10^9
//        Sample Case 1
//        INPUT
//        4
//        5
//        0
//        1
//        6
//        12
//        13
//        OUTPUT
//        3
//        EXPLANATION
//        A = [1, 6, 12, 13], X = 5, K = 0.
//        Index 0->1: A[1]=6, A[0]+X=1+5=6. 6 <= 6 -> free. Move to index 1.
//        Index 1->2: A[2]=12, A[1]+X=6+5=11. 12 > 11 -> need power-up. K=0. STOP at index 1.
//        Wait — output is 3, so let's re-read: K=0 means the third input line (K) = 0.
//        Actually tracing: index 1->2: 12 > 11, K=0, stop. Max index = 1.
//        (If K=1: 1->2 uses 1 power-up. 2->3: A[3]=13, A[2]+X=17. 13<=17 free. Reach index 3.)
//        Note: verify K value from original problem.

package Easy_Quetions;
import java.util.*;
import java.io.*;

public class Threshold_1 {
     static void main(String[] args) throws IOException {
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

             int N = Integer.parseInt(br.readLine());
             int X = Integer.parseInt(br.readLine());
             int K = Integer.parseInt(br.readLine());
             int[]A = new int[N];

             for(int i = 0; i < N; i++){
                 A[i] =  Integer.parseInt(br.readLine());
             }

             int maxI =0;
             for(int i = 0; i < N; i++){
                 if(A[i+1]<=A[i]+X){
                     maxI = i+1;
                 }
                 else if(A[i+1]>A[i]+X){
                     if(K<=0) break;
                     else{
                         K--;
                     }
                 }
             }

             System.out.println(maxI);
         }
}

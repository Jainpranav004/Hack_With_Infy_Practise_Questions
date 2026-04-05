//Self-Skipping Maximum
//PROBLEM DESCRIPTION
//You are given an array A of N positive integers. You must select a subsequence of elements to
//maximize their total sum.
//The restriction is: if you choose the element at index i (0-indexed), you are forced to skip the next A[i]
//elements. Your next selection must be from index i + A[i] + 1 or later.
//Find the maximum possible sum you can achieve.
//NOTE: Array is 0-indexed. You may choose any subset of indices satisfying the skip constraint;
//you are not required to select any element.
//INPUT FORMAT
//• The first line contains an integer N, denoting the size of the array.
//        • Each of the N subsequent lines contains an integer describing A[i].
//CONSTRAINTS
//• 1 <= N <= 200000
//        • 1 <= A[i] <= 10^5
//Sample Case 1
//INPUT
//3
//        10
//        10
//        10
//OUTPUT
//10
//EXPLANATION
//Array: [10, 10, 10].
//Picking index 0 (value 10): next allowed index = 0 + 10 + 1 = 11, out of bounds. Sum = 10.
//Picking any single element gives 10. Best = 10.
//Sample Case 2
//INPUT
//5
//        2
//        4
//        1
//        2
//        10
//OUTPUT
//12
//EXPLANATION
//DP from right: dp[4]=10, dp[3]=10, dp[2]=11, dp[1]=11.
//dp[0]: take index 0 (val=2) + dp[0+2+1] = 2 + dp[3] = 2 + 10 = 12.
//skip index 0 -> dp[1] = 11. Best = 12.
//Sample Case 3
//INPUT
//5
//        1
//        1
//        1
//        1
//        1
//OUTPUT
//3
//EXPLANATION
//Pick index 0 (val 1): next = 0+1+1 = 2.
//Pick index 2 (val 1): next = 2+1+1 = 4.
//Pick index 4 (val 1): done. Sum = 1+1+1 = 3.


package Easy_Quetions;
import java.util.*;
import java.io.*;


public class Self_skipping_Max {
     static void main(String[] args) throws IOException {
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             StringTokenizer st = new StringTokenizer(br.readLine());
             int N = Integer.parseInt(st.nextToken());


             int[] A = new int[N];
             for(int i =0 ;i<N; i++){
                 A[i] = Integer.parseInt(br.readLine());
             }

             int[] dp = new int[N];
             dp[N-1] = A[N-1];

             for(int i = N-2; i>=0 ;i--){
                 int idx = i+A[i]+1;
                 int next = (idx>N-1)?0:dp[idx];
                 dp[i] = Math.max(dp[i+1], A[i]+next);

             }
             System.out.println(dp[0]);
         }
}

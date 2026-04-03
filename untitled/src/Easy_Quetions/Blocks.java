//Question 7
//Blocks
//PROBLEM DESCRIPTION
//You are given an integer N, and two arrays:
//        • A of length N: sizes of blocks of 1-bits.
//• B of length N: sizes of blocks of 0-bits.
//You must arrange all 2N blocks (N blocks of 1s and N blocks of 0s) into a binary string such that no
//two adjacent blocks have the same bit value (strict alternation between 0-blocks and 1-blocks).
//You can arrange the N one-blocks and N zero-blocks in any order, as long as the alternation rule is
//satisfied.
//Among all valid arrangements, find the maximum possible integer value obtained by interpreting the
//resulting binary string as a decimal number. Return the answer modulo 10^9 + 7.
//NOTE: To maximize the decimal value, sort the 1-blocks in descending order and the 0-blocks in
//ascending order. This puts the most 1-bits at the front and the fewest 0-bits between them.
//        INPUT FORMAT
//N
//A[0]
//A[1]
//        ...
//A[N-1]
//B[0]
//B[1]
//        ...
//B[N-1]
//CONSTRAINTS
//• 1 <= N <= 10^5
//        • 1 <= A[i], B[i] <= 10^6
//Sample Case 1
//INPUT
//1
//        2
//        1
//OUTPUT
//6
//EXPLANATION
//A=[2], B=[1]. Only arrangement (start with 1-block): "11" + "0" = "110".
//Decimal value = 110 in binary = 6.
//Sample Case 2
//INPUT
//2
//        1
//        1
//        1
//        2
//OUTPUT
//20
//EXPLANATION
//A=[1,1], B=[1,2]. Sort A desc=[1,1], sort B asc=[1,2].
//Arrangement: 1|0|1|00 = "10100".
//Decimal = 10100 in binary = 20.
//Sample Case 3
//INPUT
//3
//        2
//        1
//        2
//        2
//        2
//        1
//OUTPUT
//868
//EXPLANATION
//A=[2,1,2], B=[2,2,1]. Sort A desc=[2,2,1], sort B asc=[1,2,2].
//Arrangement: 11|0|11|00|1|00 = "1101100100".
//Decimal = 1101100100 in binary = 868. (Verified: int("1101100100", 2) = 868)

package Easy_Quetions;
import java.io.*;
import java.util.*;

public class Blocks {
     static int MOD = 1_000_000_007;

     static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         int N = Integer.parseInt(br.readLine());
         Integer[] a = new Integer[N];
         Integer[] b = new Integer[N];

         for (int i = 0; i < N; i++) {
             a[i] = Integer.parseInt(br.readLine());
         }
         for (int i = 0; i < N; i++) {
             b[i] = Integer.parseInt(br.readLine());
         }

         Arrays.sort(b);
         Arrays.sort(a, Collections.reverseOrder());

         long totalValue =0;
         long BContri = 1;

         for(int i =N-1; i>=0; i--){
             long powB = modPow(2, b[i]);
             BContri = (BContri * powB) % MOD;

             // Process A[i] (1 block)
             long powA = modPow(2, a[i]);
             long AContri = (powA - 1 + MOD) % MOD;

             totalValue = (totalValue + BContri * AContri % MOD) % MOD;
             BContri = (BContri * powA) % MOD;
         }
         System.out.println(totalValue);
     }


     public static long modPow(long base, long exp){
         long result = 1;
         while(exp>0){
             if((exp&1) == 1) result = (result*base)%MOD;
             base = (base * base)%MOD;
             exp>>=1;
         }
         return result;
     }
}

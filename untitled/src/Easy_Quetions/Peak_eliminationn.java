//Peak Elimination
//        PROBLEM DESCRIPTION
//        You are given a sequence of N integers arranged in a line.
//        An element at position i (2 <= i <= N-1, 1-indexed) is called a peak if it is strictly greater than both of
//        its immediate neighbors: A[i] > A[i-1] and A[i] > A[i+1].
//        A peak element can be removed from the sequence. When an element is removed, the sequence
//        shrinks and the two neighbors of the removed element become adjacent. You may perform removals
//        in any order.
//        Find the maximum number of elements that can be removed.
//        NOTE: Only interior elements (not first or last) can be removed. First and last elements can never
//        be removed.
//        INPUT FORMAT
//        • The first line contains an integer N, denoting the size of the sequence.
//        • Each of the N subsequent lines contains an integer describing A[i].
//        CONSTRAINTS
//        • 1 <= N <= 10^5
//        • 1 <= A[i] <= 10^5
//        Sample Case 1
//        INPUT
//        5
//        5
//        1
//        4
//        1
//        5
//        OUTPUT
//        1
//        EXPLANATION
//        Sequence: [5, 1, 4, 1, 5].
//        Check peaks: A[3]=4 > A[2]=1 and A[3] > A[4]=1. Peak! Remove 4.
//        Sequence becomes: [5, 1, 1, 5].
//        Check peaks: no element is strictly greater than both neighbors.
//        Final Answer: 1.
//        Sample Case 2
//        INPUT
//        6
//        1
//        3
//        4
//        2
//        4
//        1
//        OUTPUT
//        3
//        EXPLANATION
//        Sequence: [1, 3, 4, 2, 4, 1].
//        Step 1: A[3]=4 > 3 and > 2. Peak. Remove 4. -> [1, 3, 2, 4, 1].
//        Step 2: A[4]=4 > 2 and > 1. Peak. Remove 4. -> [1, 3, 2, 1].
//        Step 3: A[2]=3 > 1 and > 2. Peak. Remove 3. -> [1, 2, 1].
//        No more peaks. Final Answer: 3.
//        Sample Case 3
//        INPUT
//        7
//        10
//        1
//        9
//        2
//        8
//        3
//        7
//        OUTPUT
//        2
//        EXPLANATION
//        Sequence: [10, 1, 9, 2, 8, 3, 7].
//        Step 1: A[3]=9 > 1 and > 2. Peak. Remove 9. -> [10, 1, 2, 8, 3, 7].
//        Step 2: A[4]=8 > 2 and > 3. Peak. Remove 8. -> [10, 1, 2, 3, 7].
//        Step 3: No interior element is strictly greater than both neighbors.
//        Final Answer: 2.

package Easy_Quetions;
import java.util.*;
import java.io.*;

public class Peak_eliminationn {
     static void main(String[] args) throws IOException {
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             StringTokenizer st = new StringTokenizer(br.readLine());


             int N = Integer.parseInt(st.nextToken());
             ArrayList<Integer> A = new ArrayList<>();

             for(int i=0;i<N;i++){
                 int M = Integer.parseInt(br.readLine());
                 A.add(M);
             }
             int answer = 0;

             int i = 1;
             while(i < A.size()-1){
                 if(A.get(i) > A.get(i-1) && A.get(i) > A.get(i+1)) {
                     A.remove(A.get(i));
                     i = (i - 1 > 0) ? i - 1 : i;
                     answer++;
                 }else i++;
             }
             System.out.println(answer);
     }
}

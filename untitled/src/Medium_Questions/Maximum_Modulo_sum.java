//Question 1
//Maximum Modulo Sum
//PROBLEM DESCRIPTION
//You are given an array A of N positive integers and an integer K.
//You must select a subsequence of A (preserving original order) to maximize the sum of its elements.
//The condition is: no two consecutive elements in your chosen subsequence can have the same
//remainder when divided by K.
//More precisely, if your chosen subsequence is A[i1], A[i2], ..., A[im] (with i1 < i2 < ... < im), then for
//every consecutive pair A[ij] and A[ij+1] in this subsequence: A[ij] % K != A[ij+1] % K.
//Find the maximum possible sum.
//        NOTE: The "adjacent" restriction applies to consecutive elements within the chosen subsequence
//only, not to elements adjacent in the original array.
//INPUT FORMAT
//• The first line contains an integer N, denoting the size of the array.
//        • The next line contains an integer K.
//• Each of the N subsequent lines contains an integer describing A[i].
//CONSTRAINTS
//• 1 <= N <= 2*10^5
//        • 1 <= K <= 10^5
//        • 1 <= A[i] <= 10^5
//Sample Case 1
//INPUT
//3
//        10
//        10
//        20
//        30
//OUTPUT
//30
//EXPLANATION
//        K=10. Remainders: 10%10=0, 20%10=0, 30%10=0. All have remainder 0.
//No two consecutive elements in the subsequence can share remainder 0.
//So we can only pick one element. Best single element = 30.
//Sample Case 2
//INPUT
//5
//        3
//        5
//        2
//        7
//        3
//        4
//OUTPUT
//19
//EXPLANATION
//        K=3. Remainders: 5->2, 2->2, 7->1, 3->0, 4->1.
//Select subsequence [5, 7, 3, 4] with remainders [2, 1, 0, 1].
//Check: 2!=1, 1!=0, 0!=1 -> no two consecutive are the same. Valid.
//        Sum = 5+7+3+4 = 19.
//Sample Case 3
//INPUT
//6
//        2
//        1
//        3
//        5
//        7
//        9
//        11
//OUTPUT
//11
//EXPLANATION
//K=2. All numbers are odd -> all remainders = 1.
//Cannot pick two consecutively. Best single element = 11.

package Medium_Questions;

public class Maximum_Modulo_sum {
    static void main(String[] args) {
        int n = 3;
        int k = 10;
        int[] arr = {10,20,30};

        int[] dp = new int[n];

        dp[0] = arr[0];
        for(int i =1 ; i<n ;i++){
            if(arr[i-1]%k != arr[i]%k){
                dp[i] = dp[i-1]+arr[i];
            }else{
                dp[i] = Math.max(dp[i-1],arr[i]);
            }
        }
        System.out.println(dp[n-1]);
    }
}

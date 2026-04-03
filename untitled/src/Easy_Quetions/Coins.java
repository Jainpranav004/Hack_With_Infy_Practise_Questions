// Question 1
// ZerosOnes
// PROBLEM DESCRIPTION
// You are given an array A of length N, initially filled with zeros, and an array B of M integers.
// For each i from 1 to M, you will flip A[B[i]]: if it was 0 make it 1, and if it was 1 make it 0.
// After each update, define the cost of array A as the maximum length of a contiguous subarray that
// contains at most one transition between 0s and 1s (i.e., the subarray is either all one value, or starts
// with a block of one value and ends with a block of the other value — exactly one change of value is
// allowed).
// Find the product of the M costs, modulo 10^9 + 7.
// NOTE: Arrays are 1-indexed. B[i] values are valid indices into A (1 to N).
// INPUT FORMAT
// • The first line contains an integer N, denoting the length of array A.
// • The next line contains an integer M, denoting the number of operations.
// • Each of the M subsequent lines contains an integer describing B[i] (1-indexed).
// CONSTRAINTS
// • 1 <= N <= 10^5
// • 1 <= M <= 10^5
// • 1 <= B[i] <= N
// Sample Case 1
// INPUT
// 3
// 1
// 1
// OUTPUT
// 3
// EXPLANATION
// N=3, M=1, B=[1]. Initial A = [0,0,0].
// Step 1: Flip A[1] -> A = [1,0,0].
// Max subarray with at most one transition: the entire array [1,0,0] qualifies (one transition 1->0).
// Cost = 3.
// Product = 3.
// Sample Case 2
// INPUT
// 3
// 2
// 3
// 1
// OUTPUT
// 6
// EXPLANATION
// Initial A = [0,0,0].
// Step 1: Flip A[3] -> A = [0,0,1]. Max valid subarray = entire array (one transition). Cost = 3.
// Step 2: Flip A[1] -> A = [1,0,1]. Max valid subarray = any 2 adjacent elements. Cost = 2.
// Product = 3 x 2 = 6.
// Sample Case 3
// INPUT
// 3
// 2
// 1
// 2
// OUTPUT
// 9
// EXPLANATION
// Initial A = [0,0,0].
// Step 1: Flip A[1] -> A = [1,0,0]. Max valid subarray = entire array. Cost = 3.
// Step 2: Flip A[2] -> A = [1,1,0]. Max valid subarray = entire array (one transition 1->0). Cost = 3.
// Product = 3 x 3 = 9.


package Easy_Quetions;

public class Coins {

}

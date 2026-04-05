//String Stability Boost
//PROBLEM DESCRIPTION
//You are given a string S consisting of lowercase English letters.
//The stability score of the string is defined as the number of distinct adjacent pairs in the string. An
//adjacent pair is formed by the characters at positions (i, i+1) for 1 <= i < |S| (1-indexed). Two pairs are
//considered the same if both characters match.
//You are allowed to perform exactly one adjacent swap: choose an index i and swap S[i] with S[i+1].
//Find the maximum possible stability score after performing exactly one adjacent swap.
//NOTE: You must perform exactly one swap — you cannot skip it. If all swaps give the same score,
//        return that score.
//INPUT FORMAT
//• The first line contains a string S, denoting the given lowercase string.
//        CONSTRAINTS
//• 1 <= len(S) <= 10^3
//Sample Case 1
//INPUT
//        abc
//OUTPUT
//2
//EXPLANATION
//Original pairs: (a,b), (b,c). Distinct = {ab, bc}. Count = 2.
//Swap positions 1&2 -> "bac": pairs ba, ac -> distinct = {ba, ac} = 2.
//Swap positions 2&3 -> "acb": pairs ac, cb -> distinct = {ac, cb} = 2.
//Maximum stability after exactly one swap = 2.
//Sample Case 2
//INPUT
//        abca
//OUTPUT
//3
//EXPLANATION
//Original pairs: (a,b), (b,c), (c,a). Distinct = {ab, bc, ca}. Count = 3.
//Swap 1&2 -> "baca": pairs ba, ac, ca -> distinct = {ba, ac, ca} = 3.
//Swap 2&3 -> "acba": pairs ac, cb, ba -> distinct = {ac, cb, ba} = 3.
//Swap 3&4 -> "abac": pairs ab, ba, ac -> distinct = {ab, ba, ac} = 3.
//Maximum stability after exactly one swap = 3.
//Sample Case 3
//INPUT
//        aaaa
//OUTPUT
//1
//EXPLANATION
//Original pairs: (a,a), (a,a), (a,a). Distinct = {aa}. Count = 1.
//Any adjacent swap keeps the string unchanged (all characters are identical).
//Distinct pairs remain = {aa} = 1.
//Maximum stability after exactly one swap = 1.



package Easy_Quetions;

import java.util.HashSet;

public class String_stability {

    static void main(String[] args) {
        String s = "abc";
        if(s.length() < 2) System.out.println(0);
        int max = 0;


        for(int i =0 ; i<s.length()-1;i++){
            char[] arr = s.toCharArray();
            char temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;

            int score = getStability(arr);
            max = Math.max(max,score);
        }
        System.out.println(max);
    }

    static int getStability(char[] arr){
        HashSet<String> hs = new HashSet<String>();
        for(int i =0 ; i<arr.length-1;i++){
            hs.add(""+ arr[i]+arr[i+1]);
        }
        return hs.size();
    }
}

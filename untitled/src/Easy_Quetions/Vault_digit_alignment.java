//Question 11
//Vault Digit Alignment
//PROBLEM DESCRIPTION
//In a high-security research facility, a digital vault is protected by N rotating digits arranged in a row.
//Each digit initially shows a value A[i] where 0 <= A[i] <= 9.
//You are allowed to rotate any digit forward only (cyclically): 0 -> 1 -> 2 -> ... -> 8 -> 9 -> 0 -> 1 -> ...
//Your goal is to make the sequence of digits non-decreasing from left to right using the minimum total
//number of rotations. Find the minimum total rotations required.
//NOTE: Since rotation is cyclic forward only, to bring digit d up to a target t: if t >= d, cost = t - d. If t
//< d (wrapping required), cost = (10 - d + t). Propagate the "effective minimum target" left to right.
//        INPUT FORMAT
//• Line 1: integer N (number of digits).
//        • Next N lines: integer Arr[i] (0-indexed, digit value 0-9).
//CONSTRAINTS
//• 1 <= N <= 10^5
//        • 0 <= Arr[i] <= 9
//Sample Case 1
//INPUT
//5
//        1
//        3
//        2
//        1
//        1
//OUTPUT
//5
//EXPLANATION
//Sequence: [1, 3, 2, 1, 1]. Make non-decreasing with forward rotations.
//A[0]=1: target=1 (no change). Effective target = 1.
//A[1]=3: 3>=1, no rotation. Effective target = 3.
//A[2]=2: 2<3, rotate 2->3. Cost=(3-2)=1. Effective target=3.
//A[3]=1: 1<3, rotate 1->3. Cost=(3-1)=2. Effective target=3.
//A[4]=1: 1<3, rotate 1->3. Cost=(3-1)=2. Effective target=3.
//Total rotations = 0+0+1+2+2 = 5.
//Sample Case 2
//INPUT
//4
//        9
//        0
//        1
//        2
//OUTPUT
//24
//EXPLANATION
//Sequence: [9, 0, 1, 2]. Effective target starts at 9.
//A[1]=0: 0<9, rotate forward cyclically: 0->9. Cost=(10-0+9)%10=9... wait cyclic: cost=10-9+0=1? No.
//Forward rotation: 0->1->...->9 requires 9 steps. Cost=9. Effective target=9.
//A[2]=1: 1<9, rotate 1->9. Cost=(10-1+9)%10=8. Effective target=9.
//A[3]=2: 2<9, rotate 2->9. Cost=(10-2+9)%10=7. Effective target=9.
//Total = 9+8+7 = 24.

package Easy_Quetions;

public class Vault_digit_alignment {
    static void main(String[] args) {
        int N = 5;
        int[] A = {9,0,1,2};

        int target = A[0];
        int count =0;

        for(int i = 0; i<A.length; i++){
            int cost = 0;
            if(A[i] < target){
                cost = (target-A[i]+10)%10;
               count+=cost;
            }

            target = Math.max(target, A[i]);
        }
        System.out.println(count);
    }
}

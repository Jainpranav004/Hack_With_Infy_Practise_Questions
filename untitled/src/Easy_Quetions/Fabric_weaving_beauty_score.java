//Fabric Weaving Beauty Score
//PROBLEM DESCRIPTION
//A textile artist is weaving a decorative fabric by combining threads from two spools A and B.
//• Spool A contains N threads with colors A[1], A[2], ..., A[N].
//        • Spool B contains M threads with colors B[1], B[2], ..., B[M].
//The artist weaves exactly N + M threads into the final fabric, maintaining the original relative order
//from each spool. At each step, the artist selects the next available thread from the front of either
//Spool A or Spool B.
//The beauty of the fabric is determined by color transitions: if two consecutive threads in the final
//woven fabric have the same color, a harmony bonus H is earned. If colors are different, no bonus is
//awarded.
//Find the maximum possible total beauty score achievable.
//NOTE: This is a DP problem: dp[i][j] = max beauty score when i threads from A and j threads from
//B have been placed. Transition: pick next from A or B and check if it matches the last placed
//thread.
//        INPUT FORMAT
//• Line 1: integer N (threads in Spool A).
//        • Line 2: integer M (threads in Spool B).
//        • Line 3: integer H (harmony bonus for same-color consecutive pair).
//        • Next N lines: integer A[i] (1-indexed).
//        • Next M lines: integer B[j] (1-indexed).
//CONSTRAINTS
//• 1 <= N <= 1000
//        • 1 <= M <= 1000
//        • 1 <= H <= 10^5
//        • 1 <= A[i] <= 10^5
//        • 1 <= B[j] <= 10^5
//Sample Case 1
//INPUT
//2
//        2
//        5
//        1
//        1
//        1
//        1
//OUTPUT
//15
//EXPLANATION
//A=[1,1], B=[1,1]. H=5. All threads have color 1.
//Weave in any order: [1,1,1,1]. Adjacent pairs: (1,1),(1,1),(1,1) -> 3 matches.
//        Total beauty = 3 x 5 = 15.
//Sample Case 2
//INPUT
//3
//        3
//        10
//        1
//        2
//        1
//        1
//        3
//        1
//OUTPUT
//20
//EXPLANATION
//A=[1,2,1], B=[1,3,1]. H=10.
//Optimal interleaving: [1,1,2,3,1,1].
//Adjacent matches: (1,1) at pos 1-2, (1,1) at pos 5-6. Count=2.
//Total beauty = 2 x 10 = 20.
//Sample Case 3
//INPUT
//3
//        3
//        100
//        1
//        2
//        3
//        4
//        5
//        6
//OUTPUT
//0
//EXPLANATION
//A=[1,2,3], B=[4,5,6]. H=100. All threads have unique colors.
//No two identical colors can ever be placed consecutively.
//        Total beauty = 0.


package Easy_Quetions;

public class Fabric_weaving_beauty_score {

}

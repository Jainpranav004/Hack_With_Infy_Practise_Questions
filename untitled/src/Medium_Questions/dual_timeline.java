//Question 2
//Dual Timeline
//PROBLEM DESCRIPTION
//A city maintenance department has N repair tasks that must be completed.
//Each task i has:
//        • D[i] -> the duration (time required to complete the task).
//        • P[i] -> the penalty weight associated with the task.
//The department has two repair teams, Team A and Team B, working in parallel. The rules are:
//        • Tasks must be considered in the given order (task 1 before task 2, etc.).
//        • Each task must be assigned to exactly one team (A or B).
//        • Within each team, tasks are completed sequentially in the order they were assigned.
//        • If a task assigned to a team finishes at time T, its penalty cost is T * P[i].
//The total penalty is the sum of all individual task penalties across both teams. Find the minimum total
//penalty achievable by optimally assigning tasks.
//INPUT FORMAT
//• The first line contains an integer N, denoting the number of tasks.
//• Each of the next N lines contains an integer describing D[i] (task durations, 1-indexed).
//        • Each of the next N lines contains an integer describing P[i] (penalty weights, 1-indexed).
//CONSTRAINTS
//• 1 <= N <= 10^2
//        • 1 <= D[i] <= 10^3
//        • 1 <= P[i] <= 10^3
//Sample Case 1
//INPUT
//2
//        3
//        3
//        5
//        4
//OUTPUT
//27
//EXPLANATION
//        N=2. D=[3,3], P=[5,4].
//Assign Task 1 -> Team A: Team A finishes at time 3. Penalty = 3 x 5 = 15.
//Assign Task 2 -> Team B: Team B finishes at time 3. Penalty = 3 x 4 = 12.
//Total = 15 + 12 = 27. Minimum = 27.
//Sample Case 2
//INPUT
//3
//        4
//        3
//        2
//        3
//        1
//OUTPUT
//14
//EXPLANATION
//        N=3. D=[4,3,2], P=[3,1].
//Assign Task 1 -> Team A: finishes at 4. Penalty = 4 x 2 = 8.
//Assign Task 2 -> Team B: finishes at 1. Penalty = 1 x 3 = 3.
//Assign Task 3 -> Team B: finishes at 1+3=... wait, re-check D and P order.
//        D=[4,3,2], P=[3,1] means only 2 penalty weights for 3 tasks. Per image:
//D=[4,3,2], but P values are D[i] line count. Refer to image for exact P values.
//        Result = 14 (verified from original test case image).

package Medium_Questions;

public class dual_timeline {

}

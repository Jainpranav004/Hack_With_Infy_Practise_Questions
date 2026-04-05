//
//Question 9
//Tool Rental Maximization
//PROBLEM DESCRIPTION
//A hardware rental shop has N customers requesting tools and M available tools. Each customer i
//needs a tool with at least P[i] power rating (minimum requirement). Each tool j has a base power
//rating R[j].
//The Amplification Option: You have K "power amplifiers" available. You can choose up to K tools to
//attach an amplifier to. If you amplify a tool with rating R[j], its effective power becomes 2 x R[j]. A tool
//can receive at most one amplifier.
//        • A customer i can be served by tool j if the tool's effective power (base or amplified) is >= P[i].
//        • Each customer rents at most one tool.
//• Each tool is rented to at most one customer.
//Find the maximum number of customers that can be served.
//NOTE: Greedy strategy: Sort customers by requirement ascending, sort tools by power
//descending. Greedily decide which tools to amplify to maximize the count of satisfied customers.
//        INPUT FORMAT
//• Line 1: integer N (number of customers).
//        • Line 2: integer M (number of tools).
//        • Line 3: integer K (number of amplifiers available).
//        • Next N lines: integer P[i] (minimum power requirement for customer i).
//        • Next M lines: integer R[j] (base power rating of tool j).
//CONSTRAINTS
//• 1 <= N <= 10^5
//        • 1 <= M <= 10^5
//        • 1 <= K <= M
//• 1 <= P[i] <= 10^5
//        • 1 <= R[j] <= 10^5
//Sample Case 1
//INPUT
//2
//        2
//        1
//        10
//        20
//        5
//        10
//OUTPUT
//1
//EXPLANATION
//Customers need: [10, 20]. Tools: [5, 10]. K=1 amplifier.
//Amplify tool R=10 -> effective 20. Serve customer P=20. Tool R=5 cannot serve P=10.
//Maximum customers served = 1.
//Sample Case 2
//INPUT
//2
//        2
//        2
//        100
//        200
//        50
//        60
//OUTPUT
//1
//EXPLANATION
//Customers need: [100, 200]. Tools: [50, 60]. K=2 amplifiers.
//Amplify both: tool 50->100, tool 60->120.
//Tool 100 >= P=100: serves first customer.
//        Tool 120 < P=200: cannot serve second customer.
//Maximum customers served = 1.
//Sample Case 3
//INPUT
//5
//        6
//        1
//        33
//        39
//        2
//        36
//        13
//        46
//        42
//        45
//        35
//        27
//        15
//OUTPUT
//5
//EXPLANATION
//Customers (sorted asc): [2, 13, 33, 36, 39].
//Tools (sorted desc): [46, 45, 42, 35, 27, 15].
//Match without amplification: 46>=39, 45>=36, 42>=33, 35>=13, 27>=2. All 5 matched!
//No amplifier needed. Maximum customers served = 5.



package Easy_Quetions;

import java.util.Arrays;
import java.util.Collections;

public class total_rental_Maximisation {
    static void main(String[] args) {
        int N = 5;
        int M = 6;
        int K = 1;
        Integer[] P = {33,39,2,36,13};
        Integer[] R = {46,42,45,35,27,16};

        Arrays.sort(P, Collections.reverseOrder());
        Arrays.sort(R, Collections.reverseOrder());
        int cnt = 0;

        int i =0; int j =0;

        while(i<P.length && j<R.length){
            if(R[j] >= P[i]) cnt++;
            else{
                if(K>0){
                    if(2*R[j] >= P[i]){
                        cnt++;
                        K--;
                    }
                }
            }
            i++;j++;
        }
        System.out.println(cnt);
    }
}

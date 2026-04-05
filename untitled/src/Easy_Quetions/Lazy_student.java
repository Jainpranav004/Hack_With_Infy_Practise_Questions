package Easy_Quetions;

import java.util.Arrays;
import java.util.Collections;

public class Lazy_student {
    static void main(String[] args) {
        int n = 1;
        int m = 1;
        int c = 2;
        Integer[] A = {1};

        Arrays.sort(A, Collections.reverseOrder());

        int sum =0;
        for(int i = 0; i<A.length; i++){
            sum+=A[i];
        }
        if(sum/(double)c >= m) System.out.println(0);

        int currSum = 0;
        for(int i =0 ; i<A.length; i++){
            currSum+=A[i];
            double exp = currSum + (sum - currSum)/(double) c ;
            if(exp >= m){
                System.out.println(i+1);
                return ;
            }
        }
        System.out.println(n);
    }
}

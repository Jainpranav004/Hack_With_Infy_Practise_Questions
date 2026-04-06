package Medium_Questions;

public class Aquarium_fish_display {
    public static void main(String[] args){
        int[] A = {1,2};
        int[] B = {2,3};
        int n = A.length;
        int m = B.length;
        int[][] score = {
                {0,10,1},
                {1,0,10},
                {10,1,10}
        };
        int[][][] dp = new int[n+1][m+1][2];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                Arrays.fill(dp[i][j], Integer.MIN_VALUE);
            }
        }

        dp[1][0][0] = 0;     // Inititaly fish picked from tank A
        dp[0][1][1] = 0;     // Inititaly fish picked from tank B

        for(int i=0; i<=n; i++){
            for(int j=0; j<=m; j++){
                // Pick from A
                if(i > 0){
                    // last picked from A
                    if(i > 1 && dp[i-1][j][0] != Integer.MIN_VALUE){
                        dp[i][j][0] = Math.max(dp[i][j][0],
                                dp[i-1][j][0] + score[A[i-2]-1][A[i-1]-1]);
                    }

                    // last picked from B
                    if(j > 0 && dp[i-1][j][1] != Integer.MIN_VALUE){
                        dp[i][j][0] = Math.max(dp[i][j][0],
                                dp[i-1][j][1] + score[B[j-1]-1][A[i-1]-1]);
                    }
                }

                // Pick from B
                if(j > 0){
                    // last picked from A
                    if(i > 0 && dp[i][j-1][0] != Integer.MIN_VALUE){
                        dp[i][j][1] = Math.max(dp[i][j][1],
                                dp[i][j-1][0] + score[A[i-1]-1][B[j-1]-1]);
                    }
                    // last picked form B
                    if(j > 1 && dp[i][j-1][1] != Integer.MIN_VALUE){
                        dp[i][j][1] = Math.max(dp[i][j][1],
                                dp[i][j-1][1] + score[B[j-2]-1][B[j-1]-1]);
                    }
                }
            }
        }

        System.out.println(Math.max(dp[n][m][0], dp[n][m][1]));}
}

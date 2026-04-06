package Easy_Quetions;

public class prefix_flow_stability {
    public static void main(String[] args) {

        int[] arr = {5,0,13,18,0,2};
        int n = arr.length;
        int[] pLen = new int[n];
        pLen[0] = 1;
        int maxLen = 1;
        for(int i=0; i<n-1; i++){
            if(i-1 >= 0 && arr[i-1] < arr[i]){
                pLen[i] = pLen[i-1]+1;
            }

            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }

            if(i-1 >= 0 && arr[i-1] < arr[i]){
                pLen[i] = Math.max(pLen[i], pLen[i-1]+1);
            }else if(i != 0){
                maxLen = Math.max(maxLen, pLen[i]);
                break;
            }
        }
        System.out.println(maxLen);
    }

}

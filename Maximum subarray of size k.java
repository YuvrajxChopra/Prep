public class Main
{
    public static int solve(int [] arr, int k){
        if(arr.length<k){
            return -1;
        }
        int i = 0, j = k-1;
        int ans = 0;
        for(int kk = 0; kk<k; kk++){
            ans += arr[kk];
        }
        int max = ans;
        while(j<arr.length-1){
            max -= arr[i];
            i++;
            j++;
            max += arr[j];
            if(ans<max){
                ans = max;
            }
        }
        return ans;
    }
	public static void main(String[] args) {
	    int [] arr = {1, 4, 2, 10, 2, 3, 1, 0, 20};
	    int k = 4;
	    int ans = solve(arr, k);
	    System.out.println("Answer: " + ans);
	}
}

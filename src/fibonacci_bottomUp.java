
public class fibonacci_bottomUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
		int dp[] = new int[n+1];
		
		dp[0] =0;
		dp[1] = 1;
		
		for(int i=2; i<=n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}	
		
		System.out.println(dp[n]);
	}

}

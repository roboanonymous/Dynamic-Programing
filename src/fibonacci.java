
public class fibonacci {
	
	static int fibb(int n , int dp[]){
		if(n <=1) {
			return n;
		}
		
		if(dp[n] != -1) {
			return dp[n];
		}
		
		
		dp[n]= fibb(n-1, dp) + fibb(n-2, dp) ;
		return dp[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 6;
		int dp[] = new int[n+1];
		
		
		for(int i=0; i<=n; i++) {
			dp[i] = -1;
		}
		
		int ans = fibb(n, dp);
		
		System.out.println(ans);

	}

}

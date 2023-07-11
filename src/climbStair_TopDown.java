
public class climbStair_TopDown {
	
	static int climbStair(int n , int i, int[] dp) {
		
		if (i == n ) {
			return 1;
		}
		
		if(i>n) {
			return 0;
		}
		
		
		
		return climbStair(n, i + 1, dp) + climbStair(n, i+2, dp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 6;
		int dp[] = new int[n+1];
		
		for(int i=0; i<=n; i++) {
			dp[i] = -1;
		}
		
		
		int ans = climbStair(n , 0, dp);
		
		System.out.println(ans);

	}

}

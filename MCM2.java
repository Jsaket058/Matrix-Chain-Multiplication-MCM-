//Memoization Solution

import java.util.Arrays;

class MCM2{
	int minMcm(int arr[],int i,int j,int dp[][]){
		if(i==j)return 0;
		if(dp[i][j]!=-1)return dp[i][j];
		int q=9999;
		for(int k=i;k<j;k++){
			int steps= minMcm(arr,i,k,dp)+ minMcm(arr,k+1,j,dp) + arr[i-1]*arr[k]*arr[j];
			if(steps<q)q=steps;
		}
		return dp[i][j]=q;
	}
}
class Run{
	public static void main(String[] args){
		int p[]={5,3,6,2,4,6};
        MCM2 m=new MCM2();
		int dp[][]=new int[p.length][p.length];
		Arrays.fill(dp[],-1);
		System.out.println(m.minMcm(p,1,p.length-1,dp));
	}
}
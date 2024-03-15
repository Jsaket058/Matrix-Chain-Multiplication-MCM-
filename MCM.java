//Optimal Solution

class MCM{
	int minMcm(int arr[],int i,int j){
		if(i==j)return 0;
		int q=99999;
		for(int k=i;k<j;k++){
			int steps= minMcm(arr,i,k)+ minMcm(arr,k+1,j) + arr[i-1]*arr[k]*arr[j];
			if(steps<q)q=steps;
		}
        return q;		
	}
}

class Run{
	public static void main(String[] args){
		int p[]={5,3,6,2,4,6};
        MCM m=new MCM();
		System.out.println(m.minMcm(p,1,p.length-1));
	}
}
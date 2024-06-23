package com.pack;

public class Arraysumof2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,68,5,3,10,20,30,40};
		int ans=Integer.MIN_VALUE;
		for(int i=0;i<arr.length-1;i++) {
			int sum=0;
			int j=i+1;
			sum+=arr[i]+arr[j];
			
			if(sum>ans) {
				ans=sum;
			}
		}
		System.out.println(ans);

	}

}

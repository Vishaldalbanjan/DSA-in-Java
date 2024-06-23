package com.pack;

public class Richestcustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] accounts= {
				{1,2,3},
				{2,3,4},
		};
		
		System.out.println(maxminwelth(accounts));

	}
	
	public static int maxminwelth(int[][] accounts) {
		int ans=Integer.MIN_VALUE;
		for(int person=0;person<accounts.length;person++) {
			int sum=0;
			for(int account=0;account<accounts[person].length;account++) {
				
				sum += accounts[person][account];
				
			}
			
			if(sum>ans) {
				ans=sum;
			}
		}
		
		return ans;
	}

}

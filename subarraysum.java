package com.pack;

public class subarraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6};
		int x=15,sum=0,i,j;
		int n=arr.length;
		for(i=0;i<n;i++) {
			if(sum!=x) { n
				sum=sum+arr[i];
			}
			
		}
		if(sum==x) {
			System.out.println(i-1);
		}
	}

}

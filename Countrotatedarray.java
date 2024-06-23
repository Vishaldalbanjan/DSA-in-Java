package com.pack;

public class Countrotatedarray {

	public static void main(String[] args) {

		int[] arr= {4,5,6,7,0,1,2};
		int count=0;
		int start=0;
		int end=arr.length-1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[start]>arr[end]) {
				start++;
				count++;
			}
		}
		System.out.println(count);
		
	}

}

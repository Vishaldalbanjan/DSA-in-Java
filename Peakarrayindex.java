package com.pack;

public class Peakarrayindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,2,0};
		
		System.out.println(binarysearch(arr));
	}
	
	static int binarysearch(int[] arr) {
		
		int start=0;
		int end=arr.length-1;
		while(start < end) {
			int mid=start + (end - start) / 2;
			
			if(arr[mid]>arr[mid+1]) {
				end=mid;
			}else {
				start=mid+1;
			}
	}
		return start;
	}

}

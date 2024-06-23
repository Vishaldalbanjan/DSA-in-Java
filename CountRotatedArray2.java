package com.pack;

public class CountRotatedArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={4,5,6,7,1,2};
		
		System.out.println(search(arr));
		
	}
	static int search(int[] arr) {
		int peak=binarysearch(arr);
		int count=peak+1;
		return count;
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

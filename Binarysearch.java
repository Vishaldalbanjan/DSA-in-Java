package com.pack;

public class Binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,4,6,8,9,12};
		int target=78;
		int ans=binarysearch(arr,target);
		System.out.println(ans);

	}
	
	static int binarysearch(int[] arr,int target) {
		
		int start=0;
		int end=arr.length-1;
		int max=arr.length-1;
		int mid=0;
		
		while(start <= end) {
			mid=start + (end - start) / 2;
			
			if(target < arr[mid]) {
				end=mid-1;
			}
			else if(target > arr[mid]) {
				start=mid+1;
			}
			if(target==arr[mid]) {
				return arr[mid];
			}
			else if(target>arr[max]) {
				return -1;
			}
				
		}
		
		
		return arr[end];
	}

}

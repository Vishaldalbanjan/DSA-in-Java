package com.pack;

public class firstandlastposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,3,4,5,6,7};
		int target=3;
		System.out.println(binarysearch(nums,target));

	}
	
	public static int[] binarysearch(int[] nums,int target) {
		
		int[] ans= {-1,-1}; 
		
		int start=search(nums,target,true);
		int end=search(nums,target,false);
		
		ans[0]=start;
		ans[1]=end;
		
		return ans;
		
	}
	
	static int search(int[] nums,int target,boolean findstartindex) {
		int ans=-1;
		int start=0;
		int end=nums.length-1;
		int max=nums.length-1;
		int mid=0;
		
		while(start <= end) {
			mid=start + (end - start) / 2;
			
			if(target < nums[mid]) {
				end=mid-1;
			}
			else if(target > nums[mid]) {
				start=mid+1;
			}
			else {
				ans=mid;
				if(findstartindex == true) {
					end=mid-1;
				}else {
					start=mid+1;
				}
			}
				
		}
		
		return ans;
	
	}

}

package com.pack;

public class Numberofevendigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num= {2,22,3,44,3333};
		
		System.out.println(findnum(num));
	}

	static int findnum(int[] nums) {
		// TODO Auto-generated method stub
		int count=0;
		for(int num : nums) {
			if(even(num)) {
				count++;
			}
		}
		return count;
	}

	static boolean even(int num) {
		// TODO Auto-generated method stub
		int sum=digit(num);
		return sum % 2 == 0;
	}

	static int digit(int num) {
		// TODO Auto-generated method stub
		int count=0;
		while(num>0) {
			count++;
			num=num/10;
		}
		return count;
	}

}

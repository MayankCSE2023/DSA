package Basics;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums= {10,1,2,3,4,5,7,8};
		int largest=nums[0];
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>largest) {
				largest=nums[i];
			}
		}
		
		System.out.println(largest);
		
		

	}

}

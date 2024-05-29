package Basics;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {8,1,2,3,12,4,5,7};
		int largest=nums[0];
		int secondLargest=Integer.MIN_VALUE;
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>largest) {
				secondLargest=largest;//if largest is someone new then 2nd largest is the previos largest
				largest=nums[i];
			}else if(nums[i]<largest && nums[i]>secondLargest) { //if a int is less than largest but greater than the second largest then the new second largest will be this integer
				secondLargest=nums[i];
			}
		}
		
		System.out.println(largest);
		System.out.println(secondLargest);

	}

}

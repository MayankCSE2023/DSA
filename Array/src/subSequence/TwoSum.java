package subSequence;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { -2, 0,8, 4, -1, 2, 5 };
		//System.out.println(twoSumBrute(nums, 6));
		//System.out.println(twoSumHashing(nums,6));
		
		int[] nums1= {-3,4,3,90};
		int[] out=twoSumHashingIndex(nums1, 0);
		for(int e: out) {
			System.out.print(e+" ");
		}

	}

	// ----------------------Brute Force(O(N^2))----------------------------------
	public static boolean twoSumBrute(int[] nums, int k) {

		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == k) {
					return true;
				}
			}
		}
		return false;
	}

	// ------------------------------Hashing---------------------------------------

	public static boolean twoSumHashing(int[] nums,int k) {
	
		int rem;
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<nums.length-1;i++) {
			rem=nums[i];
			
			if(map.containsKey(k-rem)) {
				return true;
			}
			map.put(rem, i);
		}
		return false;
	}
	
	public static int[] twoSumHashingIndex(int[] nums,int k) {
		
		int rem;
        int[] out=new int[2];
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<nums.length;i++) {
		
			rem=nums[i];	
				
			if(map.containsKey(k-rem)) {//{-3,4,3,90}
                out[0]=i;
                out[1]=map.get(k-rem);
				break;
			}
			map.put(rem, i);
		}
		return out;
	}
	
	// ----------------------TwoPointers(O(N.logN))----------------------------------
		public static boolean twoSumTwoPointers(int[] nums, int k) {
             // firstly sort the array
			// 1 pointer at start and 1 pointer to the end.
			//Add the pointer value.
			// if matched then return pointers
			//if sum is greater than the target then move the end pointer to left
			//if sum is less then move the start pointer to the right
			return false;
		}
}

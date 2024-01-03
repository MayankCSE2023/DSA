package permutation;

/*A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
Given an array of integers nums, find the next permutation of nums.

The replacement must be in place and use only constant extra memory.*/

public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {2,1,5,4,3,0,0};
		permute(nums);
		
		for (int i : nums) {
			System.out.print(i);
		}

	}
	
	public static void permute(int[] nums){
		int ind=-1;
		int l=nums.length;
		
		for(int i=l-2;i>=0;i--) {
			if(nums[i]<nums[i+1]) {//find the dip i.e nums[i]<nums[i+1] then only we cAn get the a number greater then prefix
				ind=i;
				break;
			}
		}
		
		if(ind==-1){
            sort(nums,0,l-1);
            return;
        }
		
		for(int i=l-1;i>=0;i--) {
			if(nums[i]>nums[ind]) {// we want to get next bigger permuataion but it should be next bigger not the biggest so find the next bigger number and swap, as we already have right subarray as in descending order because we didnt any dip before ind index 
				int temp=nums[i];
				nums[i]=nums[ind];
				nums[ind]=temp;
				break;
			}
		}
		
		sort(nums,ind+1,l-1);// sort the right hand subarray after ind index becacue we want to get the next biggest number
	}
	
	public static void sort(int[] nums,int s,int e) {
		if(s>=e) {
			return;
		}
		
		int temp=nums[s];
		nums[s]=nums[e];
		nums[e]=temp;
		sort(nums,s+1,e-1);
		
	}

}

package twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {0,0,0,0};
		List<List<Integer>> out=threeSum(nums);
		for (List<Integer> i : out) {
			System.out.println(i);
		}
		

	}
	
	public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int i = 0;
        int j = i + 1;
        int k = nums.length - 1;
        List<List<Integer>> out=new ArrayList<>();

        while (i < k) {//-4,-4,-1,-1,0,1,2,2  //0,0,0,0

            while (j < k) {
                sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {
                    List<Integer> ans = new ArrayList<>();
                    ans.add(nums[i]);
                    ans.add(nums[j]);
                    ans.add(nums[k]);
                    out.add(ans);
                    j++;
                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                    }

                } else if (sum > 0) {
                    k--;
                }else{
                    j++;
                }
            }
                k=nums.length-1;
                i++;
            while(i<k && nums[i]==nums[i-1]){
                i++;
            }
            j=i+1;

        }

        return out;
    }

}

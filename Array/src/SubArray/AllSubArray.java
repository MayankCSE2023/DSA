package SubArray;

import java.util.ArrayList;
import java.util.List;

public class AllSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3};
		List<List<Integer>> allSub=new ArrayList<>();
		findSubArray(nums,0,new ArrayList<>(),allSub);
		System.out.println(allSub);

	}
	
	public static void findSubArray(int[] nums,int i,List<Integer> subArr,List<List<Integer>> allSub) {
		if(i>=nums.length) {
			List<Integer> sub=new ArrayList<>(subArr);
			allSub.add(sub);
			return;
		}
		
		subArr.add(nums[i]);
		findSubArray(nums,i+1,subArr,allSub);
		subArr.remove(subArr.size()-1);
		findSubArray(nums,i+1,subArr,allSub);
		
	}

}

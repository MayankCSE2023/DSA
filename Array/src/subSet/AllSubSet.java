package subSet;

import java.util.ArrayList;
import java.util.List;

public class AllSubSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,1,2};
		List<List<Integer>> allSub=new ArrayList<>();
		//findSubSet(nums,0,new ArrayList<>(),allSub);
		findSubsetNoDublicates(nums,0,new ArrayList<>(),allSub);
		System.out.println(allSub);

	}
	//------------------------
	public static void findSubSet(int[] nums,int i,List<Integer> subArr,List<List<Integer>> allSub) {
		if(i>=nums.length) {
			List<Integer> sub=new ArrayList<>(subArr);
			allSub.add(sub);
			return;
		}
		
		subArr.add(nums[i]);
		findSubSet(nums,i+1,subArr,allSub);
		subArr.remove(subArr.size()-1);
		findSubSet(nums,i+1,subArr,allSub);
		
	}
	
	//---------------------no dublicates------------------------------
	public static void findSubsetNoDublicates(int[] nums,int i,List<Integer> set,List<List<Integer>> allSubSet){

        if(i>=nums.length){
            List<Integer> temp=new ArrayList<>(set);
            if(allSubSet.contains(temp)){//check if the subset already present
                return;
            }
            allSubSet.add(temp);
            return;
        }

        set.add(nums[i]);
        findSubsetNoDublicates(nums,i+1,set,allSubSet);
        set.remove(set.size()-1);
        findSubsetNoDublicates(nums,i+1,set,allSubSet);
    }

}

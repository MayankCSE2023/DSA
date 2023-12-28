package frequency;
import java.util.*;

//Given an array nums of size n, return the majority element.

//The majority element is the element that appears more than ⌊n / 2⌋ times.
//You may assume that the majority element always exists in the array.

//Example 2:

//Input: nums = [2,2,1,1,1,2,2]
//Output: 2

public class MajorityElement {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(nums));
		

	}
	
	public static int majorityElement(int[] nums) {

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int c=map.get(nums[i]);
                c++;
                map.put(nums[i],c);
                continue;
            }

                map.put(nums[i],1);
        }

        int key=0;
        int k=nums.length/2;

        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(e.getValue() > k){
                key=e.getKey();
            }
        }
        return key;       
    }

}

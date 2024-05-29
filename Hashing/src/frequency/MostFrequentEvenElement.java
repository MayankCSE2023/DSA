package frequency;

import java.util.*;

/*Given an integer array nums, return the most frequent even element.

If there is a tie, return the smallest one. If there is no such element, return -1.

Example 1:

Input: nums = [0,1,2,2,4,4,1]
Output: 2
Explanation:
The even elements are 0, 2, and 4. Of these, 2 and 4 appear the most.
We return the smallest one, which is 2.    */

public class MostFrequentEvenElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {0,1,2,2,4,4,4,1};
		System.out.println(mostFrequentEven(nums));

	}
	
	public static int mostFrequentEven(int[] nums) {

        if(nums.length==1 && nums[0]%2==0){
            return nums[0];
        }

        HashMap<Integer,Integer> map= new HashMap<>();


        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                continue;
            }

            if(map.containsKey(nums[i])){
                int c=map.get(nums[i]);
                c++;
                map.put(nums[i],c);
            }else{
                map.put(nums[i],1);
            }
        }

        int key=0;
        int maxCount=-1;

        for(Map.Entry<Integer,Integer> e: map.entrySet()){
                    if(e.getValue()>maxCount){
                        maxCount=e.getValue();
                        key=e.getKey();
                    }else if(e.getValue()==maxCount){
                        if(e.getKey()<key){
                           key=e.getKey();
                        }
                    }
        }

        if(maxCount==-1){
            return -1;
        }

        return key;
    }

}

package SubArray;

import java.util.HashMap;

public class MaximumSubArraySumEqualsZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {6,5,1,-2,1};
		System.out.println(getLongestZeroSumSubarrayLength(nums));

	}
	
	
	public static int getLongestZeroSumSubarrayLength(int []arr){
        // Write your code here.
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            
            if(sum==0) {
            	max=i+1;
            	map.put(sum, i);
            	continue;
            }

            if(map.containsKey(sum)){
                int temp=i-map.get(sum);
                if(temp>max){
                    max=temp;
                }
            }

            map.putIfAbsent(sum,i);
        }

        return max;
    }

}

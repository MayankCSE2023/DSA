package slidingWindow;

import java.util.ArrayList;
import java.util.List;

/*An integer has sequential digits if and only if each digit in the number is one more than the previous digit.

Return a sorted list of all the integers in the range [low, high] inclusive that have sequential digits.

 

Example 1:

Input: low = 100, high = 300
Output: [123,234]
Example 2:

Input: low = 1000, high = 13000
Output: [1234,2345,3456,4567,5678,6789,12345]
 

Constraints:

10 <= low <= high <= 10^9*/

public class SequentialDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list= sequentialDigits(10000, 130000);
		
		for (int i : list) {
			System.out.print(i + " ");
		}

	}
	
	 public static List<Integer> sequentialDigits(int low, int high) {
	        
	        int start=windowRange(low);
	        int end=windowRange(high);
	        List<Integer> list=new ArrayList<>();


	        String digits="123456789";

	        for(int i=start;i<=end;i++){
	            int j=0;
	            int k=i;

	            while(k<=digits.length()){
	                int slab=Integer.parseInt(digits.substring(j,k));
	                if(slab>=low && slab<=high){
	                    list.add(slab);
	                }

	                j++;
	                k++;
	            }
	        }

	        return list;
	    }

	    public static int windowRange(int num){
	        int count=0;

	        while(num!=0){
	            num=num/10;
	            count++;
	        }

	        return count;
	    }

}

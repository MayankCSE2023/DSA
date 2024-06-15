package binarySearchOnAnswer;

/*Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.*/



public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strs= {"babb","caa"};
		
		System.out.println(longestCommonPrefix(strs));

	}
	
	public static String longestCommonPrefix(String[] strs) {
        int low=0;
        int high=Integer.MAX_VALUE;
    
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<high){
                high=strs[i].length();
            }
        }

        high--;
        int ans=-1;

        while(low<=high){                //{"babb","caa"}
            int mid=low+(high-low)/2;

            if(isCommon(strs,mid)==true && isCommon(strs,low)==true){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        
//        if(ans==-1) {
//        	return "";
//        }
//        
        return strs[0].substring(0,ans+1);
    }

    public static boolean isCommon(String[] strs, int k){
        char ref=strs[0].charAt(k);

        for(int i=0;i<strs.length;i++){
            if(strs[i].charAt(k)!=ref){
                return false;
            }
        }

        return true;
    }

}

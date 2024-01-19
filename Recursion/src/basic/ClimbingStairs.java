package basic;

/*You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 

Constraints:

1 <= n <= 45*/

public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbStairs(10));
	}
	
	 public static int climbStairs(int n) {

	        return climb(n,0,0);
	        
	    }

	    public static int climb(int n,int sum,int ways){
	        if(sum>n){
	            return ways;
	        }

	        if(sum==n){
	            return ways+1;
	        }

	        ways=climb(n,sum+1,ways);
	        return climb(n,sum+2,ways);
	    }

}

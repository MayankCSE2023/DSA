package basic;

/*3184. Count Pairs That Form a Complete Day I
Attempted
Easy
Companies
Hint
Given an integer array hours representing times in hours, return an integer denoting the number of pairs i, j where i < j and hours[i] + hours[j] forms a complete day.

A complete day is defined as a time duration that is an exact multiple of 24 hours.

For example, 1 day is 24 hours, 2 days is 48 hours, 3 days is 72 hours, and so on.

 

Example 1:

Input: hours = [12,12,30,24,24]

Output: 2

Explanation:

The pairs of indices that form a complete day are (0, 1) and (3, 4).

Example 2:

Input: hours = [72,48,24,3]

Output: 3

Explanation:

The pairs of indices that form a complete day are (0, 1), (0, 2), and (1, 2).

 

Constraints:

1 <= hours.length <= 100
1 <= hours[i] <= 109*/

public class CountPairsThatFormaCompleteDayI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] hours= {72,48,24,3};
		System.out.println(countCompleteDayPairs(hours));

	}
	
	public static int countCompleteDayPairs(int[] hours) {
        int pair=countDays(hours ,0,0,0,0);
        return pair;
    }

    public static int countDays(int[] hours , int i,int day,int count, int pair){
    	if (i >= hours.length) { // when out of bound then check for count
            if (count == 2) { 
                if (day % 24 == 0) {
                    pair++;
                }
            }
            return pair;
        }

        if (count == 2) { // Count: to stop recursion on a pair
            if (day % 24 == 0) {
                pair++;
            }

            return pair;

        }

        pair = countDays(hours, i + 1, day + hours[i], count + 1, pair);
        return countDays(hours, i + 1, day, count, pair);


    }

}

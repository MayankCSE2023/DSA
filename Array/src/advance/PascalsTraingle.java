package advance;

import java.util.ArrayList;
import java.util.List;

/*Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
*/

public class PascalsTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> traingle = new ArrayList<>();
		traingle = generate(5);
		
		for(List<Integer> list : traingle) {
			System.out.println(list); 
		}

	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> traingle = new ArrayList<>();
		int start = 1;
		int end = 1;

		for (int i = 1; i <= numRows; i++) {//[[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
			List<Integer> row = new ArrayList<>();
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i) {
					row.add(1);
				} else {
					List<Integer> temp = traingle.get(i-2);
					int n = i - 2;
					int k=j;
					while (n != 0) {
						int sum = temp.get(k-1) + temp.get(k-2);
						k++;
						row.add(sum);
						n--;
					}
					j=i-1;
				}

			}
			traingle.add(row);

		}
		
		return traingle;
	}

}

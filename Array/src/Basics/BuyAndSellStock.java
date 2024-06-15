package Basics;

/*You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.*/

public class BuyAndSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices= {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
	
		

	}
	
	public static int maxProfit(int[] prices){ 
        int max=0;
        int buy=prices[0];
        int cost;

        for(int i=1;i<prices.length;i++){
            
        	if(prices[i]<buy){// this checks if there is any day when stocks is lesser than already present stocks.if yes then replace and check if we can sell it with max profit then already present.
                buy=prices[i];
                continue;
            }
        	
        	cost=prices[i]-buy;
            
            
            if(cost>max){
                max=cost;
            }

            
        }

///-------------------------N^2 time complexity---------------------------------//
        // for(int i=0;i<prices.length-1;i++){
        //     buy=prices[i];
        //     for(int j=i+1;j<prices.length;j++){
        //         if(prices[j]-buy>max){
        //             max=prices[j]-buy;
        //         }
        //     }
        // }

        return max;
    }

}

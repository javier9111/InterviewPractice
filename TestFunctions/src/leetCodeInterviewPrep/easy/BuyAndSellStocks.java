package leetCodeInterviewPrep.easy;
/***
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.

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
Explanation: In this case, no transactions are done and the max profit = 0.
 

Constraints:

1 <= prices.length <= 105
0 <= prices[i] <= 104
 */
public class BuyAndSellStocks {
    

    public static void main(String[] args) {
        
        int[] price = {5,6,20,2,45,5,100};
        //there is another solution when there are a lot of items in the array and the memory ranout
       // int buyPrices = Integer.MAX_VALUE;
        System.out.println(maxProfit(price));

    }



    public static int maxProfit(int[] prices) {
        


        //think about doing 2 poiters or doing two loops

        //save the max profit on a variable while looping all the items
        int maxProfit = 0, counter1=0, counter2=0 ;


        while(counter1<prices.length-1){

            int tempProfit = prices[counter2] -prices[counter1];
            if( tempProfit> 0 && tempProfit>maxProfit){
                maxProfit = tempProfit;
            }
            counter2++;
            if(counter2 >=prices.length){
                counter1++;
                counter2=counter1+1;
            } 
        }

        return maxProfit;

    }
}

/* time limit exceeded */
public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int min= prices[0]; int max= prices[0];
        int minDay= 0; int maxDay= 0;
        for (int i= 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min= prices[i];
                minDay= i;
            }
            if (prices[i] > max) {
                max= prices[i];
                maxDay= i;
            }
        }
        if (maxDay <= minDay) return 0;
        return max - min;
    }
}

/*dynamic programming: 从前向后遍历数组，记录当前出现过的最低价格，作为买入价格，
并计算以当天价格出售的收益，作为可能的最大收益，整个遍历过程中，出现过的最大收益就是所求。*/
public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;
        int min= prices[0]; int p= 0;
        for (int i= 0; i < prices.length; i++) {
            p= Math.max(p, prices[i]-min);
            min= Math.min(prices[i], min);
        }
        return p;
    }
}

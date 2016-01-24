/*本题可以多次买卖股票，从而累积赚取所有的价格差。因此用贪心法，基本思想是锁定一个低价，然后在价格升到局部最高点
（即下一天的价钱就下降了）时候，抛出股票，然后把下一天较低的价钱作为买入，接着计算。要注意最后要处理最后一次的利润*/
public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int buy= prices[0];
        int sell= 0;
        int p= 0;
        for (int i= 0; i < prices.length-1; i++) {
            if (prices[i] > prices[i+1]) {
                sell= prices[i];
                p= p + sell - buy;
                buy= prices[i+1];
            } else if (i == prices.length-2) {
                p= p + prices[prices.length-1] - buy;
            }
        }
        return p;
    }
}

/*计算每个相邻的diff差，只要diff大于0，就累积起来*/
public class Solution {
    public int maxProfit(int[] prices) {
        int diff= 0;
        int p= 0;
        for (int i= 0; i < prices.length-1; i++) {
           diff= prices[i+1] - prices[i];
           if (diff > 0)
                p += diff;
        }
        return p;
    }
}

import java.util.Scanner;

public class StockProfit {

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                int profit = price - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print(" ");
        int n = sc.nextInt();
        int[] prices = new int[n];

        // Input array elements
        System.out.print(" ");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        // Output max profit
        int result = maxProfit(prices);
        System.out.println(result);
    }
}
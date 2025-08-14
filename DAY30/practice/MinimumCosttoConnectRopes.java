package practice;

import java.util.PriorityQueue;

public class MinimumCosttoConnectRopes {

    static int minCost(int arr[], int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            pq.add(arr[i]);
        }

        int res = 0;

        while (pq.size() > 1) {
            int first = pq.poll();  // smallest rope
            int second = pq.poll(); // next smallest rope

            int cost = first + second;
            res += cost;

            // Add the combined rope back into the heap
            pq.add(cost);
        }

        return res;
    }

    public static void main(String args[]) {
        int len[] = {4, 3, 2, 6};
        int size = len.length;

        System.out.println("Total cost for connecting ropes is " + minCost(len, size));
    }
}

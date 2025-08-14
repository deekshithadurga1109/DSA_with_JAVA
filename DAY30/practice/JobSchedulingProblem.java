package practice;

import java.util.*;

public class JobSchedulingProblem {

    // Job class to store job details
    static class Job {
        char job_id;
        int deadline;
        int profit;

        Job(char job_id, int deadline, int profit) {
            this.deadline = deadline;
            this.job_id = job_id;
            this.profit = profit;
        }
    }

    // Function to print the job scheduling sequence
    static void printJobScheduling(ArrayList<Job> arr) {
        int n = arr.size();

        // Step 1: Sort jobs by deadline (ascending)
        Collections.sort(arr, (a, b) -> a.deadline - b.deadline);

        ArrayList<Job> result = new ArrayList<>();

        // Max-heap based on profit
        PriorityQueue<Job> maxHeap = new PriorityQueue<>((a, b) -> b.profit - a.profit);

        // Step 2: Iterate from last job to first
        for (int i = n - 1; i >= 0; i--) {

            // Calculate available slots
            int slot_available;
            if (i == 0) {
                slot_available = arr.get(i).deadline;
            } else {
                slot_available = arr.get(i).deadline - arr.get(i - 1).deadline;
            }

            // Add current job to maxHeap
            maxHeap.add(arr.get(i));

            // Fill slots with highest profit jobs
            while (slot_available > 0 && !maxHeap.isEmpty()) {
                Job job = maxHeap.remove();
                result.add(job);
                slot_available--;
            }
        }

        // Step 3: Sort result by deadline for correct sequence
        Collections.sort(result, (a, b) -> a.deadline - b.deadline);

        // Step 4: Print job IDs
        for (Job job : result) {
            System.out.print(job.job_id + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        ArrayList<Job> arr = new ArrayList<>();
        arr.add(new Job('a', 2, 100));
        arr.add(new Job('b', 1, 19));
        arr.add(new Job('c', 2, 27));
        arr.add(new Job('d', 1, 25));
        arr.add(new Job('e', 3, 15));

        System.out.println("Following is maximum profit sequence of jobs:");
        printJobScheduling(arr);
    }
}

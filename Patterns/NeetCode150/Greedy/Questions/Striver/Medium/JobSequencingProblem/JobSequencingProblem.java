import java.util.*;

public class JobSequencingProblem {
    public static void main(String[] args) {
        int deadline[] = { 4, 1, 1, 1 };
        int profit[] = { 20, 10, 40, 30 };
        Solution sol = new Solution();
        ArrayList<Integer> res = new ArrayList<>();
        res = sol.jobSequencing(deadline, profit);
        System.out.print("[");
        for (Integer integer : res) {
            System.out.print(" " + integer + " ");
        }
        System.out.print("]");
    }
}

class Job {
    // we need a ID, Profit, Deadline
    int id;
    int deadline;
    int profit;

    Job(int id, int d, int p) {
        this.id = id;
        this.deadline = d;
        this.profit = p;
    }
}

class Solution {
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        int n = deadline.length;
        Job[] jobs = new Job[n];
        for (int i = 0; i < n; i++) {
            jobs[i] = new Job(i + 1, deadline[i], profit[i]);
        }
        // sort in des of order of profit
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);
        // find max among the deadline
        int maxi = Integer.MIN_VALUE;
        for (Job job : jobs) {
            maxi = Math.max(maxi, job.deadline);
        }
        // create an array as per the maxi
        int[] slots = new int[maxi + 1];
        Arrays.fill(slots, -1);

        // initialize the counters
        int countJob = 0;
        int countProfit = 0;
        for (int i = 0; i < n; i++) {
            for (int j = jobs[i].deadline; j > 0; j--) {
                if (slots[j] == -1) {
                    slots[j] = jobs[i].id;
                    countJob++;
                    countProfit += jobs[i].profit;
                    break;
                }
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        res.add(countJob);
        res.add(countProfit);
        return res;
    }
}
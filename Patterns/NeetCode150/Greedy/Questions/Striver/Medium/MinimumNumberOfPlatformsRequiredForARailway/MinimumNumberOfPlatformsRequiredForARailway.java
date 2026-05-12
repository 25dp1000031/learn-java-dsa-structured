package Patterns.NeetCode150.Greedy.Questions.Striver.Medium.MinimumNumberOfPlatformsRequiredForARailway;

import java.util.*;

public class MinimumNumberOfPlatformsRequiredForARailway {
    public static void main(String[] args) {
        int[] arr = { 900, 945, 955, 1100, 1500, 1800 };
        int[] dep = { 920, 1200, 1130, 1150, 1900, 2000 };

        Solution obj = new Solution();
        System.out.println("Minimum number of Platforms required " +
                obj.minPlatform(arr, dep));
    }
}

class Solution {
    public int minPlatform(int arr[], int dep[]) {
        // code here
        Arrays.sort(arr);
        Arrays.sort(dep);

        int platformCount = 1;
        int result = 1;
        int i = 1; // already arrived
        int j = 0;
        while (i < arr.length && j < arr.length) {
            if (arr[i] <= dep[j]) {
                platformCount++;
                i++;
            } else {
                platformCount--;
                j++;
            }
            result = Math.max(platformCount, result);
        }
        return result;
    }
}

// https://www.geeksforgeeks.org/problems/minimum-platforms-1587115620/1
import java.util.*;

public class SuffixSum {
    public static void main(String[] args) {
        // example : arr : [2, -1, 3, -3, 4] and its suffix_arr : [5, 3, 4, 1, 4]
        // now the suffix of it would be [4], [4, -3], [4, -3, 3], [4 , -3, 3, -1]
        // but would not be [-1, 3], [3, -3], [-1, 3, -3, 4] [3, -3, 4]
        int[] arr = { 2, -1, 3, -3, 4 };
        ExplanationOfSuffixSum ess = new ExplanationOfSuffixSum();
        int[] suffix_arr = ess.BuildSuffixSum(arr);
        for (int i : suffix_arr) {
            System.out.println(i);
        }
        System.out.println("Sum : " + ess.getSuffixSum(suffix_arr, 2, 4));
    }
}

class ExplanationOfSuffixSum {
    // given an array of values, design a data structure that can query the sum of
    // subarray of the values. [2, -1, 3, -3, 4]
    // Build prefix sum iteratively
    public int[] BuildSuffixSum(int[] arr) {
        int[] suffix = new int[arr.length];
        suffix[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i > -1; i--) {
            suffix[i] = suffix[i + 1] + arr[i];
        }
        return suffix;
    }

    public int getSuffixSum(int[] arr, int first, int second) {
        if (second == arr.length - 1) {
            return arr[first];
        }
        return arr[first] - arr[second + 1];
        // [5, 3, 4, 1, 4] // first = 2, second = 4 ans = 0
    }
}

class QuestionOnSuffixSum {

}
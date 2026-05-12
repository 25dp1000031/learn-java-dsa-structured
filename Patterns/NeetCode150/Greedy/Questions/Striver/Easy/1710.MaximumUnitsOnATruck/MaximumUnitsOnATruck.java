import java.util.Arrays;

public class MaximumUnitsOnATruck {
    public static void main(String[] args) {
        int[][] boxTypes = { { 1, 3 }, { 2, 2 }, { 3, 1 } };
        int truckSize = 4;
        SolutionCleaner sol = new SolutionCleaner();
        int res = sol.maximumUnits(boxTypes, truckSize);
        System.out.println(res);
    }
}

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int n = boxTypes.length;
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int totalUnits = 0;
        for (int i = 0; i < n; i++) {
            if (truckSize == 0) {
                break;
            }
            int boxes = boxTypes[i][0];
            int units = boxTypes[i][1];
            if (boxes <= truckSize) {
                truckSize -= boxes;
                totalUnits += boxes * units;
            } else {
                int fractionUnits = truckSize * units;
                truckSize -= truckSize;
                totalUnits += fractionUnits;
            }
        }
        return totalUnits;
    }
}

class SolutionCleaner {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int totalUnits = 0;
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        for (int[] box : boxTypes) {
            if (truckSize == 0) {
                break;
            }
            int boxes = box[0];
            int units = box[1];
            int toTake = Math.min(boxes, truckSize);
            totalUnits += toTake * units;
            truckSize -= toTake;
        }
        return totalUnits;
    }
}
import java.util.*;

public class FractionalKnapsack {
    public static void main(String[] args) {
        // Input data
        int n = 3, capacity = 50; // Number of items and capacity of knapsack
        Item[] arr = { new Item(100, 20), new Item(60, 10), new Item(120, 30) };

        // Create an object of the Solution class
        Solution obj = new Solution();

        // Calculate the maximum value we can get with the fractional knapsack
        double ans = obj.fractionalKnapsack(capacity, arr, n);

        // Output the result
        System.out.println("The maximum value is: " + String.format("%.2f", ans));
    }

}

class Item {
    int value;
    int weight;

    Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

class Solution {
    public double fractionalKnapsack(int capacity, Item[] arr, int n) {
        Arrays.sort(arr, new ItemComparator());

        int currCapacity = 0;
        double finalValue = 0;

        for (int i = 0; i < n; i++) {
            if (currCapacity + arr[i].weight <= capacity) {
                currCapacity += arr[i].weight;
                finalValue += arr[i].value;
            } else {
                int remain = capacity - currCapacity;
                finalValue += ((double) arr[i].value / (double) arr[i].weight * (double) remain);
                break;
            }
        }
        return finalValue;
    }

    static class ItemComparator implements Comparator<Item> {
        public int compare(Item a, Item b) {
            double r1 = (double) a.value / (double) a.weight;
            double r2 = (double) b.value / (double) b.weight;
            return Double.compare(r2, r1);
        }
    }
}

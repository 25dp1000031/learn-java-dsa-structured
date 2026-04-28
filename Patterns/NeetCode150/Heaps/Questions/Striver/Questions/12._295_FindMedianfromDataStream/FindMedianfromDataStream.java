import java.util.*;

public class FindMedianfromDataStream {
    public static void main(String[] args) {
        MedianFinder mf = new MedianFinder();
        mf.addNum(1);
        mf.addNum(2);
        System.out.println(mf.findMedian()); // 1.5
        mf.addNum(3);
        System.out.println(mf.findMedian()); // 2
    }
}

// even array
// 2. 4. 6 .8 --> [2,4] [6,8]
// the smallest + largest/2 for an even array is infact its median
// odd array
// now lets consider a odd array for example : 2. 4. 6
// here taking the smallest and largest does not help we have to do all sum / n
// but looking closely 2 + 4 + 6 / 3 is 4 the median of the array
// so we just initiate two heap (max and min) balance them
// one of the heaps last element will be median for odd array and maxheap.peek +
// minheap.peek / 2 will be median for even array

class MedianFinder {
    private PriorityQueue<Integer> minHeap;
    private PriorityQueue<Integer> maxHeap;

    public MedianFinder() {
        // maxHeap to store larger half
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        // minHeap to store smaller half
        minHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        maxHeap.add(num);
        minHeap.add(maxHeap.remove());

        if (maxHeap.size() < minHeap.size()) {
            maxHeap.add(minHeap.remove());
        }

    }

    public double findMedian() {
        // for even array : [2, 4] [8, 6]
        if (minHeap.size() == maxHeap.size()) {
            int smallest = minHeap.peek();
            int largest = maxHeap.peek();
            return (smallest + largest) / 2.0;
        } else {
            return maxHeap.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
//package offer;
//
//import java.util.Comparator;
//import java.util.PriorityQueue;
//
///**
// * 数据流中的中位数
// */
//public class Question47 {
//    PriorityQueue<Double> maxHeap = new PriorityQueue<>(
//            new Comparator<Integer>() { //大顶堆，容量11
//                @Override
//                public int compare(Integer i1, Integer i2) {
//                    return i2 - i1;
//                }
//            });
//
//    PriorityQueue<Double> minHeap = new PriorityQueue<>();
//    int size = 0;
//
//    public void Insert(Integer num) {
//        if (minHeap.size() == 0 && maxHeap.size() == 0) {
//            maxHeap.add(num);
//        }
//        if (minHeap.size() != 0 && num > minHeap.peek()) {
//            minHeap.add(num);
//        }
//        if (maxHeap.size() != 0 && num <= maxHeap.peek()) {
//            maxHeap.add(num);
//        }
//        size++;
//    }
//
//    public Double GetMedian() {
//        if (size % 2 == 1) {
//            if (maxHeap.size() > minHeap.size()) {
//                return maxHeap.peek();
//            } else {
//                return minHeap.peek();
//            }
//        }
//
//        return 1.0;
//    }
//
//}

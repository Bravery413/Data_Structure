//package offer;
//
//import java.util.Comparator;
//import java.util.PriorityQueue;
//
///**
// * 数据流中的中位数
// */
//public class Question47 {
//    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
//            new Comparator<Integer>() { //大顶堆，容量11
//                @Override
//                public int compare(Integer i1, Integer i2) {
//                    return i2 - i1;
//                }
//            });
//
//    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
//    int size = 0;
//
//    public void Insert(Integer num) {
//        size++;
//        if (size % 2 == 1) {
//            minHeap.add(num);
//            Integer poll = minHeap.poll();
//            maxHeap.add(poll);
//        } else {
//            maxHeap.add(num);
//            Integer poll = maxHeap.poll();
//            minHeap.add(poll);
//        }
//    }
//
//    public Double GetMedian() {
//        if (size <= 0) {
//            return 0.0;
//        }
//        if (size % 2 == 1) {
//            return maxHeap.peek() * 1.0;
//        } else {
//            return (maxHeap.peek() + minHeap.peek()) / 2.0;
//        }
//
//    }
//
//}

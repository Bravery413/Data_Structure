//package offer;
//
//import java.util.*;
//
///**
// * 最小的k个数
// */
//public class Question2 {
//
//
//    /**
//     * 最小k个数用大根堆解决
//     *
//     * @param input
//     * @param k
//     * @return
//     */
//    public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
//        if (k > input.length || k <= 0) {
//            return new ArrayList<Integer>();
//        }
//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, new Comparator<Integer>() { //大顶堆，容量11
//            @Override
//            public int compare(Integer i1, Integer i2) {
//                return i2 - i1;
//            }
//        });
//        for (int i = 0; i < input.length; i++) {
//            if (i < k) {
//                maxHeap.add(input[i]);
//            } else {
//                Integer peek = maxHeap.peek();
//                if (input[i] < peek) {
//                    maxHeap.poll();
//                    maxHeap.add(input[i]);
//                }
//            }
//
//        }
//        ArrayList<Integer> res = new ArrayList<>(k);
//        for (int i = 0; i < k; i++) {
//            res.add(maxHeap.poll());
//        }
//        return res;
//    }
//
//    public static void main(String[] args) {
//        int[] array = {4, 5, 1, 6, 2, 7, 3, 8};
//        ArrayList<Integer> integers = GetLeastNumbers_Solution(array, 4);
//        System.out.println(integers);
//
//    }
//
//
//}

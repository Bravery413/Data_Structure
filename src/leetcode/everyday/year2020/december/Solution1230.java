package leetcode.everyday.year2020.december;

import java.util.PriorityQueue;

/**
 * @author 潘勇
 * @date 2020/12/30 8:27
 */


public class Solution1230 {
    public static void main(String[] args) {
//        System.out.println(lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
//        System.out.println(lastStoneWeight(new int[]{1, 3}

        StringBuilder errMsg = new StringBuilder();
        System.out.println(errMsg.toString().isEmpty());

    }



    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        for (int stone : stones) {
            queue.offer(stone);
        }
        while (queue.size() > 1) {
            int a = queue.poll();
            int b = queue.poll();
            if (a > b) {
                queue.offer(a - b);
            }

        }
        return queue.size() > 0 ? queue.poll() : 0;

    }


    public static int lastStoneWeight0(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> b - a);
        for (int stone : stones) {
            pq.offer(stone);
        }

        while (pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();
            if (a > b) {
                pq.offer(a - b);
            }
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }
}

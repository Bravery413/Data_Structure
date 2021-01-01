package leetcode.everyday.year2020.december;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 潘勇
 * @date 2020/12/11 8:39
 */

/**
 * 649. Dota2 参议院
 *
 */
public class Solution1211 {
    /**
     * 队列+贪心
     * @param senate
     * @return
     */
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                radiant.offer(i);
            } else {
                dire.offer(i);
            }
        }
        while (!radiant.isEmpty() && !dire.isEmpty()) {
            Integer radiantIndex = radiant.poll();
            Integer direIndex = dire.poll();
            if (radiantIndex < direIndex) {
                radiant.offer(radiantIndex + n);
            } else {
                dire.offer(direIndex + n);
            }
        }
        return !radiant.isEmpty() ? "Radiant" : "Dire";
    }
}

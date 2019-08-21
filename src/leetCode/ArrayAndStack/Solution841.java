package leetCode.ArrayAndStack;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author bravery
 * @date 2019/8/21 9:15
 */
//TODO 钥匙和房间
public class Solution841 {
    boolean[] visited;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        visited=new boolean[rooms.size()];
        bfs(rooms);
        for (boolean v:visited){
            if (!v){
                return false;
            }
        }
        return true;
    }
    public void bfs(List<List<Integer>> rooms){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        List<Integer> room;
        while (!queue.isEmpty()){
            int roomNum=queue.poll();
            room=rooms.get(roomNum);
            for (int key:room){
                if (!visited[key]){
                    queue.offer(key);
                }
            }
        }
    }
}

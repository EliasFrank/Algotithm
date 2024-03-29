package leetcode.editor.cn;
//剑指 Offer 59 - II	
////请定义一个队列并实现函数 max_value 得到队列里的最大值，要求函数max_value、push_back 和 pop_front 的均摊时间复杂度都
//是O(1)。 
//
// 若队列为空，pop_front 和 max_value 需要返回 -1 
//
// 示例 1： 
//
// 输入: 
//["MaxQueue","push_back","push_back","max_value","pop_front","max_value"]
//[[],[1],[2],[],[],[]]
//输出: [null,null,null,2,1,2]
// 
//
// 示例 2： 
//
// 输入: 
//["MaxQueue","pop_front","max_value"]
//[[],[],[]]
//输出: [null,-1,-1]
// 
//
// 
//
// 限制： 
//
// 
// 1 <= push_back,pop_front,max_value的总操作数 <= 10000 
// 1 <= value <= 10^5 
// 
// Related Topics 栈 Sliding Window 
// 👍 252 👎 0


import java.util.*;

public class DuiLieDeZuiDaZhiLcof{
    public static void main(String[] args) {
//        Solution solution = new DuiLieDeZuiDaZhiLcof().new Solution();
        MaxQueue maxQueue = new DuiLieDeZuiDaZhiLcof().new MaxQueue();
        maxQueue.push_back(1);
        maxQueue.push_back(2);
        System.out.println(maxQueue.max_value());
        System.out.println(maxQueue.pop_front());
        System.out.println(maxQueue.max_value());
    }

//leetcode submit region begin(Prohibit modification and deletion)
class MaxQueue {

    Deque<Integer> queue;
    Deque<Integer> max;

    public MaxQueue() {
        queue = new LinkedList();
        max = new LinkedList();
    }

    public int max_value() {
        return max.isEmpty() ? -1 : max.peekFirst();
    }

    public void push_back(int value) {
        queue.offer(value);
        while (!max.isEmpty() && max.peekLast() < value) {
            max.pollLast();
        }
        max.offerLast(value);
    }

    public int pop_front() {
        if (queue.isEmpty()) return -1;
        int tmp  = queue.pollFirst();
        if (max.peekFirst() != null && max.peekFirst() == tmp) {
            max.pollFirst();
        }
        return tmp;
    }
}

/**
 * Your MaxQueue object will be instantiated and called as such:
 * MaxQueue obj = new MaxQueue();
 * int param_1 = obj.max_value();
 * obj.push_back(value);
 * int param_3 = obj.pop_front();
 */
//leetcode submit region end(Prohibit modification and deletion)

}
package leetcode.editor.cn;
//剑指 Offer 41	
////如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。如果从数据流中读出偶数个数值，那么中位数就是所有数
//值排序之后中间两个数的平均值。 
//
// 例如， 
//
// [2,3,4] 的中位数是 3 
//
// [2,3] 的中位数是 (2 + 3) / 2 = 2.5 
//
// 设计一个支持以下两种操作的数据结构： 
//
// 
// void addNum(int num) - 从数据流中添加一个整数到数据结构中。 
// double findMedian() - 返回目前所有元素的中位数。 
// 
//
// 示例 1： 
//
// 输入：
//["MedianFinder","addNum","addNum","findMedian","addNum","findMedian"]
//[[],[1],[2],[],[3],[]]
//输出：[null,null,null,1.50000,null,2.00000]
// 
//
// 示例 2： 
//
// 输入：
//["MedianFinder","addNum","findMedian","addNum","findMedian"]
//[[],[2],[],[3],[]]
//输出：[null,null,2.00000,null,2.50000] 
//
// 
//
// 限制： 
//
// 
// 最多会对 addNum、findMedian 进行 50000 次调用。 
// 
//
// 注意：本题与主站 295 题相同：https://leetcode-cn.com/problems/find-median-from-data-strea
//m/ 
// Related Topics 堆 设计 
// 👍 154 👎 0


import java.sql.SQLIntegrityConstraintViolationException;
import java.util.*;

public class ShuJuLiuZhongDeZhongWeiShuLcof{
    public static void main(String[] args) {
//        Solution solution = new ShuJuLiuZhongDeZhongWeiShuLcof().new Solution();
        MedianFinder find = new ShuJuLiuZhongDeZhongWeiShuLcof().new MedianFinder();
        find.addNum(6);
        double median = find.findMedian();
        System.out.println(median);
        find.addNum(10);
        median = find.findMedian();
        System.out.println(median);
        find.addNum(2);
        median = find.findMedian();
        System.out.println(median);
    }

//leetcode submit region begin(Prohibit modification and deletion)
class MedianFinder {
    Queue<Integer> max, min;
    public MedianFinder() {
        min = new PriorityQueue<>();//小顶堆保存大的一半
        max = new PriorityQueue<>(Comparator.reverseOrder());//大顶堆保存小的一半
    }
    public void addNum(int num) {
        if (min.size() != max.size()) {
            min.add(num);
            max.add(min.poll());
        } else {
            max.add(num);
            min.add(max.poll());
        }
    }
    public double findMedian() {
        return max.size() == min.size() ? (min.peek() + max.peek()) / 2.0 : min.peek();
    }
}
/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
//leetcode submit region end(Prohibit modification and deletion)

}
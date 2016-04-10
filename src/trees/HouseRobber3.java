package trees;

import trees.model.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by muppallav
 */
public class HouseRobber3 {


    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    public static int rob(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        q.offer(null); // initial marker
        int sum1 = 0;
        int sum2 = 0;
        while (!q.isEmpty()) {
            TreeNode current = q.poll();
            if (current == null) {
                int temp = sum1;
                sum1 = sum2;
                sum2 = temp;
                //add marker at end of queue
                if (!q.isEmpty()) {
                    q.offer(null);
                }
            } else {
                sum1 = sum1 + current.val;
                if (current.left != null) {
                    q.offer(current.left);
                }
                if (current.right != null) {
                    q.offer(current.right);
                }
            }
        }
        return sum1 >= sum2 ? sum1 : sum2;

    }


}

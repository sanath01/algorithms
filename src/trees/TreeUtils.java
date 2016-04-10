package trees;

import trees.model.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by muppallav on 3/15/16.
 */
public class TreeUtils {

    /**
     * @param s coma seperated string with integer values [3,2,3,null,3,null,1]
     *          3
     *          / \
     *          2   3
     *          \   \
     *          3   1
     * @return root of the tree created
     */
    public static TreeNode constructTree(String s) {

        try {
            if (s == null || s.equals("")) {
                return null;
            }
            String[] str = s.split(",");
            if (str.length % 2 == 0) {
                s = s + ",null";
            }
            str = s.split(",");
            Queue<TreeNode> queue = new LinkedList<>();

            TreeNode rootNode = new TreeNode(Integer.valueOf(str[0]));
            queue.offer(rootNode);

            for (int i = 1; i < str.length; i = i + 2) {
                TreeNode leftNode = null;
                TreeNode rightNode = null;
                if (!str[i].equals("null")) {
                    leftNode = new TreeNode(Integer.valueOf(str[i]));
                    queue.offer(leftNode);
                }
                if (!str[i + 1].equals("null")) {
                    rightNode = new TreeNode(Integer.valueOf(str[i + 1]));
                    queue.offer(rightNode);
                }
                TreeNode root = null;
                if (!queue.isEmpty()) {
                    root = queue.poll();
                }
                if (root != null) {
                    root.left = leftNode;
                    root.right = rightNode;
                }

            }
            return rootNode;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}

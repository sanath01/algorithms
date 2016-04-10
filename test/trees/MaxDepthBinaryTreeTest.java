package trees;

import org.junit.Test;
import trees.model.TreeNode;

import static org.junit.Assert.assertEquals;

/**
 * Created by muppallav
 */
public class MaxDepthBinaryTreeTest {

    @Test
    public void testMaxDepth() throws Exception {
        TreeNode root = TreeUtils.constructTree("1,2,3,null,4,5,null,6,null,null,7");
        int maxDepth = MaxDepthBinaryTree.maxDepth(root);
        System.out.println("maxDepth= " + maxDepth);
        assertEquals(maxDepth, 4);
    }
}
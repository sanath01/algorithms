package trees;

import org.junit.Before;
import org.junit.Test;
import trees.model.TreeNode;

import static org.junit.Assert.*;

/**
 * Created by muppallav on 3/15/16.
 */
public class HouseRobber3Test {

    TreeNode treeRoot = null;

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testRobNull() throws Exception {
        treeRoot = TreeUtils.constructTree("");
        assertNull(treeRoot);
        int maxRob = HouseRobber3.rob(treeRoot);
        assertEquals(maxRob, 0);
        System.out.println("Max House robbing= " + maxRob);
    }

    @Test
    public void testRobLeftSkewed() throws Exception {
        treeRoot = TreeUtils.constructTree("");
        assertNotNull(treeRoot);
        int maxRob = HouseRobber3.rob(treeRoot);
        System.out.println("Max House robbing= " + maxRob);
    }

    @Test
    public void testRobRightSkewed() throws Exception {
        treeRoot = TreeUtils.constructTree("4,1,null,2,null,3,2");
        assertNotNull(treeRoot);
        int maxRob = HouseRobber3.rob(treeRoot);
        System.out.println("Max House robbing= " + maxRob);
    }

    @Test
    public void testRobEvenNodes() throws Exception {
        treeRoot = TreeUtils.constructTree("4,1,4,2,null,3,6,null,1,7");
        assertNotNull(treeRoot);
        int maxRob = HouseRobber3.rob(treeRoot);
        System.out.println("Max House robbing= " + maxRob);
    }

    @Test
    public void testRobOddNodes() throws Exception {
        treeRoot = TreeUtils.constructTree("1,2,3,null,4,6");
        assertNotNull(treeRoot);
        int maxRob = HouseRobber3.rob(treeRoot);
        System.out.println("Max House robbing= " + maxRob);
    }
}
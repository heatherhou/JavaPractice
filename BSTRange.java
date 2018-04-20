import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class BSTRange {
    public int[] range(TreeNode t, int low, int high) {
        // replace with working code
        TreeSet<Integer> list = new TreeSet<>();
        if (t==null)
        	return new int[0];
        helper(t, low, high, list);
      
        int[] res = new int[list.size()];
        int i = 0;
        for (Integer num :list)
        {
        		res[i] = num;
        		i++;
        }
        return res;
    }
    private void helper(TreeNode t, int low, int high, TreeSet<Integer> list)
    {
    		if (t.left == null && t.right == null)
    			if ( low <=t.info && t.info <= high)
    				list.add(t.info);
    		if(low <= t.info && t.info <= high)
    			list.add(t.info);
    		if (t.left != null)
    			helper(t.left, low,  high, list);
    		if (t.right != null)
    			helper(t.right,low, high ,list);
    }
}
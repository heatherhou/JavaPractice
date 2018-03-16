public class TreeCount {

	public int count(TreeNode tree) {
		if (tree == null)
			return 0;
	    // replace with working code
		if(tree.left == null && tree.right == null)
			return 1;
		else if (tree.left != null && tree.right == null)
			return count(tree.left)+1;
		else if (tree.right != null && tree.left == null)
			return count(tree.right)+1;
		else 
			return count(tree.left) + count(tree.right) + 1;
	}
}
//	private int countL(TreeNode tree)
//	{ 
//		if (tree.left == null)
//			return 1;
//		else 
//			return countL(tree.left);
//	}
//	
//	private int countR(TreeNode tree)
//	{
//		if (tree.right == null)
//			return 1;
//		else 
//			return countR(tree.right) + 1
//	}
//
// class TreeNode {
//    int info;
//    TreeNode left;
//    TreeNode right;
//    TreeNode(int x){
//        info = x;
//    }
//    TreeNode(int x, TreeNode lNode, TreeNode rNode){
//        info = x;
// 	  left = lNode;
//        right = rNode;
//    }


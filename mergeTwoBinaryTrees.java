package leetcode;

/*
* A typical preorder travesal
*/
public class mergeTwoBinaryTrees {
  
  public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
    int val;
    
    if (t1 == null && t2 == null) { return null; }
    if (t1 == null) { return t2; }
    if (t2 == null) { return t1; }
    
    TreeNode root = new TreeNode(0);
    
    root.val = ((t1 ==null) ? 0 : t1.val) + ((t2 == null) ? 0 : t2.val);
    root.left = mergeTrees(t1.left, t2.left);
    root.right = mergeTrees(t1.right, t2.right);
    
    return root;
}
}
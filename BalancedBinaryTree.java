package leetcode;

// No.110
public class BalancedBinaryTree {

class Solution {
  public boolean isBalanced(TreeNode root) {
      return _isBalanced(root) != -1;
  }
  
  private int _isBalanced(TreeNode root) {
      if (root == null) {return 0;}
      int lvalue = _isBalanced(root.left);
      int rvalue = _isBalanced(root.right);
      
      if (lvalue == -1 || rvalue == -1) {
          return -1;
      }
      
      if (Math.abs(lvalue - rvalue) <= 1) {
          return Math.max(lvalue, rvalue) + 1;
      }
      
      return -1;
  }
}
}
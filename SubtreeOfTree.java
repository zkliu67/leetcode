package leetcode;

public class SubtreeOfTree {
  class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null || t == null) {
            return s == null && t == null;
        }
        if (s.val == t.val && isAllSame(s, t)) {
            return true;
        }
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }
    
    private boolean isAllSame(TreeNode s, TreeNode t) {
        if (s == null || t == null) {
            return s == null && t == null;
        }
        if (s.val == t.val) {
            return isAllSame(s.left, t.left) && isAllSame(s.right, t.right);
        }
        return false;
    }
    
    
}
}
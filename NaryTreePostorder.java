import java.util.ArrayList;
import java.util.List;

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};


class Solution {
  public List<Integer> postorder(Node root) {
      List<Integer> lst = new ArrayList<Integer>();
      return _postorder(root, lst);
  }
  
  private List<Integer> _postorder(Node node, List<Integer> lst) {
      if (node != null) {
          for (Node child : node.children) {
              lst = _postorder(child, lst);
          }
          lst.add(node.val);
      }
      return lst;
  }
}
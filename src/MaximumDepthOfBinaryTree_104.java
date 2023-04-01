import javax.swing.tree.TreeNode;

public class MaximumDepthOfBinaryTree_104 {
    /**
     * Definition for a binary tree node.
     * */
     public class TreeNode {
         int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

        public int maxDepth(TreeNode root) {
            // Base Condition
            if (root == null) {
                return 0;
            }
            // Induction Step
            else {
                int left = 1 + maxDepth(root.left);     // add 1 as it is moving forward
                int right = 1 + maxDepth(root.right);   // add 1 as it is moving forward
                return Math.max(left, right);
            }
        }
}

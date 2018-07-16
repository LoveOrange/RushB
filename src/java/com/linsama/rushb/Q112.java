package com.linsama.rushb;

import java.util.Stack;

public class Q112 {
    private static boolean flag = false;

    public boolean hasPathSum(TreeNode root, int sum) {
        if (null == root) {
            return false;
        }
        Stack<TreeNode> bfs = new Stack<>();
        bfs.push(root);
        TreeNode cur = null;
        while(!bfs.isEmpty()) {
            cur = bfs.pop();
            if (cur.left != null) {
                bfs.push(cur.left);
                cur.left.val += cur.val;
            }
            if (cur.right != null) {
                bfs.push(cur.right);
                cur.right.val += cur.val;
            }
            if (cur.right == null && cur.left == null) {
                if (cur.val == sum) {
                    return true;
                }
            }
        }
        return false;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}

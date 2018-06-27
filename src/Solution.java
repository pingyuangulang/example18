
/**
 * @author JiBin
 * @date 2018/6/28 0:50
 */
public class Solution {
    
    public static void main(String[] args) {
        
    }
    
    /**
     * 判断一棵二叉树是否是平衡二叉树
     * @param root 二叉树根节点
     * @return true表示是，false表示否
     */
    public boolean isBalanced_Solution(TreeNode root) {
        if (root == null)
            return true;
        int leftDepth = treeDepth(root.left);
        int rightDepth = treeDepth(root.right);
        int result = Math.abs(leftDepth-rightDepth);
        return result<=1&&isBalanced_Solution(root.left)&&isBalanced_Solution(root.right);
    }
    
    /**
     * 求二叉树的高度
     * @param node 所求高度二叉树的根节点
     * @return 二叉树的高度
     */
    public int treeDepth(TreeNode node){
        if(node==null)
            return 0;
        else
            return 1+(treeDepth(node.left)>=treeDepth(node.right)?treeDepth(node.left):treeDepth(node.right));
    }
}

/**
 * 二叉树
 */
class TreeNode{
    private int data;
    public TreeNode left;
    public TreeNode right;
    
    public int getData() {
        return data;
    }
    
    public void setData(int data) {
        this.data = data;
    }
}

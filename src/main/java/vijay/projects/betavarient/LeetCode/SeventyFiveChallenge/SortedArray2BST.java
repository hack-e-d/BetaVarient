package vijay.projects.betavarient.LeetCode.SeventyFiveChallenge;

public class SortedArray2BST {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0) return null;
        if(nums.length == 1) return new TreeNode(nums[0]);
        return convertToBST(nums, 0 , nums.length - 1);
    }

    public TreeNode convertToBST(int[] nums, int left, int right) {
        if( left > right) return null;

        int mid = left + (right - left)/2;

        TreeNode node = new TreeNode(nums[mid]);
        node.left = convertToBST(nums, left, mid - 1);
        node.right = convertToBST(nums, mid + 1, right);

        return node;
    }

    public static void main(String[] args) {
        SortedArray2BST sortedArray2BST = new SortedArray2BST();
        TreeNode node = sortedArray2BST.sortedArrayToBST(new int[]{-10,-3,0,5,9});
        System.out.println(node);
    }
}

package testinterview.datastructures.hashmaps;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class ProblemBSR {
	
	public static void main(String[] args)
	{
		
		TreeNode node = new TreeNode(3);
		TreeNode node9 = new TreeNode(9);
//		TreeNode node20 = new TreeNode(20);
//		TreeNode node15 = new TreeNode(15);
//		TreeNode node7 = new TreeNode(7);
		
		node.right = node9;
/*		node.right = node20;
		node20.left= node15;
		node20.right = node7;*/
		System.out.println(minDepth(node));
				
	}
	
	
    public static int minDepth(TreeNode root) {
        int result= 0;
        int depth =0;
        if(root == null)
        {
        	return 0;
        }
        return recursion(root,result,depth);
        
        
    }
        
   public static int recursion(TreeNode node, int result, int depth)
    {
        depth++;
        result = depth>	result?depth :result;

        if(node.left== null && node.right ==null)
        {
        	 return result;
        }
        else{
        	
        
	        if(node.left!=null)
	        {
	            return recursion(node.left,result,depth);
	        }
	        else{
	       
		        if(node.right != null)
		        {
		            return recursion(node.right,result,depth);
		        }
		        else
		        {
		        	return result--;
		        }
	        }
        }
       
        
    }
}
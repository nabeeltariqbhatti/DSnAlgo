 boolean existIn(Node node, int n1){
        if(node == null) return false;
        if(node.data==n1) return true;
        return existIn(node.left,n1) || existIn(node.right,n1);
        
        
    }
    //Function to return the lowest common ancestor in a Binary Tree.
	Node lca(Node root, int n1,int n2)
	{
	  if(root==null || root.data==n1 || root.data==n2){
	      return root;
	  }
	  
	  
	 boolean n1OnLeft = existIn(root.left,n1);
	 boolean n2OnLeft = existIn(root.left,n2);
	 if(n1OnLeft != n2OnLeft){
	     return root;
	 }
	 
	 
	  return  n1OnLeft ? lca(root.left, n1,n2) : lca(root.right,n1,n2);
	}

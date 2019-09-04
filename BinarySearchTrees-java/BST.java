// Alexander Gonzales
// CS 272 - Intro to Data Structures
// 4/9/2019
// Lab 11


class BSTNode{
	private int data;   //the element value for this node
	private BST left;	//the left child of this node
	private BST right;	//the right child of this node
	
	/**
	 * No-argument constructor
	 */
	public BSTNode(){}
	
	/**
	 * Constructor with the initial element
	 * @param initData: the initial element
	 */
	public BSTNode(int initData){
		data = initData; 
		left = new BST();
		right = new BST();
	}
	
	/**
	 * Constructor with the initial element, initial left and right children
	 * @param initData: the initial element
	 * @param initParent: the initial parent tree
	 * @param initLeft: left child
	 * @param initRight: right child
	 */
	public BSTNode(int initData, BST initLeft, BST initRight){
		data = initData;
		left = initLeft;
		right = initRight;
	}

	/**
	 * Evaluate whether this node is a leaf node or not
	 * @return true if it is a leaf node; otherwise, return false.
	 */
	public boolean isLeaf()
	{
		return (((left==null)||(left!=null && left.root==null))
				&&((right==null)||(right!=null && right.root==null)));
	}
	
	
	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}

	/**
	 * @param set the element in this node
	 */
	public void setData(int data) {
		this.data = data;
	}

	/**
	 * @return the left child
	 */
	public BST getLeft() {
		return left;
	}

	/**
	 * @param the left child to be set
	 */
	public void setLeft(BST left) {
		this.left = left;
	}

	/**
	 * @return the right child
	 */
	public BST getRight() {
		return right;
	}

	/**
	 * @param the right child to be set
	 */
	public void setRight(BST right) {
		this.right = right;
	}
	

   
   
   /**
    * searches tree for given integer using iteration
    * @param e
    * integer to search for
    * @ret
    * boolean true if found, false if not found
   */
   /*
   public BSTNode searchNonRecursion(int e) {
   for(BST cursorLeft = 
   */
   
   
   
   
   /**
    * return the sum of all elements in the tree
    * @return
    * The sum of the elements in the tree
   */
   
   public int sum() {
    return 1;
    }  
	
	/**
	 * Convert this BTNode to a string
	 */
	public String toString()
	{
		String str="";
		
		if((left==null)||(left!=null && left.root==null)) str +="(null)";
		else str +="("+left.root.getData()+")";
		
		str += data;
		
		if((right==null)||(right!=null&&right.root==null)) str +="(null)";
		else str +="("+right.root.getData()+")";
		
		return str;
	}
}

/**
 * The class for Binary Search Tree
 * @author Huiping Cao
 *
 */
public class BST {
	protected BSTNode root; //the tree root
   
	/**
	 * Get the left subtree of this tree
	 * @return the left subtree of this tree
	 */
	private BST getLeftSubtree(){
		return root.getLeft();
	}
	
	/**
	 * Get the right subtree of this tree
	 * @return the right subtree of this tree
	 */
	private BST getRightSubtree(){
		return root.getRight();
	}
   
   /**
   * private method to get root
   * @return root
   */
   private BSTNode getRoot() {
      return root;
   }
   
   /**
   * private method to set root
   * @param root
   */
   private void setRoot(BSTNode _root) {
      root = _root;
   }
   
   /**
   * inserts an integer into the tree at the appropriate node
   * @param e
   * the integer to insert
   * @return
   * boolean true if the integer has been inserted, false if integer already present
   */
   public boolean insert(int e) {
      if(this.getRoot() == null) {
         root = new BSTNode(e, new BST(), new BST());
      }// end if
      else if(e < root.getData()) root.getLeft().insert(e);
      else if(e > root.getData()) root.getRight().insert(e);
      return false;   // if e == root.getData()
   }// end insert
	

   public boolean remove(int e) {
      boolean found = false;
      if(root == null) return found;
      if(e > root.getData()) this.getRightSubtree().remove(e);
      if(e < root.getData()) this.getLeftSubtree().remove(e);
      if(e == root.getData()) {
         found = true;
         if(this.root.getLeft() == null && this.root.getRight() == null) {
            this.setRoot(null);
         } else if(this.root.getLeft() != null && this.root.getRight() == null) {
            this.setRoot(this.root.getLeft().getRoot());
         } else if(this.root.getRight() == null && this.root.getRight() != null) {
            this.setRoot(this.root.getRight().getRoot());
         } else {
            int temp = this.findMax().getRoot().getData();
            
            this.root.setData(temp);
         }// else-if
     }//
     return found;
   }// end remove
   
   /**
   * private method to find node with maximum value by transversing the right subtrees (actually returns second largest
   * @param max
   * The current max
   * @return max
   * The maximum node
   */
   private BST findMax() {
      return findMax(this);
   }// end findMax
   
   private BST findMax(BST max) {
      if(root == null) return max;
      else {
         max = this;
         return this.getRightSubtree().findMax(max);
      }
   }
   
   
   /**
    * searches tree for given integer using recursion
    * @param e
    * integer to search for
    * @ret
    * boolean true if found, false if not found
   */
   public BSTNode searchRecursion(int e) {
         BSTNode found = null;
         if(root == null) return found;
         if(root.getData() == e) found = root;
         if(root.getData() < e) found = root.getLeft().searchRecursion(e);
         if(root.getData() > e) found = root.getRight().searchRecursion(e);
         return found;
   }// end searchRecursion
   
   /*
   searchRecursion complexity...
   */
   
   /**
   * Public method to call private sum
   * @return sum
   */
   public int sum() {
      return sum(0);
   }
   
   /**
   * Private Method to find the sum of all elements in a tree
   * @return
   * the sum of all elements in a tree
   */
   private int sum(int _sum) {
      if(root == null) return 0;
      _sum = root.getData();        // add current node to running sum
      _sum += root.getLeft().sum();  // add left subtree sum to running sum
      _sum += root.getRight().sum(); // add right subtree sum to running sum
      return _sum;                   // return sum
   }// end sum 
   
   /**
	 * Print the tree using in-order traversal strategy
	 */
   public void inOrderPrt(){
		inOrderPrt(0);
	}// end inOrderPrt
	
	/**
	 * private, recursive function
	 *     I slightly changed the method to print right subtree first
	 *     It is to make the display more easier to read
	 * 
	 * @param node
	 * @param indentation
	 * @param branch
	 */
	private void inOrderPrt(int indentation){
		if(root!=null){
			if(getRightSubtree()!=null) getRightSubtree().inOrderPrt(indentation+1);
			
			for(int i=0;i<indentation*4;i++) System.out.print(" ");
			
			System.out.println(root.getData());
			
			if(getLeftSubtree()!=null) getLeftSubtree().inOrderPrt(indentation+1);
		}
	}
	
	/**
	 * Debug function, print the tree for debugging purpose
	 */
	public String toString()
	{
		if(root!=null) return root.toString();
		else return null;
	}
	
	///////////////////////////////////////
    ///////////////////////////////////////
	// Please add the functions required for your lab homework here.
	/**
	 * Test cases provided by the instructor
	 * @throws Exception
	 */
}                
package binaryTrees;

import java.util.Scanner;

public class BinaryTreeUse {
	
	//1
	static void printTree(BinaryTreeNode<Integer> root)
	{	
		//OPTION 1:-
		/*if(root==null)
			return;
		System.out.println(root.data);
		printTree(root.left);
		printTree(root.right);*/
		
		//OPTION 2:-
		if(root==null)
			return;
		System.out.print(root.data+":");
		if(root.left!=null)
			System.out.print(" L"+root.left.data);
		if(root.right!=null)
			System.out.print(" R"+root.right.data);
		System.out.println();
		printTree(root.left);
		printTree(root.right);
	}
	
//2	
	static BinaryTreeNode<Integer>  takeInput(boolean isRoot,int root,boolean isLeft)
	{
		/*Scanner scn = new Scanner(System.in);
		System.out.println("Enter the value");
		int n=scn.nextInt();
		if(n==-1)
			return null;
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(n);
		BinaryTreeNode<Integer> left=takeInput();
		BinaryTreeNode<Integer> right=takeInput();
		root.left=left;
		root.right=right;
		return root;*/
		
		
		Scanner scn = new Scanner(System.in);
		if(isRoot)
		{
			System.out.println("Enter the root value");
		}
		else
			if(isLeft)
			{
				System.out.println("Enter the left value of "+root);
			}
			else
				System.out.println("Enter the right value for "+root);
		int n=scn.nextInt()	;
		if(n==-1)
			return null;
		BinaryTreeNode<Integer> root1= new BinaryTreeNode<Integer>(n);
		BinaryTreeNode<Integer> s1=takeInput(false, root1.data,true);
		BinaryTreeNode<Integer> s2=takeInput(false, root1.data,false);
		root1.left=s1;
		root1.right=s2;
		return root1;
	}
	
//3	
	static int numberOfNodes(BinaryTreeNode<Integer> root)
	{
		if(root==null)
			return 0;
		int sa1=numberOfNodes(root.left);
		int sa2=numberOfNodes(root.right);
		return(sa1+sa2+1);
	}
	
//4	
	static int sumOfNodes(BinaryTreeNode<Integer> root)
	{
		if(root==null)
			return 0;
		int s1=sumOfNodes(root.left);
		int s2=sumOfNodes(root.right);
		return (root.data+s1+s2);
	}
	
//5	
	static void printPreOrder(BinaryTreeNode<Integer> root)
	{
		if(root==null)
			return;
		System.out.println(root.data);
		printPreOrder(root.left);
		printPreOrder(root.right);
	}
	
//6	
	static void printPostOrder(BinaryTreeNode<Integer> root)
	{	
		if(root==null)
			return ;
		printPostOrder(root.left);
		printPostOrder(root.right);
		System.out.println(root.data);
	}
	
//7	
	static void printInOrder(BinaryTreeNode<Integer> root)
	{
		if(root==null)
			return ;
		printInOrder(root.left);
		System.out.println(root.data);
		printInOrder(root.right);
	}
	
//8	
	static int largestDataNode(BinaryTreeNode<Integer> root)
	{
		int large=0;
		if(root ==null)
			return large;
		int s1=largestDataNode(root.left);
		int s2=largestDataNode(root.right);
		large=(s1>s2?s1:s2);
		if(large>root.data)
			return large;
		return root.data;
	}
	
//9 
	static int greaterThanX(BinaryTreeNode<Integer> root,int X)		//return number of nodes with data value greater than X; 
	{	
		if(root==null)
			return 0;
		int s1=greaterThanX(root.left, X);
		int s2=greaterThanX(root.right, X);
		if(root.data>X)
			return(s1+s2+1);
		else
			return (s1+s2);
	}
	
//10
	static int heightOfTree(BinaryTreeNode<Integer> root)				// total no of nodes along longest path to any leaf node
	{
		if(root==null)
			return 0;
		int s1=heightOfTree(root.left);
		int s2=heightOfTree(root.right);
		if(s1>s2)											//to find max height
			return s1+1;
		return s2+1;
	}
	
//11
	static int leafNodes(BinaryTreeNode<Integer> root)				//find number of leaves of given tree
	{
		/*if(root==null)
			return 0;
		int s1=leafNodes(root.left);
		int s2=leafNodes(root.right);
		if(root.left==null&&root.right==null)
			return (s1+s2+1);
		else
			return (s1+s2);*/
		
				/*OR*/
		if(root==null)
			return 0;
		if(root.left==null&&root.right==null)
			return 1;
		else
			return(leafNodes(root.left)+leafNodes(root.right)); 
					
	}
	
	
//12	
	static void printAtDepthK(BinaryTreeNode<Integer> root, int k)
	{
		if(root==null)
			return;
		if(k==1) {
			System.out.println(root.data);
			return;}
		printAtDepthK(root.left, k-1);//Do not do k--!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		printAtDepthK(root.right, k-1);
	}
	
//13	
	static void replaceByDepth(BinaryTreeNode<Integer> root)		//replace each node element by its depth
	{
		replacehelper(root,0);
	}
	static void replacehelper(BinaryTreeNode<Integer> root,int level)
	{
		if(root==null)
			return;
		replacehelper(root.left, level+1);
		replacehelper(root.right, level+1);
		root.data=level;
	}
//14
	static boolean isPresent(BinaryTreeNode<Integer> root,int x)			//to check if node with given data exists
	{
		if(root==null)
			return false;	//It cant be true..as if it will be true our ans will always be true....
		boolean sa1=isPresent(root.left,x);
		boolean sa2=isPresent(root.right,x);
		if(root.data==x)
			return true;
		else
			return(sa1||sa2);
	}
	
//15
	static void printLeaf(BinaryTreeNode<Integer>root)		//print all leaf nodes
	{
		if(root==null)
			return;
		if(root.left==null&&root.right==null)
			{
				System.out.println(root.data);
				return;
			}
		else
		{
			printLeaf(root.left);
			printLeaf(root.right);
		}
			
	}
	public static void main(String[] args) {
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
//		BinaryTreeNode<Integer> left = new BinaryTreeNode<>(2);
//		BinaryTreeNode<Integer> right = new BinaryTreeNode<>(3);
//		root.left=left;
//		root.right=right;
//		BinaryTreeNode<Integer> left_Right = new BinaryTreeNode<>(4);
//		BinaryTreeNode<Integer> right_Left = new BinaryTreeNode<>(5);
//		left.right=left_Right;
//		right.left=right_Left;
		
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
		BinaryTreeNode<Integer> left = new BinaryTreeNode<>(2);
		BinaryTreeNode<Integer> right = new BinaryTreeNode<>(3);
		root.left=left;
		root.right=right;
		BinaryTreeNode<Integer> left_left= new BinaryTreeNode<>(4);
		BinaryTreeNode<Integer> left_right = new BinaryTreeNode<>(5);
		left.left=left_left;
		left.right=left_right;
		
		
		
//		BinaryTreeNode<Integer> root=takeInput(true,0,true);
		
//		printTree(root);
		
//		printPreOrder(root);
		
//		printPostOrder(root);
		
//		printInOrder(root);
		
//		System.out.println(largestDataNode(root));
		
//		System.out.println(numberNodes(root));
		
//		System.out.println(greaterThanX(root, 3));
		
//		System.out.println(heightOfTree(root));
		
//		System.out.println(leafNodes(root));
		
//		printAtDepthK(root, 3);
		
//		System.out.println(isPresent(root, 10));
		
//		nodesWithoutSiblings(root);
		
//		replaceByDepth(root);
		
		
		printTree(root);
	}
}

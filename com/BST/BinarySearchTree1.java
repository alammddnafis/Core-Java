package com.BST;

public class BinarySearchTree1 {
		Node root;
		int count=0;
		boolean flag;
		
		public boolean add(int key)
		{
			flag=true;
			root=add(root,key);
			return flag;
		}
		
		public Node add(Node n,int key)
		{
			if(n==null)
			{
				n=new Node(key);
				count++;
				return n;
			}
			
			if(key<n.key)
			{
				n.left=add(n.left,key);
			}
			else if(key>n.key)
			{
				n.right=add(n.right,key);
			}
			else
				flag=false;
			
		return n;
		}
		
		public int size()
		{
			return count;
		}
		
		public void PreOrder()
		{
			PreOrder(root);
		}
		
		public void PreOrder(Node n)
		{
			if(n==null)
				return;
			System.out.print(n.key+" ");
			PreOrder(n.left);
			PreOrder(n.right);
			
		}
		
		public void PostOrder()
		{
			PostOrder(root);
		}
		
		public void PostOrder(Node n)
		{
			if(n==null)
				return;
			PostOrder(n.left);
			PostOrder(n.right);
			System.out.print(n.key+" ");
		}
		
		public void InOrder()
		{
			InOrder(root);
		}
		
		public void InOrder(Node n)
		{
			if(n==null)
				return;
			InOrder(n.left);
			System.out.print(n.key+" ");
			InOrder(n.right);
		}
}

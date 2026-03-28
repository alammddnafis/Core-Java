package com.BST;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinarySerchTree {
		Node root;
		int count=0;
		Boolean flag;
		
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
				n.left=add(n.left,key);
			else if(key>n.key)
				n.right=add(n.right,key);
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
		
		public void PostOrder()
		{
			PostOrder(root);
		}
		
		public void InOrder()
		{
			InOrder(root);
		}
		public void PreOrder(Node n)
		{
			if(n==null)
				return;
			System.out.print(n.key+" ");
			PreOrder(n.left);
			PreOrder(n.right);
		}
		
		public void PostOrder(Node n)
		{
			if(n==null)
				return;
			PostOrder(n.left);
			PostOrder(n.right);
			System.out.print(n.key+" ");
		}
		
		public void InOrder(Node n)
		{
			if(n==null)
				return;
			InOrder(n.left);
			System.out.print(n.key+" ");
			InOrder(n.right);
		}
		
		public void remove(int key)
		{
			root=remove(root,key);
		}
		
		public Node remove(Node n,int key)
		{
			if(n==null)
				return null;
			if(key<n.key)
				n.left=remove(n.left,key);
			else if(key>n.key)
				n.right=remove(n.right,key);
			else
			{
				if(n.left==null)
				{
					count--;
					return n.right;
					
				}
				else if(n.right==null)
				{
					count--;
					return n.left;
				}
				else
				{
					n.key=minEle(n.right);
					n.right=remove(n.right,n.key);
				}
			}
			return n;
			
		}
		
		public int minEle(Node n)
		{
			int min=n.key;
			while(n.left!=null)
			{
				min=n.left.key;
				n=n.left;
			}
			return min;
		}
		
		public void levelOrder()
		{
			Queue<Node> q = new ArrayDeque<Node>();
			q.add(root);
			while(!q.isEmpty())
			{
				Node n=q.poll();
				System.out.print(n.key+" ");
				if(n.left!=null)
					q.add(n.left);
				if(n.right!=null)
					q.add(n.right);
			}
			
		}
		
}

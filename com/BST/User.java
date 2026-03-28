package com.BST;

public class User {
	public static void main(String[] args)
	{
		BinarySerchTree b=new BinarySerchTree();
		b.add(50);
		b.add(30);
		b.add(10);
		b.add(40);
		b.add(70);
		b.add(60);
		b.add(90);
		
//		System.out.println(b.size());
//		b.PreOrder();
//		System.out.println();
//		b.PostOrder();
//		System.out.println();
//		b.InOrder();
//		
//		b.remove(90);
//		System.out.println();
//		b.InOrder();
		b.levelOrder();
		
	}
}

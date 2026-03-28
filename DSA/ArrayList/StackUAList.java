package DSA.ArrayList;

import java.util.EmptyStackException;

public class StackUAList {
	Object[] o=new Object[10];
	int count=0;
	public void push(Object ele)
	{   
		if(count>=o.length)
			increase();
		o[count++]=ele;
	}
	
	public void increase()
	{
		Object[] a=new Object[o.length+5];
		for(int i=0;i<o.length;i++)
			a[i]=o[i];
		o=a;
	}
	public int size()
	{
		return count;
	}
	
	public boolean isEmpty()
	{
		return count==0;
	}
	
	public Object peek() {
		return o[count-1];
	}
	public Object pop()
	{
		if(isEmpty())
			throw new EmptyStackException();
		Object key=o[count-1];
		count--;
		return key;
	}
}

package DSA.ArrayList;

public class QueueUAlist {
	Object[] o=new Object[10];
	int count=0;
	public void add(Object ele)
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
	
	public Object peek()
	{
		return o[0];
	}
	public Object poll()
	{
		Object key=o[0];
		Object[] temp=new Object[o.length];
		for(int i=0;i<count;i++)
			temp[i]=o[i+1];
		o=temp;
		count--;
		return key;
	}
}

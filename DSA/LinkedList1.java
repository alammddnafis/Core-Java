package DSA;

public class LinkedList1 {
	Node head;
	int count=0;
	public void add(Object ele)
	{
		Node n=new Node(ele);
		if(head==null)
		{
			head=n;
			count++;
			return;
		}
		
		Node curr=head;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=n;
		count++;
	}
	
	public void display()
	{
		Node curr=head;
		for(int i=0;i<count;i++)
		{
			System.out.println(curr.ele);
			curr=curr.next;
		}
	}
	
	public int size()
	{
		return count;
	}
	
	public void addFirst(Object ele)
	{
		Node n=new Node(ele);
		Node curr=head;
		head=n;
		head.next=curr;
	}
	public void addIndex(Object ele,int index)
	{
		if(index<0 || index>size())
			throw new IndexOutOfBoundsException();
		if(index==0)
		{
			addFirst(ele);
			count++;
			return;
		}
		Node n=new Node(ele);
		Node curr=head;
		for(int i=1;i<index;i++)
			curr=curr.next;
		n.next=curr.next;
		curr.next=n;
		count++;
	}
	
	public void removeFirst()
	{
		head=head.next;
	}
	public void remove(int index)
	{
		if(index==0)
		{
			removeFirst();
			count--;
			return;
		}
		Node curr=head;
		for(int i=1;i<index;i++)
			curr=curr.next;
		curr.next=curr.next.next;
		count--;
	}
	
	public boolean contains(Object ele)
	{
		Node curr=head;
		for(int i=0;i<size();i++)
		{
			if(curr.ele==ele)
			{
				return true;
			}
			curr=curr.next;
		}
		return false;
	}
}
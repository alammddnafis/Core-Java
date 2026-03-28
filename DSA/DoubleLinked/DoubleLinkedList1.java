package DSA.DoubleLinked;

public class DoubleLinkedList1 {
		Node head;
		Node tail;
		int count=0;
		
		public void add(Object ele)
		{
			Node n=new Node(ele);
			if(head==null)
			{
				head=n;
				tail=n;
				count++;
				return;
			}
			Node curr=head;
			while(curr.next!=null)
			{
				curr=curr.next;
			}
			n.prev=curr;
			curr.next=n;
			tail=n;
			count++;
			
		}
		
		public int size()
		{
			return count;
		}
		public boolean isEmpty()
		{
			return count==0;
		}
		public void display()
		{
			Node curr=head;
			while(curr!=null)
			{
				System.out.println(curr.ele);
				curr=curr.next;
			}
		}
		
		public void revDisplay()
		{
			Node curr=tail;
			while(curr!=null)
			{
				System.out.println(curr.ele);
			curr=curr.prev;
			}
		}
		
		public boolean contains(Object ele)
		{
			Node curr=head;
			while(curr!=null)
			{
				if(curr.ele.equals(ele))
					return true;
				curr=curr.next;
			}
			return false;
		}
		
		public void addFirst(Object ele)
		{
			Node n=new Node(ele);
			Node curr=head;
			curr.prev=n;
			n.next=curr;
			head=n;
		}
		public void addIndex(Object ele,int index)
		{
			if(index==0)
			{
				addFirst(ele);
				count++;
				return;
			}
			if(index==size())
			{
				addLast(ele,index);
				count++;
				return;
			}
			
			Node n=new Node(ele);
			Node curr=head;
			for(int i=1;i<index;i++)
			{
				curr=curr.next;
			}
			n.next=curr.next;
			n.prev=curr;
			curr.next.prev=n;
			curr.next=n;
			count++;
			
		}
		
		public void addLast(Object ele,int index)
		{
			Node n=new Node(ele);
			n.prev=tail;
			tail.next=n;
			tail=n;
		}
}

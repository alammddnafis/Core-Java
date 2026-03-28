package DSA.ArrayList;

public class User {
public static void main(String[] args)
{
	QueueUAlist q=new QueueUAlist();
	q.add(10);
	q.add(20);
	q.add(30);
	System.out.println(q.isEmpty());
	System.out.println(q.size());//4
	System.out.println(q.peek());//10
	System.out.println(q.poll());//10
	System.out.println(q.peek());//20
	System.out.println(q.poll());//20
	System.out.println(q.peek());//30
	System.out.println(q.poll());//30
	System.out.println(q.isEmpty());
	
}
}

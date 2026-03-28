package DSA.DoubleLinked;

public class User {

	public static void main(String[] args) {
			DoubleLinkedList1 d=new DoubleLinkedList1();
			d.add(10);
			d.add(20);
			d.add(30);
			d.add(40);
			d.add(50);
			System.out.println(d.size());
//			d.display();
			System.out.println("--------------------------");
//			d.revDisplay();
//			d.remove(4);
			d.addIndex(25, 4);
			System.out.println("--------------------------");
			d.display();
//			System.out.println("--------------------------");
//			System.out.println(d.contains(60));
//			System.out.println("--------------------------");
//			System.out.println(d.isEmpty());
	}

}

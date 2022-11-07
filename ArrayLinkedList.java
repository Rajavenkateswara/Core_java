package Day_9;

import java.util.LinkedList;

public class ArrayLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList<String> mylist=new LinkedList<>();
        mylist.add("list1 contains variables");
        mylist.add("venkateswarlu");
        mylist.add("margo");
        mylist.add("Santoor");
        mylist.add("goverdhan");
        mylist.add("Srikanth");
        mylist.add("Gopi");
        mylist.add("rami");
        mylist.add("rami");
        System.out.println(mylist);
        mylist.addFirst("karravula");
        mylist.addLast("raja");
        System.out.println(mylist);
        mylist.removeFirst();
        System.out.println(mylist);
        
	}

}

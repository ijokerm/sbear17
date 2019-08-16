class Node{
	int val;
	Node next;
	Node(int val){
		this.val=val;		
	}
}

public class Text4{	
	public static Node reverse(Node head){
	Node result=null;
	Node cur=head;
	while(cur!=null){
		Node next=cur.next;//记录原结点
		
		cur.next=result;
		result=cur;
		//cur 指向原来的结点cur=cur.next;
		 
		cur=next;
	}
	return result;
	}

public static void displayList(Node head){
	for(Node cur=head;cur!=null;cur=cur.next){
		System.out.printf("(%d)-->",cur.val);
	}
	System.out.println("null");
}	
public static void main(String[] args){
	Node n1=new Node(1);
	Node n2=new Node(2);
	Node n4=new Node(4);
	n1.next=n2;n2.next=n4;
	Node result=reverse(n1);
	
	displayList(result);
	
	}
  
}

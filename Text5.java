class Node{
	Node next;
	int val;
	Node(int val){this.val=val;}
}

public class Text5{
	public static Node mergeTwo(Node head1,Node head2){
		if(head1==null){return head2;}
		if(head2==null){return head1;}
		Node c1=head1;
		Node c2=head2;
		Node last=null;
		Node result=null;
		while(head1!=null&&head2!=null){
			if(head1.val<=head2.val){
				if(result==null){
					c1.next=result;
					result=c1;
				}else{
					last.next=c1;
				}
				last=c1;
				c1=c1.next;
			}else{
				if(result==null){
					c2.next=result;
					result=c2;
				}else{
					last.next=c2;
				}
				last=c2;
				c2=c2.next;
			}
		}
			if(c1!=null){
				last.next=c1;
			}else{
				last.next=c2;
			}
		return result;
	}
		
		
		
	public static Node createL1(){
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(2);
		Node n4=new Node(3);
		n1.next=n2;n2.next=n3;n3.next=n4;
		return n1;
	}
	public static Node createL2(){
		Node n1=new Node(5);
		Node n2=new Node(6);
		Node n3=new Node(6);
		Node n4=new Node(8);
		n1.next=n2;n2.next=n3;n3.next=n4;
		return n1;
	}
	public static void display(Node head){
		for(Node cur=head;cur!=null;cur=cur.next){
			System.out.printf("(%d)-->",cur.val);
		}
	}
	public static void main(String[] args){
		Node l1=createL1();
		Node l2=createL2();
		display(l1);
		display(l2);
	}
}
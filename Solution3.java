
	class Node{
		int val;
		Node next;
		Node(int val){
			this.val=val;
		}
	}
	public class Solution3{
	public static Node pushFront(Node head,int val){
			Node node=new Node(val);
			node.next=head;
			/*head=node;*/
			
			return node;			
		}
	public  Node popBack(Node head){
			if(head==null){
				return null;
			}
			if(head.next==null){
				return null;
		    }			
			Node cur=head;
			while(cur.next.next!=null){
				cur=cur.next;
			}
			cur.next=null;
		
		    return head;
	}

	public static void display(Node head){
		for(Node cur=head;cur!=null;cur=cur.next){
			System.out.printf("(%d)-->",cur.val);
		}
		System.out.println("null");
	}	
	public static Node reverseList(Node head){
		Node result=null;
		Node cur=head;
		while(cur!=null){
			Node next=cur.next;
			cur.next=result;
			result=cur;		   
            cur=next;			
		}
return result;
	}
	public Node FindK(Node head,int k){
		Node cur=head;
		int len=0;
		while(cur!=null){
			cur=cur.next;
		    len++;
		}
		if(len<k){
			return null;
		}
		int n=len-k;
		Node K=head;
		for(int i=0;i<n;i++){
			K=K.next;
		}
		return K;	
	}
	public static Node mergeTwo(Node l1,Node l2){ 
		if(l1!=null){return l2;}
		if(l2!=null){return l1;}
		Node cur1=l1;
		Node cur2=l2;
		Node result=null;
		Node last=null;
		while(cur1!=null&&cur2!=null){
			if(cur1.val<=cur2.val){
				if(result==null){
					result=cur1;
				}
				else{
					last.next=cur1;
				}
				last=cur1;
				cur1=cur1.next;
			}
			else{ 
				
				if(result==null){
					
					result=cur2;
				}
				else{
					last.next=cur2;
				}
				last=cur2;
				cur2=cur2.next;
			}
		}
		if(cur1!=null){
			last.next=cur1;
		}
		else {
			last.next=cur2;
		}
		return result;
	}
	public static Node createL1(){
		Node n1=new Node(6);
		Node n2=new Node(7);
		Node n3=new Node(7);
		Node n4=new Node(8);
		n1.next=n2;n2.next=n3;n3.next=n4;
		return n1;
	}
	public static Node createL2(){
		Node n1=new Node(3);
		Node n2=new Node(4);
		Node n3=new Node(5);
		Node n4=new Node(6);
		n1.next=n2;n2.next=n3;n3.next=n4;
		return n1;
	}
	public static void main(String[] args){
		Node head=null;
		head=pushFront(head,1);
		head=pushFront(head,2);
		head=pushFront(head,3);
		display(head);
		Node result=reverseList(head);
		display(head);
		//
		Node l1=createL1();
		Node l2=createL2();
        Node re=mergeTwo(l1,l2);
        for(Node c=re;c!=null;c=c.next){
			System.out.printf("(%d)-->",c.val);
			
		}

	}
}
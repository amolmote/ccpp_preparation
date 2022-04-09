


class Node{
	Node next;
	int data;
	
	public Node(int data){
		this.data=data;
	}
	
	public Node(int data, Node next){
		this.data=data;
		this.next=next;
	}
}
public class LinkedList{
	Node head,tail;
	int size;
	
	public LinkedList(){
		this.size=0;
	}
	
	public void insertAtHead(int data){
	
		//declare newNode
		Node node=new Node(data);
		node.next=head;
		head=node;
		if(tail==null){
			tail=head;
		}
		size++;
		
		
	}
	
	public void insertAtTail(int data){
			
			Node node = new Node(data);
			
			tail.next=node;
			tail=node;
			if(tail==null){
				insertAtHead(data);
			}
			size++;
			
		
	}
	public void insertAtIndex(int data,int index){
		
		if(index==0){
			
			insertAtHead(data);
			return;
		}
		if(index==size){
			insertAtTail(data);
			return;
		}
		Node temp=head;
		for(int i=1;i<index;i++){
			temp=temp.next;
		}
		//creating empty node
		Node node=new Node(data,temp.next);
		temp.next=node;
		size++;
		
		
	}
	
	public int deleteAtStart(){
		
		int val=head.data;
		head=head.next;
		if(size==0){
			System.out.println("list is empty");
			
		}
		if(head==null){
			tail=null;
		}
		size--;
		return val;
	}
	
	public int deleteAtEnd(){
		if(size<=1){
			deleteAtStart();
		}
		Node secondLast=get(size-2);
		int val=tail.data;
		tail=secondLast;
		tail.next=null;
		size--;
		return val;
		
		
		
	}
	public Node get(int index){
		
		Node node=head;
		for(int i=0;i<index;i++){
			node=node.next;
		}
		return node;
		
	}
	
	public int deleteAtIndex(int index){
	
		if(index==0){
			deleteAtStart();
			
		}
		if(index==size-1){
			deleteAtEnd();
		}
		Node prev=get(index-1);
		int val=prev.next.data;
		prev.next=prev.next.next;
		size--;
		return val;
		
		
	}
	
	public boolean searchNode(int data){
		Node node=head;
		while(node!=null){
			if(node.data==data){
				return true;
			}
			node =node.next;
		}
		return false;
		
	}
	
	//now see the floyd cycle methods everything detecting and breaking
	
	public void makeCycle(int index){
		Node cycleNode=get(index);
		tail.next=cycleNode;
	}
	
	//detect a loop
	
	public boolean detectCycle(){
		Node slow=head;
		Node fast=head;
		
		while(fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast){
				return true;
			}
		}
		return false;
	}
	
	//finding the length of the loop
	public int lengthOfCycle(){
		
		Node slow=head;
		Node fast=head;
		
		while(fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
			
			if(slow==fast){
				int length=0;
				Node temp=slow;
				do{
					temp=temp.next;
					length++;
				}while(temp!=slow);
				return length;
			}
			
		}
		return 0;
		
	}
	
	//this is very importatant method
	public Node loopStartNode(){
		Node slow=head;
		Node fast=head;
		int length=0;
		while(fast!=null && fast.next!=null){
			
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast){
				length=lengthOfCycle();
				break;
			}
			
		}
		if(length==0){
			return null;
		}
		Node first=head;
		Node second=head;
		
		
		while(length>0){
			first=first.next;
			length--;
		}
		while(first!=second){
			//second is at head but first is at loop meet point
			first=first.next;
			second=second.next;
		}
		return first;
	}
	
	public boolean breakTheLoop(Node node){
		Node temp=node;
		do{
			temp=temp.next;
		}while(temp!=node);
		Node prev=temp;
		prev.next=null;
		return true;
	}
	public void display(){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args){
		LinkedList list=new LinkedList();
		
		list.insertAtHead(20);
		list.insertAtHead(10);
		list.insertAtTail(60);
		list.insertAtTail(70);
		list.insertAtTail(80);
		list.insertAtTail(90);
		
		
		
		list.insertAtIndex(30,3);
		
		/*
		
		//deleteAtStart it will delete 10 and make 20 as a head
		System.out.println("delete at start : "+list.deleteAtStart());
		
		//delete  at end it will delete 90 and make 30 as a tail
		System.out.println("delete at end : "+list.deleteAtEnd());
		
		//delete at index 1 it will delete 80
		System.out.println("delete at index 1 : "+list.deleteAtIndex(1));
		
		*/
		System.out.println("node present in list or not :- "+list.searchNode(30));
		
		
		//30 connected to the 90
		
		list.makeCycle(3);
		
		System.out.println("loop present or not :- "+list.detectCycle());
		
		System.out.println("length of the loop :- "+list.lengthOfCycle());
		
		Node node=list.loopStartNode();
		
		System.out.println("length of the loop :- "+list.breakTheLoop(node));
		list.display();
	}
	
}
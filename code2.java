class LL{
 
 Node head;
 
 class Node {
 int data;
 Node next;
 
 Node(int data){
 this.data = data;
 this.next = null;
 }
 }
 
 //add first,
 
 public void addfirst(int data){
 Node newNode = new Node(data);
 if(head == null){
 head = newNode;
 return;
 }
 newNode.next = head;
 head = newNode;
 }
 
 
 
 //print
 
 public void printlist(){
 if(head == null)
 {
 System.out.print("List is Empty");
 return;
 }
 Node currNode = head;
 while(currNode != null){
 System.out.print(currNode.data + "->");
 currNode = currNode.next;
 }
 System.out.println("NULL");
 }
 
 
 public void simplifier(int p){
     Node preNode = head;
     Node currNode = preNode.next;

 while(currNode != null)
 {
     if(currNode.data > p)
     {
      preNode.next = currNode.next;
      currNode = preNode.next;
     continue;
     }
     preNode = currNode;
     currNode = currNode.next;
     if(head.data > p)
     {
         head = head.next;
     }
 }
 }
}
 class code2 {
 public static void main(String args[]){
 LL list = new LL();
  for(int i=1;i<=50;i++)
 {
 list.addfirst(50-i+1);
 }
list.addfirst(50);
 list.printlist();
 list.simplifier(25);
 list.printlist();
 }
}

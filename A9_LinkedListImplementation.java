package A16_Stack;
public class A9_LinkedListImplementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val= val;
            this.next=null;
        }
    }
    public static class Stack{
       Node head= null;
       int size = 0;
       void push(int x){
           Node temp = new Node(x);
           temp.next = head;
           head= temp;
           size++;
       }
       int size(){
           return size;
       }
       int pop(){
           if(head==null){
               System.out.println("Stack is Empty");
               return -1;
           }
           int x = head.val;
           head = head.next;
           size--;
           return x;
       }
       int peek(){
           if(head==null){
               System.out.println("Stack is empty");
               return -1;
           }
           int x= head.val;
           return x;
       }
       boolean isEmpty(){
           if(size!=0) return false;
           else return true;
       }
       void display(){
           displayRec(head);
           System.out.println();
       }
       void displayRec(Node h){
           if(h==null) return;
           displayRec(h.next);
           System.out.print(h.val+" ");
       }

    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(5);
        st.push(10);
        st.push(20);
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.pop());
        st.display();
        System.out.println(st.isEmpty());
    }
}

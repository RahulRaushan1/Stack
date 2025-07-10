package A16_Stack;

public class A8_ArrayAndArrayListImplementation {
    public static class Stack{
        private int[] arr = new int[5];
        private int idx = 0;
        void push(int x){
            if(idx==arr.length){
                System.out.println("Stack is full");
                return;
            }
            arr[idx] = x;
            idx++;
        }
        int pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }
        int peek(){
            if(isEmpty()){
                System.out.println("The Stack is Empty");
                return -1;
            }
            return arr[idx-1];
        }
        void display(){
            for(int i =0;i<= idx-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx==0) return true;
            else return false;
        }

        boolean isFull(){
            if(arr.length== idx){
                return true;}
            return false ;
        }
    }
    public static void main(String[] args) {
      Stack st = new Stack();
      st.push(1);
      st.push(2);
      st.push(3);
      st.push(4);
      System.out.println(st.peek());;
      System.out.println(st.size());;
      st.size();
      st.display();
      System.out.println(st.pop());
      st.display();
      System.out.println(st.isEmpty());
      st.push(5);
      st.push(6);
      System.out.println(st.isFull());
      st.push(16);
    }
}

package A16_Stack;
import java.util.Stack;
public class A7_PrintRecursively {
    public static void displayRecursively(Stack<Integer> st){
       if(st.isEmpty()) return;
       int top = st.pop();
       System.out.print(top+ " ");
       displayRecursively(st);
       st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(5);
        st.push(10);
        st.push(20);
        displayRecursively(st);
    }
}

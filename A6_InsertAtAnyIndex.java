package A16_Stack;
import java.util.Stack;
public class A6_InsertAtAnyIndex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(5);
        st.push(10);
        st.push(20);
        int new_element = 50;
        int pos = 2;
        Stack<Integer> st_temp = new Stack<>();
        while(st.size()>=pos){
            st_temp.push(st.pop());
        }
        st.push(new_element);
        while(!st_temp.isEmpty()){
            st.push(st_temp.pop());
        }
        System.out.println(st);
    }
}

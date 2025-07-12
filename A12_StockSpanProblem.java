// Stack Method
package A16_Stack;
import java.util.Arrays;
import java.util.Stack;
public class A12_StockSpanProblem {
    public static void main(String[] args) {
        int [] price = { 2,24,16,60,70};        // write code here
        int n = price.length;
                int[] arr = new int[n];
                Stack<Integer> st = new Stack<>();
                st.push(0);
                for(int i = 0;i<n;i++){
                    while(!st.isEmpty() && price[i] >=price[st.peek()]) st.pop();
                    if(st.isEmpty())
                        arr[i] = i+1;
                    else
                        arr[i] = i-st.peek();
                    st.push(i);
                }
       printArray(arr);
    }
    static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
}

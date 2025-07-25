// Using Name Approach
package A16_Stack;
import java.util.Arrays;
public class A11_StockSpanProblem {
    public static void main(String[] args) {
        int price[] = {10,4,5,90,120,80};
        int n = price.length;
        int [] S = new int[n];

        calculateSpan(price,n,S);
        printArray(S);
    }
    static void calculateSpan(int[] price,int n,int[] S){
        S[0]= 1;
        for(int i = 1;i<n;i++){
            S[i] = 1;
            for(int j = i-1;j >=0 && (price[i] >= price[j]); j--)
                S[i]++;
        }
    }
    static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
}

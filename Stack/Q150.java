package Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q150 {
    public static int evalRPN(String[] tokens) {

        Stack<Integer> st = new Stack<>();

        for (String token: tokens){
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                int b = st.pop();
                int a = st.pop();
                int result = 0;
                switch (token){
                    case "+":
                        result = a+b;
                        break;
                    case "-":
                        result = a-b;
                        break;
                    case "*":
                        result = a*b;
                        break;
                    case "/":
                        result = a/b;
                        break;
                }
                st.push(result);
            }else{
                st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
//        Input: tokens = ["2","1","+","3","*"]
//        Output: 9

        System.out.println(evalRPN(new String[]{"2","1","+","3","*"}));
    }
}

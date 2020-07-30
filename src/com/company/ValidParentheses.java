package com.company;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String expression){
        Stack<Character> stack = new Stack<>();

        char opening;
        boolean flag = true;
       for(int i = 0; i < expression.length(); i++){
           if(expression.charAt(i) == '{' || expression.charAt(i)== '[' || expression.charAt(i)== '('){
               stack.push(expression.charAt(i));
               System.out.println(stack);
           }
           else if(expression.charAt(i) == '}'){
               opening = stack.pop();
               if(opening != '{'){
                   flag = false;
               }
               System.out.println(stack);
           }
           else if(expression.charAt(i) == ']'){
               opening = stack.pop();
               if(opening != '['){
                   flag = false;
               }
               System.out.println(stack);
           }
           else if(expression.charAt(i) == ')'){
               opening = stack.pop();
               if(opening != '('){
                   flag = false;
               }
               System.out.println(stack);
           }
           else
               continue;
       }
    return flag;

    }
}

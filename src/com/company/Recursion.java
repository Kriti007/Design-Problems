package com.company;

public class Recursion {
    public String revString(String str){
        if(str.isEmpty())
            return str;
        else {
            return revString(str.substring(1))+str.charAt(0);
        }
    }
    public int Fibonacci(int n){
        if(n == 0 || n==1){
            return n;
        }
        else {
            return Fibonacci(n-2)+Fibonacci(n-1);
        }
    }
    public int Factorial(int n){
        if(n == 0 || n==1){
            return 1;
        }
        else {
            return Factorial(n-1)*n;
        }
    }
    public void pattern(int n, int given, boolean flag){
        System.out.println(n+" ");
        if(n == given && flag == true)
            return ;
        if(n <= 0 ){
            flag = true;
             pattern(n+5, given, flag);
        }
        if(n > 0 && flag == true)
            pattern(n+5, given, flag);
            if(n > 0 && flag == false)
                 pattern(n-5, given, flag);
    }
    void printAllKLength(char set[], int k,int n)
    {
        printAllKLengthRec(set, "", n, k);
    }
    public void printAllKLengthRec(char[] s, String prefix, int n ,int k){
        if(k == 0){
            System.out.println(prefix);
            return;
        }
        for(int i = 0; i < n; i++){
            String newPrefix ;
            newPrefix = prefix + s[i];
            System.out.println("the value of i is :"+ i+" " +s[i]);

            System.out.println("prefix : "+prefix);
            System.out.println("printAllKLengthRec called with -- >"+newPrefix+"  "+k);

            printAllKLengthRec(s, newPrefix, n, k-1);

        }
    }
}

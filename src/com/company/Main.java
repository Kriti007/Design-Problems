package com.company;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'breakPalindrome' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String breakPalindrome(String s) {
        // Write your code here
        char[] chars = s.toCharArray();
        String reverse = new StringBuilder(s).reverse().toString();
        boolean flag = false;
        for(char ch: chars){
            if(ch == 'a'){
                flag = true;
                continue;
            }
            else{
                flag = false;
                break;
            }
        }
        if(flag == true)
            return "IMPOSSIBLE";
        System.out.println(s.equalsIgnoreCase(reverse));
        if(s.equalsIgnoreCase(reverse)){
            System.out.println("in if");
            char max = (int)'_';
            for(char ch: chars){
                if((int)ch > max)
                    max = ch;

            }
            System.out.println(max);
            int pos = s.indexOf(max);
            System.out.println(pos);
            chars[pos] = 'a';
            System.out.println(chars);
            return new String(chars);
        }
        else{
            return "IMPOSSIBLE";
        }

    }

}
public class Main {

    public static void main(String[] args) throws IOException {
        String s = "aaaaa";
//        String result = Result.breakPalindrome(s);
//        System.out.println(result);
//        ValidParentheses obj = new ValidParentheses();
//        System.out.println(obj.isValid("[{a+b-d}]"));


//          editDistance obj = new editDistance();
//          obj.eDist("sunday","saturday");


//          traverseGrid obj = new traverseGrid();
//          int [] A = {0,1,3};
//          int [] B = {0,1,2};
//
//
//        System.out.println(obj.coverPoints(A,B));

//        LRU ca = new LRU(4);
//        ca.refer(1);
//        ca.refer(2);
//        ca.refer(3);
//        ca.refer(1);
//        ca.refer(4);
//        ca.refer(5);
//        ca.display();

//        LinkedList list = new LinkedList();
//        list = list.insert(4);
//        list =list.insert(5);
//        list =list.insert(8);
//        list =list.insert(-1);
//        list =list.insert(0);
//        list =list.insert(-19);
//        list.shuffle();

        //Recursion r = new Recursion();
        //System.out.println(r.revString("abcde"));
        //System.out.println(r.Fibonacci(6));
        //System.out.println(r.Factorial(5));
        //r.pattern(16, 16, false);
//        char [] set1 = {'a', 'b', 'c','d'};
////        r.printAllKLength(set1, 3, 4 );
//
//
//
//        int [] A = {0,1,3,2,8,9,7};
//        int target = 9;
        HashAndArrays obj = new HashAndArrays();
//        System.out.println(obj.twoSum(A, target));


        String [] strs = {"leetcode", "leets","lee","le"};
//        //System.out.println(obj.longestCommonPrefix(strs));
//        String str = "abcabb";
//        System.out.println(obj.lengthOfLongestSubstring(str));

//        int [] a = {0,0};
//        int [] b = {0,0};
//        System.out.println(obj.findMedianSortedArrays(a, b));
        //obj.test();
        //System.out.println(obj.longestPalindrome("jgik"));
//        Sorting obj1 = new Sorting();
//
//        int[] array = new int[]{5, 6, 7, 4, 4, 7};
//        obj1.mergeSort(array,0,array.length-1);
//        System.out.println(Arrays.toString(array));
//         int [] result =  obj.threeSum(array, 13);
//         for(int i : result)
//            System.out.println(i);

//        StringPractice strp = new StringPractice();
//        System.out.println(strp.myAtoi("e-e8"));
//
//       MyLinkedList l = new MyLinkedList();
//       l.addAtHead(5);
//        System.out.println(obj.longestPalindrome1("cbba"));
//        int [] arr = new int[]{-1, 0, 3, 2, 5, 7,1};
//        int []result = obj.longestIncreasingSubsequence(arr, arr.length);
//        for(int i = 0; i < result.length; i++)
//            System.out.println(result[i]);
//        System.out.println(obj.numDecodings("01"));
//        String str = "strawberry";
//        System.out.println(str.substring(2));
//
//        System.out.println(str.substring(1,3));

        int[] cost = new int[]{1,7,10};//{5,3,1,7,14};
        int N = 15;
//        System.out.println(obj.coinChange(cost, N));
        int[] winecost = new int[]{2,3,5,1,4};
        int start = 0; int end = winecost.length-1;
//        System.out.println(obj.wines_top_down(winecost, start, end,1));
        int[]jumpcost = {10, 30, 40, 50, 20};
//        System.out.println(obj.frogJump(jumpcost, 4, 3));
        String[][] grid = {{".",".",".","#"},{".","#",".","."},{".",".",".","."}};
//        System.out.println(obj.no_of_paths(grid, grid.length-1, grid[0].length-1));
        int[] scores = new int[]{10,80,90,30};
//        System.out.println(obj.deque(scores, 0, scores.length-1, 0));
        int[] values = new int[]{30,50,60};
        int[] weights = new int[]{3,4,5};
        System.out.println(obj.knapsack(values, weights, 8));


    }
}

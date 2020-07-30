package com.company;

import java.util.ArrayList;

public class editDistance {
    public static void eDist(String s1, String s2){
        int [][] temp = new int[s1.length()+1][s2.length()+1];
        int cost;
        for(int i = 0; i < temp[0].length; i++){
            temp[0][i] = i;
        }
        for(int j = 0; j < temp.length; j++){
            temp[j][0] = j;
        }
        for(int i = 1; i < s1.length(); i++){
            for(int j = 1; j < s2.length(); j++){
                System.out.println("s1 char "+s1.charAt(i-1));
                System.out.println("s2 char "+s2.charAt(j-1));
                if(s1.charAt(i-1) == s2.charAt(j-1))
                   temp[i][j] = temp[i-1][j-1];
                else{
                    temp[i][j] = Math.min(Math.min(temp[i][j-1], temp[i-1][j]), temp[i-1][j-1])+1;
                }
                System.out.println(temp[i][j]);
            }
        }
        System.out.println(temp[s1.length()-1][s2.length()-1]);


    }

}

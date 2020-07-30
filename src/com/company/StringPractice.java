package com.company;

public class StringPractice {
    public int myAtoi(String str) {
        int val = 0;
        int k = 1;
        boolean rev = false;
        int neg_index = 0;
        int val_index = 0;
        System.out.println(Integer.MAX_VALUE);
        //879749237
        //2147483647
        //2075577828
        for (int i = 0; i <= str.length()-1; i++) {
            if (str.charAt(i) == ' ') {
                continue;
            }
            else if(((int) str.charAt(i) < 48 || (int) str.charAt(i) > 57) && ((str.charAt(i) != '-') && (str.charAt(i) != '+')) && val > 0){
                return 0;
            }
            else if ((str.charAt(i) == '-') && rev == false) {
                rev = true;

            }
            if (((int) str.charAt(i) >= 48 && (int) str.charAt(i) <= 57)) {
                if(val > Integer.MAX_VALUE/10 ) {
                    System.out.println("a");
                    val = Integer.MAX_VALUE;
                    if(rev == false)return val;
                    if(rev == true) return -1*(val+1);

                }

                val  =  (val*10)> Integer.MAX_VALUE/10 ? Integer.MAX_VALUE  :  (val*10)+((int) str.charAt(i) - 48);
                System.out.println(val);


                //k = k * 10;
            }
        }

            if(rev)
                val = -1*val;

        System.out.println(val);
        return val;
    }
}

package com.company;
import java.awt.*;
import java.util.*;

public class HashAndArrays {
    //    public int[]  twoSum(int[] arr, int target) {
//        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
//        for (int i = 0; i < arr.length; i++) {
//            m.put(arr[i], i);
//
//        }
//        for(int i = 0; i < arr.length; i++){
//           int new_target = target - arr[i];
//           if(m.containsKey(new_target) && m.get(new_target)!=i){//the complement must not be the number itself
//               return new int[]{i, m.get(new_target)};
//           }
//           else
//               m.put(arr[i],i);
//        }
//        return new int[] {0,0};
//    }
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        return longestCommonPrefix(strs, 0, strs.length - 1);
    }

    private String longestCommonPrefix(String[] strs, int l, int r) {
        if (l == r) {
            System.out.println(strs[l]);
            return strs[l];
        } else {
            int mid = (l + r) / 2;
            System.out.println("left :" + l + mid);
            String lcpLeft = longestCommonPrefix(strs, l, mid);
            System.out.println("right :" + (l) + " " + (mid));

            String lcpRight = longestCommonPrefix(strs, mid + 1, r);
            return commonPrefix(lcpLeft, lcpRight);
        }
    }

    String commonPrefix(String left, String right) {
        int min = Math.min(left.length(), right.length());
        for (int i = 0; i < min; i++) {
            if (left.charAt(i) != right.charAt(i))
                return left.substring(0, i);
        }
        System.out.println("substring :" + left.substring(0, min));
        return left.substring(0, min);
    }

    public int lengthOfLongestSubstring(String s) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            int c = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.substring(i, j).indexOf(s.charAt(j)) == -1) {
                    arr.add(++c);
                } else break;
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > max)
                max = arr.get(i);
        }
        return max;
    }


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length + nums2.length];
        int k = 0;
        boolean even_flag = false;

        int median = (int) Math.floor(((nums1.length + nums2.length) / 2.0));

        if ((nums1.length + nums2.length) % 2 == 0) {
            even_flag = true;
            System.out.println(even_flag);
        }
        System.out.println("median is" + median);

        for (int i = 0, j = 0; i < (nums1.length + nums2.length); ) {
            if (i == nums1.length && j == nums2.length) {
                System.out.println("done");
                break;
            }
            if (i == nums1.length) {
                nums3[k++] = nums2[j++];
            } else if (j == nums2.length) {
                nums3[k++] = nums1[i++];

            } else {
                //System.out.println("i is : "+i+" j is :"+j);
                if (nums1[i] < nums2[j]) {
                    nums3[k++] = nums1[i++];
                    System.out.println("nums1: " + nums3[k]);


                } else if (nums1[i] > nums2[j]) {
                    nums3[k++] = nums2[j++];

                } else if (nums1[i] == nums2[j]) {
                    nums3[k++] = nums1[i++];
                    if (even_flag && k - 1 == median) {
                        System.out.println("median is :" + median + " k is : " + k + " " + even_flag);
                        return (nums3[k - 1] + nums3[k - 2]) / 2.0;

                    } else if (!even_flag && k - 1 == median) {
                        System.out.println("median is :" + median + " k is : " + k + " " + even_flag + " " + nums3[k - 1]);

                        return nums3[k - 1];
                    }
                    nums3[k++] = nums2[j++];

                }
            }

            if (even_flag && k - 1 == median) {
                System.out.println("median is :" + median + " k is : " + k + " " + even_flag);
                return (nums3[k - 1] + nums3[k - 2]) / 2.0;

            } else if (!even_flag && k - 1 == median) {
                System.out.println("median is :" + median + " k is : " + k + " " + even_flag + " " + nums3[k - 1]);

                return nums3[k - 1];
            }

        }
        return 0.1;
    }

    public String longestPalindrome(String s) {
        ArrayList<String> palindrome = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < s.length(); ) {
            for (j = s.length() - 1; j > i; ) {
                if (s.charAt(i) == s.charAt(j)) {

                    palindrome.add(checkPalindrome(s.substring(i, j + 1)));

                    i++;
                    j--;
                    continue;
                }
                j--;
            }
            i++;

        }
        return palindrome.get(0);//find longest string annd return that else return ""
    }

    public String checkPalindrome(String s) {
        int count = 0;
        String palindrome = "";
        String end = "";
        ArrayList<Integer> inorder = new ArrayList<>();


        for (int i = 0, j = s.length() - 1; i < (int) Math.ceil((s.length() / 2.0)); i++, j--) {

            if (s.charAt(i) == s.charAt(j)) {
                end += s.charAt(i);
                palindrome += s.charAt(i);
                count++;
            }
        }
        System.out.println(count);
        System.out.println((int) Math.ceil((s.length() / 2.0)));
        if (count == (int) Math.ceil((s.length() / 2.0))) {
            return palindrome;
        }
        return "";
    }

    public int[] threeSum(int[] arr, int sum) {
        Map<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int target = sum - arr[i];
            for (int j = 1; j < arr.length; j++) {
                int new_target = target - arr[j];
                if (h.containsKey(new_target) && h.get(new_target) != j)
                    return new int[]{arr[i], arr[j], new_target};
                else
                    h.put(arr[i], i);
            }
        }
        return new int[]{0, 0};
    }

    public String longestPalindrome1(String s) {
        int dp[][] = new int[s.length()][s.length()];
        ArrayList<String> p = new ArrayList<String>();
        if (s.length() == 0) return "";
        if (s.length() == 1) return s;
        if (s.length() == 2 && (s.charAt(0) == s.charAt(1)))
            return s;
        if (s.length() == 2 && (s.charAt(0) != s.charAt(1)))
            return "";
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = 1;
            p.add(0, s.substring(i, i + 1));

            if (i < s.length() - 1) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    p.add(0, s.substring(i, i + 2));
                    dp[i][i + 1] = 1;
                } else
                    dp[i][i + 1] = 0;
            }
        }
        int k = 0;


        for (int i = 2; i < s.length(); i++) {
            for (int j = 0; j < s.length() - i; j++) {
                k = i + j;

                if (s.charAt(j) == s.charAt(k) && dp[j + 1][k - 1] == 1) {
                    dp[j][k] = 1;

                    System.out.println(s.substring(j, k + 1));

                    p.add(i, s.substring(j, k + 1));
                }
            }
        }
        String lps = "";
        int max = 0;
        // System.out.println(lps.substring(0,2));

        for (int j = 0; j < p.size(); j++) {
            if (p.get(j).length() > max) {
                max = p.get(j).length();
                lps = p.get(j);
            }
        }
        return lps;


    }

    public int numDecodings(String s) {
        Map<String, Character> encode = new HashMap<>();
        char c = 'A';
        for (int i = 1; i <= 26; i++) {
            encode.put(Integer.toString(i), c++);
        }
        if (Integer.parseInt(s) <= 0) return 0;
        if (s.length() == 1 && Integer.parseInt(s) > 0) return 1;

        int ways = 1;
        if (s.length() == 2 &&
                !encode.containsKey(s) && s.charAt(0) == '0') {
            return 0;
        }

        if (s.length() == 2 && Integer.parseInt(s) % 10 != 0) {
            if (encode.containsKey(s)) {
                return ways + 1;
            } else return ways;
        }

        for (int i = 1; i < s.length(); i++) {
            String str = s.substring(i - 1, i + 1);
//            System.out.println(str);
            if (encode.containsKey(str) &&
                    Integer.parseInt(str) % 10 != 0) {
                ways++;
            }

        }
        return ways;
    }

    //    public int LIS(int[] arr){
//        if(arr.length == 0) {
//            return 0;
//        }
//        int longestLength = 1;
//        int[] ans = new int[arr.length];
//        for(int i=0; i < arr.length; i++){
//            ans[i] = 1;
//        }
//        for(int i = 1; i < n; i++){
//            for(int j = 0; j < i; j++) {
//
//                if (arr[i] > arr[j])
//                    ans[i] = Math.max(ans[i], ans[j] + 1);
//
//            }
//            longestLength = Math.max(ans[i], longestLength);
//        }
//        return longestLength;
//    }
    HashMap<Integer, Integer> mincost = new HashMap<>();

    public int frogjump(int[] cost, int N) {

        if (N == 0)
            return 0;
        else if (N == 1)
            return Math.abs(cost[1] - cost[0]);
        else if (mincost.containsKey(N)) return mincost.get(N);

        mincost.put(N, Math.min((frogjump(cost, N - 1) + Math.abs(cost[N] - cost[N - 1])), (frogjump(cost, N - 2) + Math.abs(cost[N] - cost[N - 2]))));

        return mincost.get(N);
    }


    public int coinChange(int[] coins, int sum) {
        if (sum <= 0) return 0;
        if (mincost.containsKey(sum)) return mincost.get(sum);
        int solutionForSum = Integer.MAX_VALUE;

        for (int i = 0; i < coins.length; i++) {
            solutionForSum = Math.min(solutionForSum, coinChange(coins, sum - coins[i]) + 1);
        }
        mincost.put(sum, solutionForSum);


        return solutionForSum;
    }

    public int wines_top_down(int[] p, int start, int end, int year) {
        int max_price = Integer.MIN_VALUE;
        if (start > end)
            return 0;

        max_price = Math.max(wines_top_down(p, start + 1, end, year + 1) + p[start] * year, wines_top_down(p, start, end - 1, year + 1) + p[end] * year);
        return max_price;
    }


    public int frogJump(int[] cost, int n, int k) {
        int minCost = Integer.MAX_VALUE;
        if (n == 0)
            return 0;

        for (int i = 1; i <= k; i++) {
            if(n-i >= 0)
                minCost = Math.min(minCost, Math.abs(cost[n] - cost[n - i]) + frogJump(cost, n - i, k));
        }
        return minCost;
    }

    public int vacation_solution(int N, int[][] score) {
        return Math.max(vacation(N - 1, score, 0), Math.max(vacation(N - 1, score, 1), vacation(N - 1, score, 2)));
    }

    public int vacation(int i, int[][] score, int activity_index) {

//check the base condition.. array's are zero indexed...
        if (i < 0) return 0;

        int max_happiness = Integer.MIN_VALUE;

        for (int index = 0; index < 3; index++) {
            if (index != activity_index)
                //this condition is not correct? how is ur tree able to give the right answer? there is some problem in ur dry running ur tree as well.....
                max_happiness = Math.max(max_happiness, score[i][index] + vacation(i - 1, score, index));


        }
        return max_happiness;

    }

    private static HashMap<Point, Integer> cache = new HashMap<Point, Integer>();

    public int no_of_paths(String[][] grid, int h, int w) {
        if (h < 0 || w < 0) return 0;
        if (grid[h][w].equals("#")) return 0;
        if (h == 0 && w == 0) return 1;
        Point block = new Point(h, w);
        if (cache.containsKey(block)) return cache.get(block);

        int solution = no_of_paths(grid, h - 1, w) + no_of_paths(grid, h, w - 1);
        cache.put(new Point(h, w), solution);
        return solution;

    }
     public int x_score = 0; public int y_score = 0;
    public int deque(int[] scores, int start, int end, int turn) {
        if (start > end) return 0;
        Point block = new Point(start, end);
        if (cache.containsKey(block)) return cache.get(block);

        if (turn % 2 == 0) {

            x_score += Math.max(deque(scores, start+1, end, turn+1)+scores[start],deque(scores, start, end-1, turn+1)+scores[end]) ;

            cache.put(block, x_score);
        }
        else {
            y_score += Math.max(deque(scores, start+1, end, turn+1)+scores[start],deque(scores, start, end-1, turn+1)+scores[end]) ;

            cache.put(block, y_score);

        }

        return x_score - y_score;

    }
    public int knapsack(int[] value, int[] weights, int W){
        //maximize the value while keeping the weight <= W.
        //base case = no items left, weight > W
        if(value.length == 0) return  0;
        int val = Integer.MIN_VALUE; //why do we need to include this in max statement if we declare it here as min or max value!
        for(int i = 0 ; i < value.length; i++){
            if(weights[i] <= W) {
                 val =  Math.max(val, Math.max(value[i] + knapsack(Arrays.copyOfRange(value, i + 1, value.length), Arrays.copyOfRange(weights, i + 1, weights.length), W - weights[i])
                , knapsack(Arrays.copyOfRange(value, i + 1, value.length), Arrays.copyOfRange(weights, i + 1, weights.length ), W)));

            }else{
                return knapsack(Arrays.copyOfRange(value, i + 1, value.length), Arrays.copyOfRange(weights, i + 1, value.length ), W);
            }

        }
        return val;


    }
}




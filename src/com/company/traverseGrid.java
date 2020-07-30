package com.company;

import java.awt.*;
import java.util.*;

public class traverseGrid {

        public int coverPoints(int[] A, int[] B) {
            int steps = 0;
            int len = A.length;
            HashMap<Point, ArrayList<Point>> map = new HashMap<>();
            ArrayList<Point> grid = new ArrayList<>();
            for(int i= 0, j = 0; i < len; i++,j++){
                Point p = new Point(A[i], B[i]);


                if(map.containsKey(p) == false){
                    System.out.println("not contains");
                    map.put(p, getNeighbors(p, len));
                    System.out.println(map);

                }
                if(map.containsKey(p) == true){
                    System.out.println("contains");
                    if(i < len-1) {
                        if (map.get(p).contains(new Point(A[i + 1], B[i + 1]))) {
                            steps = steps + 1;
                        }
                    }
                }

            }
            return steps;
        }
        public ArrayList<Point> getNeighbors(Point p, int len){
            System.out.println("point is "+p.toString());
            ArrayList<Point> neighbors = new ArrayList<>();
            for(int i = p.x-1; i <= p.x+1; i++){
                for(int j = p.y-1; j <= p.y+1; j++) {
                    Point np = new Point(i, j);
                    if ((i >= 0) && (i <= len) && (j >= 0) && (j <= len) && !np.equals(p)) {
                        //System.out.println(np);
                        neighbors.add(new Point(i, j));
                    }
                }
            }
            return neighbors;
        }
    }



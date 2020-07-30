//package com.company;
//
//
//public class LinkedList {
//    Node head;
//    public class Node{
//        int data;
//        Node next;
//        Node(int d){
//         data = d;
//        }
//    }
//    public  LinkedList insert(LinkedList list, int d){
//        Node n = new Node(d);
//        n.next = null;
//        if(head == null){
//            list.head = n;
//        }
//        else{
//            Node last = list.head;
//            while (last.next != null){
//                last = last.next;
//            }
//            last.next = n;
//
//        }
//       return list;
//
//    }
//    public  LinkedList delete(LinkedList list, int d){
//        if(list.head.data == d){
//            list.head =  null;
//        } //only element
//
//        while (list.head.next != null){
//            if(list.head.next.data == d){
//               list.head.next = list.head.next.next;
//            }
//                                    //last element
//
//        }
//
//
//    }
//    public  void shuffle(){
//
//    }
//}

package com.DataStructures_And_Algorithms;

class Node{
    int data;
    Node next;

public Node(int data){
    this.data = data;
}
public Node(int data, Node next){
    this.data = data;
    this.next = next;
}
}
public class LinkedList {
    Node head;

    public Node insert(int data){
     Node p = head;
     if(head == null || head.data > data){
         head = new Node(data,head);
         return head;
     }
     while (p.next != null){
         if(p.next.data > data)
             break;
             p = p.next;
     }
     p.next = new Node(data, p.next);

     return head;
    }

    public Node concat2(Node node1, Node node2) {
        Node tempNode1 = node1;
        Node tempNode2 = node2;
        while (tempNode1 != null && tempNode2 != null){
            if (tempNode1.next == null){
                tempNode1 = new Node(tempNode2.data);
                tempNode1 = tempNode1.next;
                tempNode2 = tempNode2.next;
                if (tempNode1 == null) break;
            }
            tempNode1 = tempNode1.next;
        }
        return tempNode1;
    }

    public Node delete(int data){
        Node p = head;
        if (head.data == data){
            head= head.next;
            return head;
        }
        while (p.next !=null){
            if (p.next.data == data){
                p.next = p.next.next;
                return head;
            }
            p = p.next;
        }
        return head;
    }

    public Node concate(Node node1, Node node2){
        Node newList = new Node(node1.data); // newList holds value 3
        Node p = newList; // p Node is refers to newList
        Node i = node1; // for iteration purpose
        i = i.next;
        while (i != null){
            p.next = new Node(i.data);
            i = i.next;
            p = p.next;
        }
        Node j = node2;
        while (j != null){
            p.next = new Node(j.data);
            p = p.next;
            j = j.next;
        }
        return newList;
    }

    public void swap(Node list, int firstElement, int secondElement) {
        // firstElement = 7 and secondElement = 11
        Node tempNode = list;
        while (tempNode != null){
            if (tempNode.data == firstElement){
                tempNode.data = secondElement;
                tempNode = tempNode.next;
            }
            if (tempNode.data == secondElement){
                tempNode.data = firstElement;
                tempNode = tempNode.next;

                if (tempNode == null) break;
            }
            tempNode = tempNode.next;
        }

        // void swap(Node list, int i, int j):
// swap elements at ith and jth positions.

// head list , i value will be j and j value will be i
        // it means if we pass i = 3 and j = 7 then
        // j = 7 and i will be 3

    }
    public void print(){
        for(Node p = head; p != null; p = p.next){
            System.out.println(p.data);
        }
    }

    public int sum(Node list){
      int sum = 0;
        for(Node newNode = head; newNode != null; newNode = newNode.next){
            sum+=newNode.data;
        }
        return sum;
    }

    public Node copy(Node start){
        Node i = start;
        Node newList = new Node(start.data); // 3 value in newList
        Node p = newList; // p is also pointing to the newList
        i = i.next; // i Node has 5 value now
        while (i != null) {
            p.next = new Node(i.data);
            i = i.next;
            p = p.next;
        }
        return newList;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(7);
        linkedList.insert(9);
        linkedList.insert(8);
        linkedList.insert(3);

        LinkedList linkedList1 = new LinkedList();
        linkedList1.insert(1);
        linkedList1.insert(2);
        linkedList1.insert(3);


//        System.out.println("Before Swapping");
//        linkedList.print();
//        System.out.println("After Swapping");
//        linkedList.swap(linkedList.head,7,12);
//        linkedList.print();




    }
}

package com.bridgelabz;

public class Queue<K> {
    LinkedList<K> linkedList;
    Queue(){
        linkedList = new LinkedList<>();
    }

    public void enque(K key) {
        linkedList.add(key);
    }

    public void print(){
        linkedList.print();
    }

    public void pop() {
        System.out.println("\nPopped Element is : "+linkedList.head.key);
        linkedList.pop();
    }

}
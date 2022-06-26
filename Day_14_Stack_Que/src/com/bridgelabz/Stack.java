package com.bridgelabz;

public class Stack<K> {
    LinkedList<K> list;
    Stack(){
        list = new LinkedList<>();
    }

    public void push(K key){
        list.push(key);
    }
    public void print() {
        list.print();
    }


}
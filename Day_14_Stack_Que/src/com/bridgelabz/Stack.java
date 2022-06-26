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

    public void peek(){
        System.out.println("Popped Element : "+list.head.key);
    }

    public void pop(){
        list.pop();
    }


    public void popPeekTillEmpty() {
        while(list.head!=null) {
            peek();
            pop();
            print();
            System.out.print("\n");
        }
        System.out.println("Stack is now Empty");
    }
}
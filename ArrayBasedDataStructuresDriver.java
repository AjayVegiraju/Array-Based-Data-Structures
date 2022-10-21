package com.company;

public class ArrayBasedDataStructuresDriver {

    public static void main(String[] args) {
        // write your code here
        //       stackTests();
        queueTests();
//       arrayListTests();
    }

    private static void arrayListTests() {
//todo: make more tests here
        ArrayList a = new ArrayList();
        a.insert('B', 0);
        a.insert('a', 0);
        a.insert('t', 1);
        a.insert('w', 5);
        ArrayList b = new ArrayList();
        b.insert('B', 0);
        b.insert('a', 0);
        b.insert('t', 1);
        b.insert('w', 5);

        System.out.println(a.equals(b));
        System.out.println(b.toString());
        while (a.isEmpty() == false) {
            System.out.println(a.remove(0));
        }
    }

    private static void queueTests() {
//todo: make more tests here
        Queue a = new Queue();
        a.enqueue('B');
        a.enqueue('a');
        a.enqueue('t');
        a.dequeue();

        Queue b = new Queue();
        b.enqueue('B');
        b.enqueue('a');
        b.enqueue('t');
        b.dequeue();
        System.out.println(a.equals(b));
        while (a.isEmpty() == false) {
            System.out.println(a.dequeue());
        }
    }

    private static void stackTests() {
//todo: make more tests here
        Stack a = new Stack();
        a.push('B');
        a.push('a');
        a.push('t');

        Stack b = new Stack();
        b.push('B');
        b.push('a');
        b.push('t');

        System.out.println(a.equals(b));

        System.out.println(b.toString());
        while (a.isEmpty() == false) {
            System.out.println(a.pop());
        }

    }
}
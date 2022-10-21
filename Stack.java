package com.company;

public class Stack {
    Object[] arr;

    public Stack(){
        arr = new Object[0];
    }

    /**
     *  Method takes in an object and inserts it at the
     *  top of the stack
     *
     *  Pre-Condition -
     *  Parameter is of Object type
     * @param a - Object Type
     */
    public void push(Object a){
        Object[] tempArr = new Object[arr.length+1];
        tempArr[tempArr.length-1]=a;
        for (int i = 0; i < arr.length; i++) {
            tempArr[i]=arr[i];
        }
        arr=tempArr;
    }

    /**
     *  Method takes the object at the top of the stack out
     *  of the stack
     *
     *  Pre-Condition-
     *  stack has to contain something
     * @return- it returns the object being taken out
     */
    public Object pop(){
        Object temp = arr[arr.length-1];
        Object[] tempArr = new Object[arr.length-1];

        for (int i = 0; i < tempArr.length; i++) {
            tempArr[i]=arr[i];
        }
        arr=tempArr;

        return temp;
    }

    /**
     *  Method to check is the Stack is empty
     * @return - if stack is empty then it returns true
     *           if it is not it returns false
     */
    public boolean isEmpty(){
        if(arr.length<=0){
            return true;
        }
        return false;
    }

    /**
     * checks and returns the number of elements in a stack
     *
     * pre-condition- can only be used for stacks
     * @return - an integer that represents the number of elements in
     *           the stack
     */
    public int size(){
        return arr.length;
    }

    /**
     * method to give a string representation of the stack
     * @return- a string that displays all elements of the stack
     */
    public String toString(){
        String ArrayString="";
        for(int i =0; i<arr.length;i++){
            ArrayString=ArrayString+arr[i]+", ";
        }
        return ArrayString;
    }

    /**
     * method to check if two stacks both have the
     * same elements in the same order
     * @param a- the stack being compared
     * @return true if they are equal and false if not
     */
    public boolean equals(Stack a ){
        if(a.size()!=this.arr.length){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=a.arr[i]){
                return false;
            }
        }

        return true;
    }

}

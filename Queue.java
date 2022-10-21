package com.company;

public class Queue {
    Object[] arr;

    public Queue() {
        arr = new Object[0];
    }

    /**
     * Method to add element to the back of the Queue
     * Pre-Condition- Only accepts Object types
     *
     * @param a- the object being added
     */
    public void enqueue(Object a) {
        Object[] tempArr = new Object[arr.length + 1];
        tempArr[tempArr.length - 1] = a;
        for (int i = 0; i < arr.length; i++) {
            tempArr[i] = arr[i];
        }
        arr = tempArr;
    }

     /**
      * Method to remove elements from the front of the Queue
      * Pre-Condition- Only accepts Object types
      *
      */
     public Object dequeue(){
        Object temp = arr[0];
        Object[] tempArr = new Object[arr.length-1];
        for (int i = 0; i < tempArr.length; i++) {
            tempArr[i]=arr[i+1];
        }
        arr=tempArr;
        return temp;
    }

    /**
     * Method to check if there are no elemets in the queue
     * @return True if queue is empty and false if it is not
     */
    public boolean isEmpty(){
        if(arr.length<=0){
            return true;
        }
        return false;
    }

    /**
     * Method to get the number of elemnts in the Queue
     * @return an Integer that represents the number of elements in
     * the queue
     */
    public int size(){
        return arr.length;
    }

    /**
     * method to give a string representation of the queue
     *
     * @return a String with all the elements of the queue
     */
    public String toString(){
        String ArrayString="";
        for(int i =0; i<arr.length;i++){
            ArrayString=ArrayString+arr[i]+", ";
        }
        return ArrayString;
    }


    /**
     * Method to check if two queues have the same elements in the same order
     * @param a- the queue being compared
     * @return- true if the Queues are equal and false if they are not
     */
    public boolean equals(Queue a ){
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

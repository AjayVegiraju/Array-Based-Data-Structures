package com.company;

public class ArrayList {
    private Object[] arr;

    public ArrayList(){
        arr=new Object[0];
    }


    public ArrayList(Object[]arr){
        this.arr=arr;
    }

    /**
     * method to insert an object at an index and shift all following
     * elements to the right
     * @param a- the object being inserted
     * @param index - the location where the Object needs to be
     *              stored
     */
    public void insert(Object a, int index){

        Object temp[];
        if(index<0){
            System.out.println("Invalid Index");
            return;
        }
        if(index<=arr.length){
            temp= new Object[arr.length+1];
            for(int i = temp.length-1;i>=0;i--){
                if(i!=index&&i>index){
                    temp[i]=arr[i-1];
                }else if(i==index){
                    temp[index]=a;
                }else if(i<index){
                    temp[i]=arr[i];
                }
            }
            arr=temp;
        }else{
            temp= new Object[index+1];
            for (int i = 0; i < arr.length; i++) {
                temp[i]=arr[i];
            }
            temp[index]=a;
            arr=temp;
        }

    }

    /**
     * method to remove an Object at a specified index and shift
     * the remaining elements to the left
     * @param index
     * @return
     */
    public Object remove(int index){
        Object[] temp = new Object[arr.length-1];
        Object tempIndex = arr[index];
        for (int i =0; i <arr.length-1; i++) {
            if(i<index){
                temp[i]=arr[i];
            }else if(i>=index){
                temp[i]=arr[i+1];
            }
        }
        arr=temp;
        return tempIndex;
    }

    /**
     * checks and returns the number of elements in an ArrayList
     *
     * pre-condition- can only be used for ArrayList
     * @return - an integer that represents the number of elements in
     *           the ArrayList
     */
    public int size(){
        return arr.length;
    }
    /**
     *  Method to check is the ArrayList is empty
     * @return - if stack is empty then it returns true
     *           if it is not it returns false
     */
    public boolean isEmpty(){
        if(arr==null){
            return true;
        }
        return false;
    }

    /**
     * Method to get the value at a certain index
     *
     * pre-condition- has to be a valid index
     * @param index
     * @return the Object at specified index
     */
    public Object get(int index){
        return arr[index];
    }

    /**
     * method to check if two ArrayLists both have the
     * same elements in the same order
     * @param a- the ArrayLists being compared
     * @return true if they are equal and false if not
     */
    public boolean equals(ArrayList a){
        boolean flag = false;
        if(a.size()!=this.arr.length){
            return false;
        }else{
            for (int i = 0; i < arr.length; i++) {
                if(a.get(i)==this.arr[i]){
                    flag=true;
                }
            }
        }
        return flag;
    }
    /**
     * method to give a string representation of the Arraylist
     * @return- a string that displays all elements of the ArrayList
     */
    public String toString(){
        String ArrayString="";
        for(int i =0; i<arr.length;i++){
            ArrayString=ArrayString+arr[i]+", ";
        }
        return ArrayString;
    }

}
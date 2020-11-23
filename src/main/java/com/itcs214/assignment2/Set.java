package com.itcs214.assignment2;
import java.util.*;
public class Set {
    
    /*(A)Write a class called Set to represent a set as an ArrayList and implement various set operations by using 
    methods of class ArrayList. Assume that the elements of the set are integers.
    This class will have the following instance variables: (a) an ArrayList object called list of type Integer.
                                                           (b) length: the actual number of elements in the list.
    */
    private ArrayList<Integer> list;
    private int length;
    private int capacity;
    
    /*(1)Constructor without any parameter (default constructor), which uses a default value of 10 as capacity, creates 
    ArrayList object list and initializes length to 0.*/
    public Set(){
        capacity = 10;
        list = new ArrayList<Integer>(capacity);
        length = 0;
    }
    
    /*(2)Constructor with parameter cap for capacity of the list. Create ArrayList object list of capacity equal to 
    parameter cap and initialize length to 0.*/
    public Set(int cap){
        capacity = cap;
        list = new ArrayList<Integer>(capacity);
        length = 0;
    }
    
    /*(3)Instance method getLength, that returns length.*/
    public int getLength() {
        return length;
    }
    
    /*(4)Instance method isEmpty to determine whether the set is empty or not.*/
    public boolean isEmpty(){
        if(getLength() == 0){
            return true;
        }
        return false;
    }
    
    /*(5)Instance method addElement that accepts a parameter element of type int. It will insert the element in the list 
    at the end and also increment length by one.*/
    public void addElement(int newElement){
        list.add(newElement);
        length++;
    }
    
    /*(6)Instance method isMember that accepts a parameter element of type int. If element exists in the list, it will 
    return true, else it will return false.*/
    public boolean isMember(int element){
        return list.contains(element);
    }
    
    /*(7)Instance method subSet that accepts a parameter aSet of type Set. If aSet is a subset of “this object”, it will 
    return true, else it will return false.
    Ex: Let A and B be two sets;
    A = {7, 4, 20, 15, 12}, B = {12, 15}. As all elements of B are contained in A, therefore, B is a subset of A.*/
    public int getElement(int index)
    {
        return list.get(index);
    }
    public boolean subSet(Set aSet){
        for(int i=0 ; i<aSet.getLength() ; i++){
            if(this.isMember(aSet.getElement(i)) == false){
                return false;
            }
        }
        return true;
    }
    
    /*(8)Instance method isEqual that accepts a parameter aSet of type Set.  The method will return true, if aSet is equal 
    to “this object”, else it will return false. Two sets are equal, if they contain the same elements in any order.
    Ex: Let A and B be two sets;
    A = {7, 4, 20, 15, 12}, B = {4, 7, 12, 15, 20}. 
    As sets A and B contain same elements, but in different order, therefore, they are equal.*/
    public boolean isEqual(Set aSet){
        if(this.length != aSet.getLength()){
            return false;
        }
        if(this.subSet(aSet) && aSet.subSet(this)){
            return true;
        }
        return false;
    }
    
    /*(9)Instance method union having a parameter aSet of type Set. The method finds the union of aSet with “this object” 
    and returns the result as an object of type Set. 
    Ex: Let A = {10, 4, 20, 15, 12, 18}, B = {8, 10, 25, 15, 20},
    C = A U B = {10, 4, 20, 15, 12, 18, 8, 25}*/
    public Set union(Set aSet){
        Set C = new Set();
        for(int i=0 ; i<this.length ; i++){
            C.addElement(this.getElement(i));
        }
        for(int i=0 ; i<getLength() ; i++){
            if(!C.isMember(aSet.getElement(i))){
                C.addElement(aSet.getElement(i));
            }
        }
        return C;
    }
    
    /*(10)Instance method intersection having a parameter aSet of type Set. The method finds the intersection of aSet 
    with “this object” and returns the result as an object of type Set. 
    Ex: Let A = {10, 4, 20, 15, 12, 18}, B = {8, 10, 25, 15, 20},
    C = A  B = {10, 20, 15}.*/
    public Set intersection(Set aSet){
        Set C = new Set();
        for(int i=0 ; i<this.length ; i++){
            if(this.isMember(aSet.getElement(i))){
                C.addElement(this.getElement(i));
            }
        }
        return C;
    }
    
    /*(11)Instance method called print() to print all the elements of the set.*/
    public void print(){
        System.out.print("{");
        for(int i=0 ; i<this.length ; i++){
            
            if(this.length == 1){
                System.out.print(this.getElement(i));
                break;
            }
            else{
                if(i<this.length-1){
                    System.out.print(this.getElement(i) + ",");
                }
                else{
                    System.out.print(this.getElement(i));
                }
                
            }
        }
        System.out.print("}");
    }
}

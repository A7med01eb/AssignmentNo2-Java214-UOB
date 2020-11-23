package com.itcs214.assignment2;
public class SetApplication {
    public static void main(String[] args) {
        Set s1 = new Set();
        Set s2 = new Set(5);
        Set s3 = new Set();
        Set s4 = new Set();
        //Add Elements to s1 & s2
        s1.addElement(1);
        s1.addElement(2);
        s1.addElement(3);
        s1.addElement(4);
        s1.addElement(5);
        s2.addElement(11);
        s2.addElement(2);
        s2.addElement(33);
        s2.addElement(4);
        s2.addElement(56);
        
        //Length
        System.out.println("s1 length = " + s1.getLength());
        System.out.println("s2 kength = " + s2.getLength());
        
        System.out.println("_________________________________________");
        
        //Is Empty
        System.out.println("s1 is empty? " + s1.isEmpty());
        System.out.println("s2 is empty? " + s2.isEmpty());
        System.out.println("s3 is empty? " + s3.isEmpty());
        System.out.println("s4 is empty? " + s4.isEmpty());
        
        System.out.println("_________________________________________");
        
        //Is Member
        System.out.println("Is 5 member in s1 or s1?");
        System.out.println("In s1 : " + s1.isMember(5));
        System.out.println("In s2 : " + s2.isMember(5));
        
        System.out.println("_________________________________________");
        
        //Subset
        System.out.println("Is s1 subset s2? " + s1.subSet(s2));
        System.out.println("Is s2 subset s1? " + s2.subSet(s1));
        
        System.out.println("_________________________________________");
        
        //Equal
        System.out.println("Is s1 equal to s2? " + s1.isEqual(s2));
        
        System.out.println("_________________________________________");
        
        //Union
        System.out.println("s1 union s2");
        s3 = s1.union(s2);
        s3.print();
        
        System.out.println("");
        System.out.println("_________________________________________");
        
        //Intersection
        System.out.println("s1 intersection s2");
        s4 = s1.intersection(s2);
        s4.print();
        
    }
}

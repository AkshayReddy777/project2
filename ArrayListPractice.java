package com.company;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main (String[] args) {
//        ArrayList<Boolean> x = new ArrayList<Boolean>();
//        x.add(true);
//        x.add(false);
//        System.out.println(x);
//        x.size(); System.out.println(x.size());
//        x.remove(0);
//        System.out.println(x);
//        x.clear();
//        System.out.println(x);
//        x.add( false );
//        x.add (false);
//        x.add(true);
//        System.out.println(x);
//        System.out.println(x.size());
//        Object c = x.clone();
//        System.out.println(c);
//        ArrayList<Byte> b = new ArrayList<Byte>();
//        b.add((byte) 4);
//        b.add((byte) 127);
//        b.add((byte)190);
//        b.add(0, (byte) 66);
//        System.out.println(b.size());
//        System.out.println(b);
//        System.out.println(b.indexOf(4));

//        b.clear();
//        System.out.println(b);
//
//        ArrayList<String> list  = new ArrayList<>();
//        ArrayList<String> list2  = new ArrayList<>();
//
//        list.add("b");
//        list.add(0, "a");
//        list.add(0, "c");
//        System.out.println(list);
//        System.out.println(list.get(2));
//        list2.add("stack");
//        list2.add("heap");
//        System.out.println(list2);
//        list2.addAll(list);
//        System.out.println(list2);
//        list2.add(0 , "55streetmontreal");
//        System.out.println(list2);
        ArrayList<Integer> numlist = new ArrayList<Integer>();
        numlist.add(33);
        numlist.add(15);
        numlist.add(20);
        numlist.add(34);
        numlist.add(8);
        numlist.add(12);
        System.out.println(numlist);
        for (int i : numlist) {
            System.out.println(i);
        }
        System.out.println("the size is " +numlist.size());
        numlist.remove(2);
        System.out.println(numlist);
        Object list3 = numlist.clone();
        System.out.println(list3);
        System.out.println(numlist.indexOf(15));
        System.out.println(numlist.contains(34));
        System.out.println(numlist.iterator());
        System.out.println(numlist.listIterator());
       numlist.ensureCapacity(25);
       System.out.println(numlist.size());
        System.out.println(numlist.indexOf(34));
        System.out.println(numlist.isEmpty());
        System.out.println(numlist.lastIndexOf(20));
        numlist.remove(2);
        System.out.println(numlist);
        numlist.set(0,11);
        System.out.println(numlist);
        System.out.println(numlist.subList(0,2));
        System.out.println(numlist.toArray());
        System.out.println(numlist.size());
        numlist.trimToSize();
        System.out.println(numlist);

    }
}

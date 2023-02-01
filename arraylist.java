package anu;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<Integer>();
        l.add(12); l.add(25); l.add(23);l.add(56);
        System.out.println(l);
        System.out.println(l.isEmpty());
        l.remove(0);
        System.out.println(l);

    }

}

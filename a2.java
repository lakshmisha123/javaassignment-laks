package anu;

import java.util.ArrayList;

public class a2 {
    public static void main(String[] args) {
        ArrayList<Integer> m=new ArrayList<>();
        m.add(12);m.add(13);m.add(45);
        System.out.println(m);
        m.add(46);
        System.out.println(m);
        m.remove(1);
        System.out.println(m);
    }
}

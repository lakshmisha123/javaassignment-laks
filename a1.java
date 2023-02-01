package anu;

public class a1 {
    public static void main(String[] args) {
        int [] l={1,2,3,41,55,66};
        System.out.println(l[3]);
            for (int i=0;i<=l.length-1;i++) {
                if (l[i]%2!=0)
                    System.out.println(l[i]);
            }
    }
}
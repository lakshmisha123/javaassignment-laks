package anu;

public class calci {
    public int add(int a, int b) {
        int x=a+b;
        return x;
    }

    public int sub (int a, int b) {
        int x=a-b;
        return x;

    }

    public int mu(int a, int b) {
        int x=a*b;
        return x;

    }

    public int di(int a, int b) {
        int x=a/b;
        return x;
    }

    public static void main(String[] args) {
        calci s=new calci();
        s.di(4,2);
        s.mu(4,2);
        s.add(4,5);
        s.sub(4,2);
        System.out.println(s.add(4,2));
        System.out.println(s.di(4,2));
        System.out.println(s.mu(4,2));
        System.out.println(s.sub(4,2));
    }
}

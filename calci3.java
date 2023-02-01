package anu;

class moolya {
    public static void a() {
        System.out.println("lak");

    }
}

public class calci3 {
    public void add(int a, int b) {
        System.out.println(a + b);

    }

    public void sub(int a, int b) {
        System.out.println(a - b);
    }

    public void mul(int a, int b) {
        System.out.println(a * b);
    }

    public void div(int a, int b) {
        System.out.println(a / b);
    }

    public static void main(String[] args) {
        calci3 l = new calci3();
        moolya.a();
        l.add(3,5);
        l.sub(4, 2);
        l.mul(4, 3);
        l.div(4, 2);
    }
}

package anu;
class avi{
    public static void sub(int a, int b) {
        System.out.println(a - b);
    }

    public static void mul(int a, int b) {
        System.out.println(a * b);
    }

    public static void div(int a, int b) {
        System.out.println(a / b);
    }

}
 class mm {

     public static void main(String[] args) {
         avi.sub(4, 2);
         avi.mul(4, 3);
         avi.div(4, 2);
     }
 }

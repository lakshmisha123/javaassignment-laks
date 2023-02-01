package anu;

public class return12 {
    public static int add(int a, int b) {
        int x=a+b;
        return x;

    }

    public static int add(int q,int t, int m) {
        int j=q+t+m;
        return j;

    }

    public static int sub(int w, int r) {
        int y=w-r;
        return y;
    }

    public  int sub(int p, int u, int o) {
        int f=p-u-o;
        return f;

    }


    public static void main(String[] args) {
        int n=add(5,4);
        System.out.println(n);
        int k=sub(2,3);
        System.out.println(k);
        int d=add(1,2,3);
        System.out.println(d);
        return12 obg=new return12();
        return12 obj=new return12();
        obj.sub(7,8,3);
        obg.sub(7,8,9);
        //int h=sub(7,8,9);
        System.out.println(obg.sub(7,8,9));
    }
}

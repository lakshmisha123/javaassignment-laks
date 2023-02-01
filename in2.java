package m;
class q{
    public void add(int x, int y){
        System.out.println(x+y);
    }
}
class w extends q{
    public void sub(int x, int y){
        System.out.println(x-y);
    }
}
class e extends w{
    public void mu(int x, int y){
        System.out.println(x*y);
    }
}
class r extends e{
    public void di(int x, int y){
        System.out.println(x/y);
    }
}
class t extends r{
    public void per(int x, int y){
        System.out.println(x%y);
    }
}
public class in2 {
    public static void main(String[] args){
        t j=new t();
        j.mu(2,3);
        j.per(2,3);
        j.di(2,1);
        j.add(2,3);
        j.sub(2,1);
    }
}

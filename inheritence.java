package m;
class k{
    public int j(int x, int y){
        System.out.println("sanvi");
        return x+y;

    }
}
class o extends k{
    public void set(){
        System.out.println("anu");
    }
}
public class inheritence {
    public static void main(String[] args){
        o e=new o();
        e.j(2,3);
        System.out.println(e.j(2,3));
        e.set();

    }
}

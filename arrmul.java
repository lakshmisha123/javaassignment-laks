class m{
    public int n(int ...arr){
        int w=1;
        for (int a:arr){
            w=w*a;
        }
        return w;
    }
}
public class arrmul{
    public static void main (String[] args){
        m d=new m();
        int mul=d.n(5,4,3);
        System.out.println(mul);
        }
        }
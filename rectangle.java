class ninu{
    int length, breath;

public int nanu(int l, int b){
    int length=l, breath=b;
    return length*breath;
}

}
public class rectangle {
    public static void main(String[] args) {
        ninu n=new ninu();
        System.out.println(n.nanu(5,5));
    }
}


class nanu {
    int length;

    public double square(int l) {
        int length = l;
        return length * length;
    }
}
public class areasquare2 {
    public static void main(String[] args) {
        nanu s = new nanu();
        System.out.println(s.square(5));

    }
}
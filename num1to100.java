package wc;

public class num1to100 {
    public static void main(String[] args) {
        int X=1;
        printNumbers(X);
    }
    public static void printNumbers(int y) {
        if (y<=100) {
            System.out.println(y + "");
            printNumbers(y + 1);
        }
    }
}

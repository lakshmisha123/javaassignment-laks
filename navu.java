class modern {
    String regex = "^[a-zA-Z]+$";
    String name;

    public void set(String str) {
        if (str.matches(regex)) {
            System.out.println("correct name");
            this.name = str;
        } else {
            System.out.println("wrong name");
        }}}
        public class navu {
            public static void main(String[] args) {
                modern k = new modern();
                k.set("niveonefour3");
            }
        }
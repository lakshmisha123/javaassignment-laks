class retur {
    int id;
    String str;

    public int add() {
        System.out.println("my id "+id+"name"+str);
        return id+1;


    }
        public static class returnable{
            public static void main(String[] args) {
                retur n = new retur();
                n.id=87;
                n.str="lak";
                System.out.println(n.add());
            }
        }
    }


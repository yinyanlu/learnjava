public class MaxAndMin {
    public static void main(String[] args) {
        int [] ns = {313, 89, 123, 323, 313, 15, 90, 56, 39};
        int ma = 0;
        int mi = ns[0];
        for (int n : ns){
            ma = ma < n ? n : ma;
            mi = mi > n ? n : mi;
        }
        System.out.println("Max" + ma);
        System.out.println("Min" + mi);
    }
}


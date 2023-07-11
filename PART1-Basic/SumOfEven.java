public class SumOfEven {
    public static void main(String[] args) {
        whilea();
        whileb();
        forc();
    }
    public static void whilea(){
        int i = 1;
        int sum = 0;
        while (i <= 1000 ){
            if ( i % 2 == 0 ){
                sum += i;
            }
            i++;
        }
        System.out.println("whilea result:" + sum);
    }
    public static void whileb() {
        int b = 1;
        int sumb = 0;
        do {
            if (b % 2 == 0){sumb += b;}
            b++;
        } while (b <= 1000);
        System.out.println("whileb rezult:" + sumb);
    }
    public static void forc() {
        int sumc = 0 ;
        for(int c = 1 ; c<=1000;c++){
            if(c % 2 == 0){ sumc += c; }
        }
        System.out.println("forc rlt:"+ sumc);

    }
}


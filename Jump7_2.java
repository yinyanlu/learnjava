public class Jump7_2{
    public static void main(String[] args){
        for(int i = 0; i <= 100; i++){
            if( i % 7 == 0 || i % 10 == 7 || i / 10 == 7 ){
                continue;
            }
            System.out.println("Next is" + i);
        }
    }
}


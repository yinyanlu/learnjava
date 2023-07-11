import java.util.Scanner;
public class PrintWeek {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x >= 1 && x <= 7){
            for (int i = 1; i<=7;i ++){
                if (x == i){
                    System.out.println("今天是星期"+n2w(i));
                    break;
                }
            }
        }else{
            System.out.println("Bad number.");
        }
    }
    public static String n2w(int n) {
        switch (n){
            case 1:
                return "一";
            case 2:
                return "二";
            case 3:
                return "三";
            case 4:
                return "四";
            case 5:
                return "五";
            case 6:
                return "六";
            case 7:
                return "七";
        }
        return null;
    }
}

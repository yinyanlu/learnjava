
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int
        int x1 = in.nextInt();
        int x2 = in.nextInt();
        System.out.println("输入：");
        System.out.println("\t" + x1);
        System.out.println("\t" + x2);
        System.out.println("输出");
        int y = x1 + x2;
        System.out.println("\t" + y);
    }
}


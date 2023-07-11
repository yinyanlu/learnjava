import java.util.Scanner;

public class ForSum {
    public static void main(String[] args) {
        // 创建Scanner对象，用于读取用户输入的整数
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入整数的个数
        System.out.print("请输入要相加的整数的个数：");
        int numCount = scanner.nextInt();

        // 初始化sum变量为0
        int sum = 0;

        // 循环读取用户输入的整数并求和
        for (int i = 0; i < numCount; i++) {
            System.out.print("请输入第 " + (i + 1) + " 个整数：");
            int num = scanner.nextInt();
            sum += num;
        }

        // 输出结果
        System.out.println("这 " + numCount + " 个整数的和为 " + sum);
    }
}
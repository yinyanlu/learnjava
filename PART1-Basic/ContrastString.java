import java.util.Scanner;

public class ContrastString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 获取String值
        String a = in.nextLine();
        String b = in.nextLine();
        if (a.length() != b.length()){
            System.out.println("不同");
        }else{
            for (int i=0;i< a.length();i++){
                if (a.charAt(i) != b.charAt(i)){
                    System.out.println("不同");
                    break;
                }
                if (i == a.length()-1 ){
                    System.out.println("相同");
                }
            }
            
        }
    }
}

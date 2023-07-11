import java.util.Scanner;

public class StringUtil {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        String a = in.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length();i++){
            if ( a.charAt(i) != ' '  ){
                sb.append(a.charAt(i));
            }
        }
        System.out.println("Your input: "+a);
        System.out.println("Your input: "+sb.toString());
    }
}


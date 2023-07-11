import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] inputs =  new String[10];
        for ( int i=0;i<10;i++){
            if ((inputs[i] = in.nextLine()).equals("end")){
                break;
            }
        }
        in.close();
        for ( String input : inputs){
            if (input.equals("end")) {  
                break;  
            }
            System.out.println(input);
        }
    }
}


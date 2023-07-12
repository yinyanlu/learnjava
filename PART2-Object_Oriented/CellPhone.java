public class CellPhone extends TelePhone {
    public void call(){
        System.out.println("call call call");
    }
    public void message(){
        System.out.println("message is coming");
    }
    public static void main(String[] args) {
        CellPhone cp = new CellPhone();
        cp.call();
        cp.message();
    }
}



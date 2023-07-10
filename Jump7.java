public class Jump7{
  public static void main(String[] args){
    int i = 01;
    while ( i <=100 ){
      i++;
      if ( i % 7 == 0 || i % 10 == 7 || i / 10 == 7 ){
          continue;
      }
        System.out.println("Next is: " + i );
    }
  }
}

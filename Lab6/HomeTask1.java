import java.util.Scanner;
public class HomeTask1{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Message: ");
    String msg = sc.nextLine();
    int pin = 0;
    for(int i = 1; i<msg.length(); i++){
      char c = msg.charAt(i);
      if((int) c >='0' && (int) c<='9'){
        if(msg.charAt(i-1)>='0' && msg.charAt(i-1)<='9'){
          int x = (int) c -(int) '0';
          int y = (int) msg.charAt(i-1) - (int) '0';
          int number = y*10+x;
          if(number>pin){
            pin = number;
          }
        }
      }
    }
    System.out.println("2-Digit PIN: "+pin);
  }
}

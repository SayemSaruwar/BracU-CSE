import java.util.Scanner;
public class HomeTask5{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String msg = sc.nextLine();
    int count =0;
    int space = msg.length()-1;
    while(msg.charAt(space)==' '){
      space--;
    }
    for(int i =space; i>=0; i--){
      char c = msg.charAt(i);
      if(c==' '){
        break;
      }
      else if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
        count++;
        }
      }
    System.out.println(count);
  }
}
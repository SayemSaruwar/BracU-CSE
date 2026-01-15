import java.util.Scanner;
public class HomeTask4{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Fan Message: ");
    String msg = sc.nextLine();
    msg+=" ";
    int m =0;
    int city =0;
    int close =0;
    int destroy =0;
    String word = "";
    for(int i =0; i<msg.length(); i++){
      char c = msg.charAt(i);
      if(c>='a'&&c<='z'){
        word+=c;
      }
      else if(c>='A'&&c<='Z'){
        int x = (int) c + 32;
        c = (char) x;
        word+=c;
      }
      else if(c==' '){
        if(word.equals("madrid")){
          m++;
        }
        else if(word.equals("city")){
          city++;
        }
        else if(word.equals("close")){
          close++;
        }
        else if(word.equals("destroy")){
          destroy++;
        }
        word = "";
      }
    }
    if(m>city && close>0){
      System.out.println("Madrid Supporter");
      System.out.println("Fan expect a close match");
    }
    else if(m<city && close>0){
      System.out.println("City Supporter");
      System.out.println("Fan expect a close match");
    }
    else if(m>city && destroy>0){
      System.out.println("Madrid Supporter");
      System.out.println("Fan expects a dominating victory");
    }
    else if(m<city && destroy>0){
      System.out.println("City Supporter");
      System.out.println("Fan expects a dominating victory");
    }
    else if(m==city && close==destroy){
      System.out.println("Neutral");
      System.out.println("Hard to read the fan sentiment");
    }
  }
}
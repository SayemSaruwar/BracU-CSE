import java.util.Scanner;
public class HomeTask2{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String msg = sc.nextLine();
    String vowels = "";
    String result ="";
    int count = 0;
    for(int i = msg.length()-1; i>=0; i--){
      char c = msg.charAt(i);
      if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
        vowels+=c;
      }
    }
    for(int i =0; i<msg.length(); i++){
      char c = msg.charAt(i);
      if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
        result += vowels.charAt(count);
        count++;
      }
      else{
        result+=c;
      }
    }
    System.out.println(result);
  }
}
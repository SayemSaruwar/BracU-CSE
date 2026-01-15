import java.util.Scanner;
import java.util.Arrays;
public class HomeTask3{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String[] spells = new String[1000];
    int count=0;
    for(int i = 0; i<spells.length; i++){
      String word = sc.nextLine();
      if(word.equals("stop")){
        break;
      }
      else{
        String temp ="";
        for(int j =0; j<word.length(); j++){
          char c = word.charAt(j);
          if(c>='a'&& c<='z'){
            int x = (int) c - 32;
            c = (char) x;
            temp+=c;
          }
          else if(c>='A'&&c<='Z'){
            temp+=c;
          }
        }
        spells[i] = temp;
        count++;
      }
    }
    int maxLength = 0;
    int index = 0;
    for(int i =0; i<count; i++){
      String newStr = spells[i];
      if(newStr.length()>maxLength){
        maxLength = newStr.length();
        index = i;
      }
    }
    int total = 0;
    for(int i = 0; i<spells[index].length(); i++){
      char c = spells[index].charAt(i);
      total+= (int) c;
    }
    System.out.println("Largest Spell : "+spells[index]);
    System.out.println("Power Level : "+total);
  } 
}
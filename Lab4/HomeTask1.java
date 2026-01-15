//HomeTask1
import java.util.Scanner;
public class HomeTask1{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Input starting number:");
    int num1= sc.nextInt();//input first num
    System.out.println("Input ending number:");
    int num2 = sc.nextInt(); //input second num
    int x = 0;
    for(int i = num1; i<=num2; i++){
      int total = 0;
      int temp1 = i;
      int temp2 = i;
      int digits = 0;
      while(temp2>0){
        temp2/=10;
        digits++;
      }
      
      
      while(temp1>0){
        x = temp1%10;
        temp1/=10;
        int y = 1;
        for(int j = 0; j<digits; j++){
          y*=x;
        }
        total+=y;
      }
      if(total==i){
        System.out.println(total);
      }
    }
  }
}

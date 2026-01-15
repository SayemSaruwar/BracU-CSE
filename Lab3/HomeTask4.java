import java.util.Scanner;
public class HomeTask4{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int n = sc.nextInt();
        while(n>0){
            int number = n%10;
            n/=10;
            if(n>0){
              System.out.printf("%d ,",number);
            }
            else{
              System.out.println(number);
            }
        }
    }
}
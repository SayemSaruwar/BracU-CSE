//HomeTask2
import java.util.Scanner;
public class HomeTask2{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Herb amount");
        int herb = sc.nextInt();
        System.out.println("Enter the Crystal amount");
        int crystal = sc.nextInt();
        int potion = 0;
        while(herb>=3&& crystal >=2){
            herb-=3;
            crystal-=2;
            potion++;
            System.out.println("potion "+potion+ " created");
            System.out.println("Remaining Herbs "+herb+" Remaining Crystal "+crystal);
            
        }
        if(potion%2==0){
            System.out.println("Stable Elixir");
        }
        else{
            System.out.println("Volatile Brew");
        }
    }
}

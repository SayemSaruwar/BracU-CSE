import java.util.Scanner;
public class HomeTask4{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("How many members: ");
    int member = sc.nextInt();
    for(int i = 1; i<=member; i++){
      System.out.println("Exercise for Memeber-"+i+": ");
      int exercise = sc.nextInt();
      if(exercise>3){
        System.out.println("(Can’t do more than 3 exercise)");
        exercise = 3;
      }
      double rawSum=0;
      int count = 0;
      double bonusSum =0;
      for(int j =1; j<=exercise; j++){
        System.out.println("Exercise-"+j+":");
        double calorie = sc.nextDouble();
        rawSum+=calorie;
        if(calorie>350){
          calorie += (calorie*0.5);
        }
        else if(calorie<200){
          count++;
        }
        bonusSum+=calorie;
      }
      double rawAvg = rawSum/exercise;
      if(count>=exercise){
        bonusSum-= (bonusSum*0.1);
      }
      if(rawAvg>400){
        bonusSum+=(50*exercise);
      }
      bonusSum/=exercise;
      System.out.println("Average calories earned per day for Member "+i+": "+bonusSum);
    }
  }
}
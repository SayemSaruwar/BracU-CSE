import java.util.Scanner;
import java.util.Arrays;
public class HomeTask5{
  public static void main(String [] args){
    int [] marks = {85, 90, 75, 44, 99};
    String [] names = {"Bob", "Alice", "Max", "Marry", "Rosy"};
    for(int i = 0; i<marks.length; i++){
      for(int j = 0; j<marks.length; j++){
        if(marks[j]>marks[i]){
          int temp = marks[i];
          marks[i]= marks[j];
          marks[j] =temp;
          String str = names[i];
          names[i] = names[j];
          names[j] = str;
        }
      }
    }
    System.out.println("Sorted Array");
    for(int i = 0; i<marks.length; i++){
      System.out.print(marks[i]+" ");
    }
    System.out.println();
    for(int i = 0; i<names.length; i++){
      System.out.print(names[i]+" ");
    }
  }
}
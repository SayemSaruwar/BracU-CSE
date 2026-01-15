public class HomeTask3{
  public static void print_element(int[] arr, int index){
    if(index ==arr.length-1){
      System.out.println(arr[index]);
    }
    else{
      System.out.println(arr[index]);
      print_element(arr, index+1);
    }
  }
  public static void main(String [] args){
    int[] arr = {5,6,2,1,8,7};
    int index = 2;
    print_element(arr, index);
  }
}
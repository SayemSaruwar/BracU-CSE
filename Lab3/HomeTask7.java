public class HomeTask7{
  public static void main(String [] args){
    int total = 0;
    for(int i =0; i<=600; i++){
      if(i%7==0){
        if(i%9==0){
          continue;
        }
        else{
          total += i;
        }
      }
      else if(i%9==0){
        total+=i;
      }
    }
    System.out.println(total);
  }
}
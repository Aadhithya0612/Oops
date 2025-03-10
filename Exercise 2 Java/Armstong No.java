//Armstong Number
import java.util.Scanner;
public class p5{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number");
    int n= sc.nextInt();
    int n1=n;
    int a=0;
    while(n>0){
      int t=n%10;
      a=(int) (Math.pow(t,3))+a;
      n=n/10;
    }
  if(a==n1){
    System.out.println("It's an Armstrong Number");
  }
  else{
    System.out.println("It's not an Armstrong Number");
  }
 }
}
      
    
    
    
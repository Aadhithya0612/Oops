//check if given string is palindrome or not
import java.util.Scanner;
public class p4{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    String b= "";
    System.out.println("Enter a string");
    String s= sc.nextLine();
    int n=s.length();
    String s1= s.toLowerCase();
    for(int i=n-1; i>=0; i--){
      b = b + s1.charAt(i);
    }
    if(s1.equals(b)){
      System.out.println("It's a pallindrome");
    }
    else{
      System.out.println("It's not a pallindrome");
    }
  }
}

      
    
    
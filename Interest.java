// Welcome to the intractive byteXL IDE. Start Coding here to become a pro..
import java.util.*;
class Interest{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    float p,r,t,si;
    p=sc.nextFloat();
    r=sc.nextFloat();
    t=sc.nextFloat();
    si=(p*t*r)/100;
    System.out.println("The calculated simple interest is: "+si);
    
  }
}

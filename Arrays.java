import java.util.*;
class Arrays{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n,i,j;
        System.out.print("Enter the array size: ");
        n=s.nextInt();
        int ar[]= new int[n];
        System.out.print("Enter the elements into array: ");
        for(i=0;i<n;i++){
            ar[i]=s.nextInt();
        }
        System.out.print("The array elements are: ");
        for(i=0;i<n;i++){
          //  ar[i]=s.nextInt();
          System.out.println(ar[i]);
        }

    }
}
import java.util.*;

public class RectanglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt(); 
        int n = sc.nextInt();

        System.out.println("Rectangle pattern:");

        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                if (i==0||i==m-1||j==0||j==n-1){
                  System.out.print("+");
                }
                else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
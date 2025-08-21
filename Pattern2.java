import java.util.Scanner;

public class Pattern2 {
    
    void pattern11(int n){
            int i,j;
            for(i=0;i<n;i++){
                for(j=0;j<n-i-1;j++){
                    System.out.print(" ");
                }
                for(j=0;j<2*i+1;j++){
                    System.out.print("*");
                }
                for(j=0;j<n-i-1;j++){
                    System.out.print(" ");
                }
                System.out.println();
            
            }
        
        }
    void pattern12(int n){
    int i,j;
            for(i=0;i<n;i++){
                for(j=0;j<i;j++){
                    System.out.print(" ");
                }
                for(j=0;j<(2*n-(2*i+1));j++){
                    System.out.print("*");
                }
                for(j=0;j<i;j++){
                    System.out.print(" ");
                }
                System.out.println();
            
            }
        
} 
    void pattern13(int n){
        /*int i,j;
            for(i=0;i<n;i++){
                for(j=0;j<n-i-1;j++){
                    System.out.print(" ");
                }
                for(j=0;j<2*i+1;j++){
                    System.out.print("*");
                }
                for(j=0;j<n-i-1;j++){
                    System.out.print(" ");
                }
                System.out.println();
            }
            for(i=0;i<n;i++){
                
                for(j=0;j<i;j++){
                    System.out.print(" ");
                }
                for(j=0;j<(2*n-(2*i+1));j++){
                    System.out.print("*");
                }
                for(j=0;j<i;j++){
                    System.out.print(" ");
                }
                System.out.println();
            
            }*/
            Pattern2 v = new Pattern2();
            v.pattern11(n);
            v.pattern12(n);

    }    
    void pattern14(int n){
        int st,i,j;
        for(i=0;i<(2*n-1);i++){
            st=i;
            if(i>n){
                st=2*n-i;
            }
            for(j=0;j<st;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    void pattern15(int n){
        int i,j,st=1;
        for(i=0;i<n;i++){
            st=i;
            if(i%2==0) st=1;
            else st=0;
            for(j=0;j<i;j++){
                System.out.print(st);
                st=1-st;
            }
            System.out.println();
        }
    }
    void pattern16(int n){
        int i,j,st=1;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                
                System.out.print(st+" ");
                st=st+1;
            }
            System.out.println();
        }
    } 
    int return_func(int i,int j){
        int a,b;
        a=i;
        b=j;
        return a+b;
    }
    public static void main(String args[]){
        Pattern2 p = new Pattern2();
        Scanner s =new Scanner(System.in);
        int t;
        t= s.nextInt();
        for(int i=0;i<t;i++){
            //int n;
            //n=s.nextInt();
            System.out.println(p.return_func(10,30));
        }
        //System.out.println(return_func());
        s.close();

        //Manoj explain
        //streak maintaining
               
    }
}

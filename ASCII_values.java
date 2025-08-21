import java.util.Scanner;

class ASCII_values {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char val = sc.next().charAt(0);   // read single character
        int ascii = (int) val;
        System.out.print("The ASCII value of '" + val + "' is: " + ascii);
    }
}

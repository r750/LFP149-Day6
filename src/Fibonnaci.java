import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r = 0, s = 1;
        System.out.print("Enter the number of terms: ");
        int n=sc.nextInt();   //Declare and Initialize the number of terms
        System.out.println("First " + n + " terms of fibonnaci series: ");
        //Print the fibonacci series
        for (int i = 1; i <= n; ++i) {
            System.out.print(r + " ");
            int sum = r + s;
            r = s;
            s = sum;
        }
    }
}

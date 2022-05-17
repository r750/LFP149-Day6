import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int i;
        int Num;
        int Sum = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Please Enter any Number: ");
        Num = sc.nextInt();

        for(i = 1 ; i < Num ; i++) {
            if(Num % i == 0)  {
                Sum = Sum + i;
            }
        }
        if (Sum == Num) {
            System.out.format("\n% d is a Perfect Number", Num);
        }
        else {
            System.out.format("\n% d is NOT a Perfect Number", Num);
        }
    }
}

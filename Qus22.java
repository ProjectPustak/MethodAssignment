import java.util.Scanner;

public class Qus22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        sumofdigits(num);
    }

    static void sumofdigits(int n){
        int sum = 0;
        while (n>0){
            int r = n%10;
            sum = sum+r;
            n=n/10;
        }
        System.out.println("The Sum of Digits of the Number : " +sum);
    }
}

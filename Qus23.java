import java.util.Scanner;

public class Qus23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number  = sc.nextInt();

        factors(number);
    }

    static void factors(int n){
        for (int i = 1; i <=n ; i++) {
            if (n%i==0){
                System.out.println("The Factors is: "+i);
            }
        }
    }
}

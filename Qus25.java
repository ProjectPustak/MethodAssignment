import java.util.Scanner;

public class Qus25 {
    public static void main(String[] args) {
        int ans = sum();

        System.out.println("The Sum is  = "+ans);
    }

    static int sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        int sum = 0;
        while (num!=0){
            sum=sum+num;
            System.out.println("Enter the Next Number: ");
            num = sc.nextInt();
        }
        return sum;
    }
}

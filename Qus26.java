import java.util.Scanner;

public class Qus26 {
    public static void main(String[] args) {
        int ans = maxvalue();

        System.out.println("The Maximum Number is: "+ans);
    }
    
    static int maxvalue(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        int max =0;
        while (num!=0){
            if (num>max){
                max=num;
            }

            System.out.println("Enter the Number: ");

            num = sc.nextInt();
        }
        return max;
    }
}

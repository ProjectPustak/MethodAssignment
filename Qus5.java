import java.util.Scanner;

public class Qus5 {
    public static void main(String[] args) {
        int ans = area();

        System.out.println("The Area Of a Parallelogram = "+ans);
    }

    static  int area(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Height = ");
        int h = sc.nextInt();

        System.out.println("Enter the Base: ");
        int b = sc.nextInt();


        int area = h*b;

        return area;


    }
}

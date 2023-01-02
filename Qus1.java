import java.util.Scanner;

public class Qus1 {
    public static void main(String[] args) {
        double ans = areacofcircle();

        System.out.println("The Area Of a Circle is = "+ans);
    }

    static  double areacofcircle(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");

        int r = sc.nextInt();

        double area = 3.14*(r*r);


        return area;

    }

}
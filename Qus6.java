import java.util.Scanner;

public class Qus6 {
    public static void main(String[] args) {
        int ans = area();

        System.out.println("The Area of a Rhombus: "+ans);
    }

    static int area(){
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the Diagonal: ");
        int d1 = sc.nextInt();


        System.out.println("Enter the Diagonal: ");
        int d2 = sc.nextInt();

        int area = (d1*d2)/2;

        return area;


    }
}

import java.util.Scanner;

public class Qus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Height: ");
        int h = sc.nextInt();


        System.out.println("Enter the Base: ");
        int b = sc.nextInt();

        double ans = areaofTriangle(h,b);

        System.out.println("The Area of a Triangle is = "+ans);


    }

    static double areaofTriangle(double height,double base){
        double area = (height*base)/2;

        return area;
    }

}

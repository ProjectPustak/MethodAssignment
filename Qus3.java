import java.util.Scanner;

public class Qus3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the W: ");

        int w = sc.nextInt();

        System.out.println("Enter the L: ");

        int  l = sc.nextInt();

        areaofReacangle(w,l);

    }

    static void areaofReacangle(int widght,int height){

        int area = widght*height;

        System.out.println("The Area is = "+area);
    }
}

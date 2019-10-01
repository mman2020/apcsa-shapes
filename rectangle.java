import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a length: ");
        double length = in.nextDouble();

        System.out.print("Enter a width: ");
        double width = in.nextDouble();

        double area = length * width;

        System.out.println("The area of a " + length + "-by-" + width + " rectangle is ");
        System.out.printf("%.1f", area);
        System.out.println(".");

        in.close();
    }
}

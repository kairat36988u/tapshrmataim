import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println(" Radius санын бериниз  ");

        double radius= sc.nextDouble();

        System.out.println("Area : "+Circle.area(radius));

        System.out.println("Circumference : "+Circle.circumference(radius));
    }
}

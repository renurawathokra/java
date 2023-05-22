import java.util.Scanner;

class Circle
{
    public static void main(String arr[])
    {
        float area,pi=3.14f,radius,permeter;

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter radius of circle : ");
        radius = obj.nextFloat();

        area = pi*(radius*radius);
        permeter = 2 * pi * radius;
        System.out.println("Area of circle : "+area);
        System.out.println("Permeter of circle : "+permeter);
    }
}

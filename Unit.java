import java.util.*;

class Unit  {
    public static void main(String arr[]) {
        int unit;
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter the Unit:");
        unit = ob.nextInt();

        if (unit <= 50) {
            System.out.println("free");
        } else if (unit <= 200) {
            unit = unit * 5;
            System.out.println("unit is " + unit);
        } else if (unit <= 500) {
            unit = unit * 8;
            System.out.println("unit is " + unit); 
        } else {
            unit = unit * 10;
            System.out.println("unit is " + unit);
        }

    }
}

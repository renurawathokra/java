import java.util.Scanner;

class Interst
{
	public static void main(String arr[])
	{
		float percentage,rate,time,simpleInterst;
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter princial amount : ");
		percentage = obj.nextFloat();
		
		System.out.print("Enter amount rate : ");
		rate = obj.nextFloat();
		
		System.out.print("Enter amount time : ");
		time = obj.nextFloat();
		
		simpleInterst = (percentage * rate *time)/100;
		
		System.out.print("simpleInterst : "+simpleInterst);
	}
}

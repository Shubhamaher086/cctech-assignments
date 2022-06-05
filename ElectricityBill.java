package oops;

import java.util.Scanner;

public class Electricitybill 
{
	static double CalculateBill()
	{
		System.out.println("please enter your unit consumption");
		Scanner sc=new Scanner(System.in);
		int units=sc.nextInt();
		double bill=0;

		if(units<=50)
		{
			bill=units*1;
		}

		else if(units<=100)
		{
			bill=(50*1)+(units-50)*2;
		}
		else if(units<=200)
		{
			bill=(50*1)+(50*2)+(units-100)*2.5;
		}
		else if (units>200)
		{
			bill=(50*1)+(50*2)+(100*2.5)+(units-200)*5;
		}
		return bill*(1+.05);
}

public static void main(String[] args) 
	{
		System.out.println("Total Bill Amount is:" +CalculateBill());
	}
}

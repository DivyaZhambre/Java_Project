package javaSession.OOPsConcept;

import java.util.Scanner;

class SBIbank
{
	private double bal=0;
	double amt;
	public String name=null;
	public long mob=0;
	Scanner sc = new Scanner(System.in);
	int input=0;
	protected double getBal() {
		return bal;
	}
	protected void setBal(double amt) {
		bal = bal+amt;
	}
	public void CreateAccount()
	{
		System.out.println("Enter details to open an account");
		System.out.println("Enter Name:");
		name=sc.next();
		System.out.println("Enter mobile no.:");
		mob=sc.nextLong();
		System.out.println("Account opened successfully for folling details");
		System.out.println("Name:"+name);
		System.out.println("Mobile no.:"+mob);
		
	}
	
	
}
class Customer extends SBIbank
{
	void action()
	{
		System.out.println("Are you a new Customer if yes enter 1 else 0");
		input=sc.nextInt();
		if(input==1)
		{
			CreateAccount();
		}
		else
		{
			do
			{
				System.out.println("1. Credit\n2. Debit\n3. Check Balance");
				input=sc.nextInt();
				switch(input)
				{
				case 1:System.out.println("enter amount to deposit");
						amt=sc.nextDouble();
						setBal(amt);
						System.out.println("updated balance is: "+getBal());
						break;
				case 2:System.out.println("enter amount to withdraw");
						amt=sc.nextDouble();
						setBal(-amt);
						System.out.println("Updated balance is: "+getBal());
						break;
				case 3:System.out.println("Current balance is: "+getBal());
						default: System.out.println("we don't have this option");
				}
				System.out.println("Do you want to continue if yes enter 1 else 0");
				input=sc.nextInt();
			}while(input!=0);
			System.out.println("Thank You for using...!!!");
		}
	}
}

public class OnlineBanking
{
	public static void main(String[] args)
	{
		Customer c1 = new Customer();
		c1.action();
	}
}

package bank.java;

import java.util.ArrayList;
import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name,city;
		int amount;
		int accno;
		ArrayList<Account>list=new ArrayList();
		list.add(new Account(" Lakshmi Kulkarni","Latur",4000));
		list.add(new Account(" pooja Kulkarni","pune",5000));
		list.add(new Account(" neha patil","nagpur",7000));
		list.add(new Account(" ram joshi","mumbai",9000));
		
		System.out.println("select oprations");
		System.out.println("1.Open Account");
		System.out.println("2.Deposite");
		System.out.println("3.Withdrow");
		System.out.println("4.balence enquiry");
		System.out.println("5.List All");
		System.out.println("6.Exit");
		
		int choice;
		boolean found;
		do {
		System.out.println("----enter choice here----");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("---Account open---");
			System.out.println("enter the name");
			name=sc.next();
			System.out.println("enter the city");
			city=sc.next();
			System.out.println("enter the amount");
			amount=sc.nextInt();
			Account acc=new Account(name,city,amount);
			System.out.println("---account open succesfully---");
			list.add(acc);
			break;
		case 2:
			System.out.println("---Account Deposite---");
			found=false;
			System.out.println("enter the account number");
			accno=sc.nextInt();
			for(Account ac:list)
			{
				if(accno==ac.getAccno()) {
				found=true;	
				System.out.println("customer name"+ac.getName());
				System.out.println("City"+ac.getCity());
				System.out.println("Account balence"+ac.getBal());
				
				System.out.println("enter ammount to deposite");
				amount=sc.nextInt();
				ac.setBal(ac.getBal()+amount);
				System.out.println("-----Deposite Succesfully-----");
				break;
				}
			}
			if(!found) {
				System.out.println("Invalid account no");
			}
			break;
			
		case 3:
			System.out.println("---Account withdrow---");
			found=false;
			System.out.println("enter the account number");
			accno=sc.nextInt();
			for(Account ac:list)
			{
				if(accno==ac.getAccno()) {
				found=true;	
				System.out.println("customer name"+ac.getName());
				System.out.println("City"+ac.getCity());
				System.out.println("Account balence"+ac.getBal());
				
				System.out.println("enter ammount to withdrow");
				amount=sc.nextInt();
				if(amount<=ac.getBal()) {
				ac.setBal(ac.getBal()-amount);
				System.out.println("----Withdrow Succesfully---");
				}
				else {
					System.out.println("Insuuficient balence!");
				}
				break;
				}
			}
			if(!found) {
				System.out.println("Invalid account no");
			}
			break;
			
		case 4:
			System.out.println("----Account balence enquiry---");
			found=false;
			System.out.println("enter the account number");
			accno=sc.nextInt();
			for(Account ac:list)
			{
				if(accno==ac.getAccno()) {
				found=true;	
				System.out.println("customer name"+ac.getName());
				System.out.println("City"+ac.getCity());
				System.out.println("Account balence"+ac.getBal());
				break;
				}
			}
			if(!found) {
				System.out.println("Invalid account no");
			}
			break;
		
		case 5:
			System.out.println("-----List of all Accounts---");
			for(Account ac:list)
				{
					System.out.println(ac);
				}
			break;
		case 6:
			System.out.println("---Thanks for visiting--");
			break;
			default:
				System.out.println("---invalid choice---");
				break;
		}
		}while(choice!=6);


	}

}

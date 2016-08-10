package Ex2;

import java.util.Scanner;

public class Datedisplay {
	int mon;
	int day;
	int yr;
	
	public Datedisplay(){
		mon=0;
		day=0;
		yr=0;
	}
	
	Scanner input =new Scanner(System.in);
	public int getmon()
	{
		return mon;
	}
	public int getday()
	{
		return day;
	}
	public int getyr()
	{
		return yr;
	}
	
	public void setmon()
	{
		System.out.println("Enter the month");
		mon=input.nextInt();
	}
	public void setday()
	{
		System.out.println("Enter the day");
		day=input.nextInt();
	}
	public void setyr()
	{
		System.out.println("Enter the yr");
		yr=input.nextInt();
	}
	
	public void displaydata(){
		System.out.println(getmon()+"/"+getday()+"/"+getyr());
	}
	
	public static void main(String[] args) {
		Datedisplay D= new Datedisplay();
		D.setmon();
		D.setday();
		D.setyr();
		D.displaydata();
	}

}

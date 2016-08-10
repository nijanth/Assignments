import java.util.*;
public class Empdisplay {
public String fname,lName;
double monthSal;

public Empdisplay()
{
	fname=" ";
	lName=" ";
	monthSal=0;
}
Scanner input=new Scanner(System.in);
public void setfirst()
{
	System.out.println("Enter the fname");
	fname=input.next();
}
public void setlast()
{
	System.out.println("Enter the lName");
	lName=input.next();
}
public void setsal()
{
	double d;
	System.out.println("Enter the salary");
	d=input.nextDouble();
	if(d>=0)
		monthSal=d;
}


public String getfirst()
{
	return fname;
}
public String getlast()
{
	return lName ;
}
public double getsal()
{
	return monthSal;
}




public void display()
{
	System.out.println("  The fname "+ getfirst()+" \n  The lName "+ getlast()+"\n Monthly Salary is "+getsal());
	
}
public void calc()

{
	monthSal=monthSal+0.1*monthSal;
    
}


	public static void main(String[] args) {
		Empdisplay e1 = new Empdisplay();
		Empdisplay e2 =new Empdisplay();
		e1.setfirst();e1.setlast();e1.setsal();
		e2.setfirst();e2.setlast();e2.setsal();

		e1.calc();
		e2.calc();
		e1.display();
		e2.display();
System.out.println(" the yearly salary of employee 1 is "+ e1.monthSal*12);
System.out.println(" the yearly salary of employee 2 is "+ e2.monthSal*12);
	}

}

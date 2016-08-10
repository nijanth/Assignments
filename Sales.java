package Ex4;
import java.util.Scanner;
import java.util.Arrays;
public class Sales {
	Scanner nij=new Scanner(System.in);
	int count;
	int[] sales;
	int[] counts=new int[9];
	public void set()
	{
		System.out.println("Enter the size of the array");
		count=nij.nextInt();
		sales=new int[count];
	}
	public void setData()
	{
		System.out.println("Enter sales grosses for all the employees one by one");
		for(int i=0;i<sales.length;i++)
		{
			sales[i]=nij.nextInt();
		}
	}
	public void cal()
	{
		for(int i=0;i<sales.length;i++)
		{
			sales[i]=(int) (200+(0.09)*sales[i]);
				
		}
	}
	public void group()
	{
		for(int k=0;k<counts.length;k++)
			counts[k]=0;
		for(int j=0;j<sales.length;j++)
		{
			if((sales[j]>=200) && (sales[j]<300))
				counts[0]++;
			else if((sales[j]>=300) && (sales[j]<400))
				counts[1]++;
			else if((sales[j]>=400) && (sales[j]<500))
				counts[2]++;
			else if((sales[j]>=500) && (sales[j]<600))
					counts[3]++;
			else if((sales[j]>=600) && (sales[j]<700))
					counts[4]++;
			else if((sales[j]>=700) && (sales[j]<800))
					counts[5]++;
			else if((sales[j]>=800) && (sales[j]<900))
					counts[6]++;
			else if((sales[j]>=900) && (sales[j]<1000))
					counts[7]++;
			else counts[8]++;
		}
		System.out.println("200-299 300-399 400-499 500-599 600-699 700-799 800-899 900-999 1000>");
		for(int k=0;k<counts.length;k++)
				System.out.printf("    "+counts[k]+ "   ");
		
		}
		
	
	public static void main(String[] args) {
	Sales s1=new Sales();
	s1.set();
	s1.setData();
	s1.cal();
	s1.group();

}}

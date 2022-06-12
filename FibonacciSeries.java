package myfirstjava;

public class FibonacciSeries {
	

	public static void main(String[] args)
	{
	int range = 8, firstnum = 0,secondnum = 1,sum;
	System.out.println(firstnum);
	for(int i=1;i<=range;i++)
	{
		sum = firstnum + secondnum;
		firstnum = secondnum;
		secondnum = sum;
		System.out.println(sum);
	}

}}

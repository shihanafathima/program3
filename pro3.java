package java_program;

import java.io.DataInputStream;

public class pro3 {

	public static void main(String[] args) throws Exception
	{
		int num;
		DataInputStream ds=new DataInputStream(System.in);
		System.out.println("Enter the number:");
		num=Integer.parseInt(ds.readLine());
		if(num%2==0)
		{
			System.out.println("number = even");
		}
		else
		{
			System.out.println("number = odd");
		}
	}

}

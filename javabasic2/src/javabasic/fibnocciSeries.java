package javabasic;

public class fibnocciSeries {

	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		int num3=0;
		int count=0;
		while(count<10)
		{
			System.out.println(num3);
			num3=num1+num2;
			num1=num2;
			num2=num3;
			count++;
		}
	}

}

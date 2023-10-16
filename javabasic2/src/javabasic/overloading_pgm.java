package javabasic;
// same function name is using with different arugument and return type - method overloading
class over_pgm{
	static int value=10;
	
	void function()
	{
		System.out.println("*****without argumanet *****");
	}
	void function(String value)
	{
		System.out.println("One argument "+value);
	}
	int function(int sum)
	{
		System.out.println("With int as argument "+sum);
		return value;
	}
}
public final class overloading_pgm {

	public static void main(String[] args) {

		over_pgm obj=new over_pgm();
		obj.function();
		obj.function("text");
		obj.function(20);
		System.out.println("Returned value is "+obj.value);
	}

}

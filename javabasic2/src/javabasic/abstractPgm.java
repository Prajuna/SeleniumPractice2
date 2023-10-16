package javabasic;

abstract class abs{
	//abstract method without body
	public abstract void display();
	void normal_display()
	{
		System.out.println("Normal Function");
		
	}
	 int ab_variable=10;
}

class new_class extends abs
{
	public void display()
	{
		System.out.println("Abstract class function");
	}
	}
public class abstractPgm {

	public static void main(String[] args) {
          
		new_class obj=new new_class();
		obj.normal_display();
		obj.display();
	}

}

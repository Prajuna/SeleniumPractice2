package javabasic;
//eventhough same function name is using in the parent class, we can override the parent class method by creating a child class method

class parent_class{
	void function()
	{
		System.out.println("Parent method");
		
	}
	
}
class child_class extends parent_class{
	void function()
	{
		System.out.println("Child method");

	}
}
public class overriding_eg {

	public static void main(String[] args) {

		parent_class obj=new parent_class();
		obj.function();
		parent_class obj2=new child_class();
		obj2.function();
	}

}

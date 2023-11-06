package javapms;

interface int1{
	//public, static, final
	final int ab=10;
	void ab_fn();
	
}
class int2 implements int1{
	
	public void ab_fn()
	{
		System.out.println("Interface method");
	}
	
}
public class interfacePgm {

	public static void main(String[] args) {
		int2 obj=new int2();
		obj.ab_fn();
		System.out.println(obj.ab);

	}

}

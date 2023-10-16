package javabasic;

class superclass{
      protected  String in_var="Super var";
	void fucntion() {
		System.out.println("inheritaed fucntion");
	}
	
}

public class inheritance_pgm extends superclass {
    private String var="Child var";	

	public static void main(String[] args) {
      inheritance_pgm obj=new inheritance_pgm();
      System.out.println("Super class variale "+ obj.in_var);
       obj.fucntion();
       
      
      System.out.println("normal class variable "+obj.var);

      
	}

}

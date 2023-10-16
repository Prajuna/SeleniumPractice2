package javabasic;

public class leftalignedStar {

	public static void main(String[] args) {
        for(int i=0;i<=4;i++)
        {
        	
         for(int k=0;k<=3-i;k++)
         {
        	 System.out.print(" ");
         }
         for(int j=0;j<=i;j++)
         {
        	 System.out.print("*");
         }
         System.out.println(" ");
        }
	}

}

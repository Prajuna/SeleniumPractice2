package javabasic;

public class bubbleSort {

	 static void bubblesort(int arr[]) {
		 int n=arr.length;
		 for(int i=0;i<n-1;i++)
		 {
			 for(int j=0;j<n-i-1;j++)
			 {
				 if(arr[j]>arr[j+1])
				 {
					 int temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
	
				 }
			 }
		 }
	 }
	public static void main(String[] args) {
      int arr[]= {20,15,50,45,5};
      bubblesort(arr);
      try {
    	  for(int i=0;i<arr.length;i++)
          {
        	  System.out.println(arr[i]);
          }
      }
     catch(ArrayIndexOutOfBoundsException e)
      {
    	 System.out.println("ArrayIndexOutOfBoundsException");
      }
	}

}

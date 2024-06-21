package Assignment;




public class Assig_002 {
	
	public static void main(String[] args) {
		//Comput the sum of the first 100 prime number
		
		/*
		int num =100;
		for(int i=2;i<=num;i++)
		{
			int count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println(i+" ");
			}
		}
		*/
		
		//To find out the max and min value of an array
		/*
		int a[]= {10,50,40,20,5,60,65};
		int max=a[0];
		int min=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max) 
			{
				max=a[i];
			}
		}
		
		System.out.println("max element in array is :"+max);
		System.out.println("min element in array is :"+min);
		*/
		
		
		//WAP to Compare Two String.
		
		/*
		String str = new String("java");
		String str1 = new String("java");
		System.out.println(str.equals(str1));
		
		String st1 ="java";
		String st2 ="php";
		
		System.out.println(st1==st2);
		*/
		
		//WAP to concatenate a given string to the end of another string. 
		
		/*
		String s = "I am learning java";
		s.concat("Selenium");
		
		String str = s.concat(" Selenium");
		System.out.println(str);
		*/
		
		//WAP to demonstrate try catch block.
	
		/*
		System.out.println("program started...");
		try
		{
			int a = 30;
			int b = 40;
			int c = 10;
		    int expression = (a*b)/(a-b+c);
		    
		    System.out.println("Result :" + expression);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	    
	    System.out.println("Program Ended.....");
	    */
		
		//WAP to demonstrate multiple catch blocks
		
		/*
		try{    
            int a[]=new int[10];    
            a[10]=50/0;    
           }    
           catch(ArithmeticException e)  
              {  
               System.out.println("Arithmetic Exception occurs");  
              }    
           catch(ArrayIndexOutOfBoundsException e)  
              {  
               System.out.println("ArrayIndexOutOfBounds Exception occurs");  
              }    
           catch(Exception e)  
              {  
               System.out.println("Parent Exception occurs");  
              }             
           System.out.println("rest of the code"); 
			*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

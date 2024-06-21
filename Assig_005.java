package Assignment;

import java.util.Scanner;

public class Assig_005 {

	public static void main(String[] args) {
		
		/*
		for(int i=1;i<=5;i++)
		{
		for(int j=1;j<=i;j++)
		{
		System.out.print(j);
		}
		System.out.println();
		}
		*/

		/*
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        */
		
		/*
		Scanner sc = new Scanner(System.in);
 
        //Taking rows value from the user
 
        System.out.println("How many rows you want in this pattern?");
 
        int rows = sc.nextInt();
 
        System.out.println("Here is your pattern....!!!"); 
 
        for (int i = 1; i <= rows; i++)
        {
            //Printing rows-i spaces at the beginning of each row
 
            for (int j = 1; j <= rows-i; j++)
            {
                System.out.print(" ");
            }
 
            //Printing 1 to i value at the end of each row
 
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
 
            System.out.println();
        }
        */
		
		/*
		int row, i, j, space = 1;  
		System.out.print("Enter the number of rows you want to print: ");  
		Scanner sc = new Scanner(System.in);  
		row = sc.nextInt();  
		space = row - 1;  
		for (j = 1; j<= row; j++)  
		{  
		for (i = 1; i<= space; i++)  
		{  
		System.out.print(" ");  
		}  
		space--;  
		for (i = 1; i <= 2 * j - 1; i++)  
		{  
		System.out.print("*");  
		}  
		System.out.println("");  
		}  
		space = 1;  
		for (j = 1; j<= row - 1; j++)  
		{  
		for (i = 1; i<= space; i++)  
		{  
		System.out.print(" ");  
		}  
		space++;  
		for (i = 1; i<= 2 * (row - j) - 1; i++)  
		{  
		System.out.print("*");  
		}  
		System.out.println("");  
		}  
		  
	*/
		
		

	}

}

package Day9;

import java.util.Scanner;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String str1,str2;
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter string 1 ");
           str1 = sc.nextLine();
           System.out.println("Enter string 2 ");
           str2 = sc.nextLine();
           System.out.println("Before swap: " + str1 + " " + str2);  
           str1 = str1 + str2;  
           str2 = str1.substring(0, str1.length() - str2.length());  
           str1 = str1.substring(str2.length());  
           System.out.println("After Swap : " + str1 + " " + str2);  
	}

}

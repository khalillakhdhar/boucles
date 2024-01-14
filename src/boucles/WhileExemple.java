package boucles;

import java.util.Scanner;

public class WhileExemple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("donner un entier");
int x=sc.nextInt();
System.out.println("donner un 2éme entier");
int y=sc.nextInt();		
while (x>y)
{
x=x-y;
System.out.println("x= "+x);
}
		
		
	}

}

package boucles;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=12;
		for(int i=2;i<=x;i++)
		{
			if(i%2==0)
				System.out.println("i= "+i);
		}
		ArrayList<String> cars=new ArrayList<String>();
cars.add("bmw");
cars.add("Audi");
cars.add("fiat");

for(String car : cars)
{
	System.out.println(car);
	
}
	}

}

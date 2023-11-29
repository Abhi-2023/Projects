package io.Abhishek;

import java.util.*;

public class PokedexInitiatorCreate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)){
				Pokemon p = new Pokemon();		
				BoilerPlate bp = new BoilerPlate();
				System.out.println("How many characters you want to add.");
				int n = sc.nextInt();
				for(int i = 1; i <= n; i++) {
						System.out.println("Entry no. " + i);
						System.out.println("Enter the name of the pokemon");
						String name = sc.next();
						System.out.println("Enter the type of the pokemon");
						String type = sc.next();
						System.out.println("Enter the power of the pokemon");
						int power = sc.nextInt();
						p.setName(name);
						p.setType(type);
						p.setPower(power);
						bp.InsertQueryPlate(p);
				}
		}	
		catch(Exception e){
			System.out.println(e);
		}
			
		
	}

}

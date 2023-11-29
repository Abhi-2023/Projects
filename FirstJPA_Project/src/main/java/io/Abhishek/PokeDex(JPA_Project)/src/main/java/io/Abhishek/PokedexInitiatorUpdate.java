package io.Abhishek;

import java.util.*;

public class PokedexInitiatorUpdate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BoilerPlate bp = new BoilerPlate();
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Which pokemon you want to update.");
			String poke = sc.next();
			Pokemon p1 = bp.EM.find(Pokemon.class, poke);


				if(p1!=null) {
					System.out.println("Press 1. To update name. \nPress 2. To update type. \nPress 3. To update power");
					int option = sc.nextInt();
					switch(option) {
						case 1 :{
							System.out.println("Enter the new name of the pokemon.");
							String newName = sc.next();
							p1.setName(newName);
						}
						case 2 :{
							System.out.println("Enter the new type of the pokemon.");
							String newType = sc.next();
							p1.setType(newType);
						}
						case 3 :{
							System.out.println("Enter the updated power of the pokemon");
							int power = sc.nextInt();
							p1.setPower(power);
						}
					}
			
					bp.InsertQueryPlate(p1);
				}
				else {
					System.out.println("Row does not exists.");
				}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}

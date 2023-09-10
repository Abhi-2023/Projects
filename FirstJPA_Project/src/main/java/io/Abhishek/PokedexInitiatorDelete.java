package io.Abhishek;

import java.util.*;


public class PokedexInitiatorDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)){
			BoilerPlate bp = new BoilerPlate();

			System.out.println("Enter the name of the pokemon you want to delete.");
			String delete = sc.next();
			Pokemon p1 = bp.EM.find(Pokemon.class, delete);
			if(p1 != null) {
				bp.DeleteQueryPlate(p1);
			}
			else {
				System.out.println("Row does not exists.");
			}
		}
	}
}

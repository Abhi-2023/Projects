package io.Abhishek;


public class PokedexInitatorRead {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoilerPlate bp = new BoilerPlate();
		Pokemon p1 = bp.EM.find(Pokemon.class, "Charizard");
		System.out.println(p1);
		
		
	}

}

package io.Abhishek;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BoilerPlate {
	 EntityManagerFactory EMF = Persistence.createEntityManagerFactory("Abhishek");
	EntityManager EM = EMF.createEntityManager();
	EntityTransaction ET = EM.getTransaction();
	
	public void InsertQueryPlate(Pokemon p) {
		ET.begin();
		EM.persist(p);
		ET.commit();
	}
	public void DeleteQueryPlate(Pokemon p) {
		ET.begin();
		EM.remove(p);
		ET.commit();
	}
}

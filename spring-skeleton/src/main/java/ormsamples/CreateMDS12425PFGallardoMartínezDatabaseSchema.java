/**
 * Licensee: Antonio Gallardo(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateMDS12425PFGallardoMartínezDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(basededatos.MDS12425PFGallardoMartínezPersistentManager.instance());
			basededatos.MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

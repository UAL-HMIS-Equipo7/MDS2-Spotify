/**
 * Licensee: Manuel David Montesinos Navarrete(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateAplicacióndeBúsquedayReproduccióndeMúsicaDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(basededatos.AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance());
			basededatos.AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package com.oesia.formacion.practica.architecture.persistence.daos.workorder;

import com.oesia.formacion.practica.architecture.persistence.daos.conection.*;
import com.oesia.formacion.practica.architecture.persistence.entities.workorder.Workorder;

/**
 * @author formacion
 *
 */
public class WorkorderImpl implements WorkorderDao {

	private static WorkorderImpl INSTANCE = null;

	private WorkorderImpl() {

	}

	public static WorkorderImpl getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new WorkorderImpl();
		}

		return INSTANCE;
	}

	public void saveWorkorder(Workorder work) {
		try {
			Conection con = new Conection();
			con.conect();
			String sql = "INSERT INTO workorder values (" + work.getIdWork() + "," + work.getIdVendor() + ")";
			con.setResultSet(con.getConnect().createStatement().executeQuery(sql));
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			// Conection.getInstance().close();
		}

	}

}

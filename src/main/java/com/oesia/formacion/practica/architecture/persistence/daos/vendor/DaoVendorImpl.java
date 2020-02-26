package com.oesia.formacion.practica.architecture.persistence.daos.vendor;

import com.oesia.formacion.practica.architecture.persistence.daos.conection.*;
import com.oesia.formacion.practica.architecture.persistence.entities.vendor.VendorEntity;

public class DaoVendorImpl implements DaoVendor {

	private static DaoVendorImpl INSTANCE = null;

	/**
	 * constructor
	 */
	private DaoVendorImpl() {

	}

	public static DaoVendorImpl getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new DaoVendorImpl();
		}
		return INSTANCE;
	}
<<<<<<< .mine
	
	void vendor (String msg) {
				
||||||| .r61
	/**
	 * metodo sobrescrito Vendor
	 */
	void vendor (String msg) {
				
=======

	public void addVendor(VendorEntity vend) {
		try {
			String sql = "SELECT * FROM vendor WHERE id_vendor = " + vend.getId_vendor();
			Conection con = new Conection();
			con.conect();
			con.setResultSet(con.getConnect().createStatement().executeQuery(sql));
			if (!con.getResultSet().next()) {
				sql = "INSER INTO vendor(" + vend.getId_vendor() + ")";
				con.setResultSet(con.getConnect().createStatement().executeQuery(sql));
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			// Conection.getInstance().close();
		}

>>>>>>> .r111
	}

}

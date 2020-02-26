package com.oesia.formacion.practica.architecture.domain.managers.vendor;

import com.oesia.formacion.practica.architecture.persistence.daos.vendor.DaoVendorImpl;
import com.oesia.formacion.practica.architecture.persistence.entities.vendor.VendorEntity;

public class VendorManager {
	public VendorManager() {
		
	}
	public void metodoDaoVendor(VendorEntity vend) {
		DaoVendorImpl.getInstance().addVendor(vend);
	}
}

package com.oesia.formacion.practica.architecture.persistence.entities.vendor;

/**
 * Clase para el vendedor
 */
public class VendorEntity {

	private Integer id_vendor;

	/**
	 * @param id_vendor
	 */
	public VendorEntity(Integer id_vendor) {
		super();
		this.id_vendor = id_vendor;
	}

	/**
	 * @return the id_vendor
	 */
	public final Integer getId_vendor() {
		return id_vendor;
	}

	/**
	 * @param id_vendor the id_vendor to set
	 */
	public void setId_vendor(Integer id_vendor) {
		this.id_vendor = id_vendor;
	}

	/**
	 * metodo toString()
	 */
	@Override
	public String toString() {
		return "VendorEntity [id_vendor=" + id_vendor + "]";
	}

}

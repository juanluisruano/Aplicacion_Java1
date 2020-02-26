package com.oesia.formacion.practica.architecture.persistence.entities.workorder;

public class Workorder {

	private int idWork;
	private int idVendor;

	/**
	 * @param idWork
	 * @param idVendor
	 */
	public Workorder(int idWork, int idVendor) {
		super();
		this.idWork = idWork;
		this.idVendor = idVendor;
	}

	/**
	 * @return the idWork
	 */
	public final int getIdWork() {
		return idWork;
	}

	/**
	 * @param idWork the idWork to set
	 */
	public final void setIdWork(int idWork) {
		this.idWork = idWork;
	}

	/**
	 * @return the idVendor
	 */
	public final int getIdVendor() {
		return idVendor;
	}

	/**
	 * @param idVendor the idVendor to set
	 */
	public final void setIdVendor(int idVendor) {
		this.idVendor = idVendor;
	}

	@Override
	public String toString() {
		return "idWorkorder = " + idWork + ", idVendor = " + idVendor;
	}

}

package com.oesia.formacion.practica.architecture.communications.messages.put;

public class Put {

	private String tipoMensaje;
	private int IdWork;
	private int IdVendor;
	private int IdArticle;
	private String Descrip;
	private int IdColor;
	private int IdZise;
	private int NumUnd;
	/**
	 * @param tipoMensaje
	 * @param idWork
	 * @param idVendor
	 * @param idArticle
	 * @param descrip
	 * @param idColor
	 * @param idZise
	 * @param numUnd
	 */
	public Put(String tipoMensaje, int idWork, int idVendor, int idArticle, String descrip, int idColor, int idZise,
			int numUnd) {
		super();
		this.tipoMensaje = tipoMensaje;
		IdWork = idWork;
		IdVendor = idVendor;
		IdArticle = idArticle;
		Descrip = descrip;
		IdColor = idColor;
		IdZise = idZise;
		NumUnd = numUnd;
	}
	
	public Put(String tipoMensaje, int idWork, int idVendor, int idArticle, int idColor, int idZise,
			int numUnd) {
		super();
		this.tipoMensaje = tipoMensaje;
		IdWork = idWork;
		IdVendor = idVendor;
		IdArticle = idArticle;
		IdColor = idColor;
		IdZise = idZise;
		NumUnd = numUnd;
	}
	
	/**
	 * @return the tipoMensaje
	 */
	public final String getTipoMensaje() {
		return tipoMensaje;
	}
	/**
	 * @param tipoMensaje the tipoMensaje to set
	 */
	public final void setTipoMensaje(String tipoMensaje) {
		this.tipoMensaje = tipoMensaje;
	}
	/**
	 * @return the idWork
	 */
	public final int getIdWork() {
		return IdWork;
	}
	/**
	 * @param idWork the idWork to set
	 */
	public final void setIdWork(int idWork) {
		IdWork = idWork;
	}
	/**
	 * @return the idVendor
	 */
	public final int getIdVendor() {
		return IdVendor;
	}
	/**
	 * @param idVendor the idVendor to set
	 */
	public final void setIdVendor(int idVendor) {
		IdVendor = idVendor;
	}
	/**
	 * @return the idArticle
	 */
	public final int getIdArticle() {
		return IdArticle;
	}
	/**
	 * @param idArticle the idArticle to set
	 */
	public final void setIdArticle(int idArticle) {
		IdArticle = idArticle;
	}
	/**
	 * @return the descrip
	 */
	public final String getDescrip() {
		return Descrip;
	}
	/**
	 * @param descrip the descrip to set
	 */
	public final void setDescrip(String descrip) {
		Descrip = descrip;
	}
	/**
	 * @return the idColor
	 */
	public final int getIdColor() {
		return IdColor;
	}
	/**
	 * @param idColor the idColor to set
	 */
	public final void setIdColor(int idColor) {
		IdColor = idColor;
	}
	/**
	 * @return the idZise
	 */
	public final int getIdZise() {
		return IdZise;
	}
	/**
	 * @param idZise the idZise to set
	 */
	public final void setIdZise(int idZise) {
		IdZise = idZise;
	}
	/**
	 * @return the numUnd
	 */
	public final int getNumUnd() {
		return NumUnd;
	}
	/**
	 * @param numUnd the numUnd to set
	 */
	public final void setNumUnd(int numUnd) {
		NumUnd = numUnd;
	}
	@Override
	public String toString() {
		return "Put [tipoMensaje=" + tipoMensaje + ", IdWork=" + IdWork + ", IdVendor=" + IdVendor + ", IdArticle="
				+ IdArticle + ", Descrip=" + Descrip + ", IdColor=" + IdColor + ", IdZise=" + IdZise + ", NumUnd="
				+ NumUnd + "]";
	}
	
	
	
}

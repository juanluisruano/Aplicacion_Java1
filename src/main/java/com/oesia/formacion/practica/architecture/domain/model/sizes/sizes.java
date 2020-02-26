package com.oesia.formacion.practica.architecture.domain.model.sizes;

public enum sizes {

	XXS(1),
	XS(2),
	S(3),
	M(4),
	L(5),
	XL(6),
	XXL(7);
	
	private final int id;

	/**
	 * @param id
	 */
	private sizes(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	
	
}

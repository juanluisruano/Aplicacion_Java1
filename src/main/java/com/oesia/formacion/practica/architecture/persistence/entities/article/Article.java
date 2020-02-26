package com.oesia.formacion.practica.architecture.persistence.entities.article;
/**
 * Descripcion de Articulos
 */
public class Article {
	private int id_code;
	private String description;
	private int color;
	private int size;
	private int num_stock;
	
	
	public Article(int id_code, String description, int color, int size, int num_stock) {
		super();
		this.id_code = id_code;
		this.description = description;
		this.color = color;
		this.size = size;
	}

	public Article(int id_code, int color, int size, int num_stock) {
		super();
		this.id_code = id_code;
		this.color = color;
		this.size = size;
		this.description = "";
	}

	public final int getId_code() {
		return id_code;
	}

	public final void setId_code(int id_code) {
		this.id_code = id_code;
	}

	public final String getDescription() {
		return description;
	}

	public final void setDescription(String description) {
		this.description = description;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getNum_stock() {
		return num_stock;
	}

	public void setNum_stock(int num_stock) {
		this.num_stock = num_stock;
	}

	
}

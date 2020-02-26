package com.oesia.formacion.practica.architecture.persistence.daos.article;

import com.oesia.formacion.practica.architecture.persistence.daos.conection.*;
import com.oesia.formacion.practica.architecture.persistence.entities.article.Article;

import java.sql.*;

public class DAOArticleImpl implements DAOArticle {
/**
 * 
 * @author formacion
 *
 */
	private static DAOArticleImpl INSTANCE = null;

	private DAOArticleImpl() {

	}

	public static DAOArticleImpl getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new DAOArticleImpl();
		}
		return INSTANCE;
	}

	public void addArticle(Article art) {
		try {
			String sql = "SELECT * FROM article WHERE id_article = "+art.getId_code();
			Conection con = new Conection();
			con.conect();
			ResultSet result = con.getConnect().createStatement().executeQuery(sql);
			if(!con.getResultSet().next()) {
				sql = "INSERT INTO article values ("+art.getId_code()+","+art.getDescription()+")";
				con.getConnect().createStatement().executeQuery(sql);
				sql = "INSERT INTO stock values("+art.getId_code()+","+art.getColor()+","+art.getSize()+","+art.getSize()+")";
			}else {
			sql = "SELECT id_stock FROM stock WHERE id_articulo = "+art.getId_code()+"id_color ="+art.getColor()+" id_talla = "+art.getSize();
			ResultSet r = con.getConnect().createStatement().executeQuery(sql);
			//.next();
			int id_stock = con.getResultSet().getInt(1);
			sql = "UPDATE articulo SET cuantity = cuantity+"+art.getNum_stock()+"WHERE id_stock = "+id_stock;
			con.getConnect().createStatement().executeQuery(sql);
			con.close();
			}
		} catch (Exception e) {  
			System.out.println(e);
		}
		
	}

}

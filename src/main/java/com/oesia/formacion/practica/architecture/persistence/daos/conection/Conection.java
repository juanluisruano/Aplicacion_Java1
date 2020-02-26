package com.oesia.formacion.practica.architecture.persistence.daos.conection;

import java.sql.*;

public class Conection {


	private Connection connect = null;
	private static final String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
	final private String host = "jdbc:mysql://localhost:3306/practica_alumno_g3?serverTimezone=UTC";
	final private String user = "root";
	final private String passwd = "root";

	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	public Conection() {
		
	}
	
	

	public void conect() throws ClassNotFoundException, SQLException {
		try {
			Class.forName(CONTROLADOR);
			connect = DriverManager.getConnection(host, user, passwd);
			System.out.println("Conexión OK");

		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
			e.printStackTrace();

		} catch (SQLException e) {
			System.out.println("Error en la conexión");
			e.printStackTrace();
		}

	}


	public void writeResultSet(ResultSet resultSet) throws SQLException {
		while (resultSet.next()) {
			System.out.println("|| "+resultSet.getInt(1) + " || " + resultSet.getString(2) + " || ");
		}
	}

	// You need to close the resultSet
	public void close() {
		try {
			if (connect != null) {
				System.out.println("Conexion KO");
				connect.close();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}



	/**
	 * @return the connect
	 */
	public final Connection getConnect() {
		return connect;
	}



	/**
	 * @param connect the connect to set
	 */
	public final void setConnect(Connection connect) {
		this.connect = connect;
	}



	/**
	 * @return the statement
	 */
	public final Statement getStatement() {
		return statement;
	}



	/**
	 * @param statement the statement to set
	 */
	public final void setStatement(Statement statement) {
		this.statement = statement;
	}



	/**
	 * @return the preparedStatement
	 */
	public final PreparedStatement getPreparedStatement() {
		return preparedStatement;
	}



	/**
	 * @param preparedStatement the preparedStatement to set
	 */
	public final void setPreparedStatement(PreparedStatement preparedStatement) {
		this.preparedStatement = preparedStatement;
	}



	/**
	 * @return the resultSet
	 */
	public final ResultSet getResultSet() {
		return resultSet;
	}



	/**
	 * @param resultSet the resultSet to set
	 */
	public final void setResultSet(ResultSet resultSet) {
		this.resultSet = resultSet;
	}
	
	

}
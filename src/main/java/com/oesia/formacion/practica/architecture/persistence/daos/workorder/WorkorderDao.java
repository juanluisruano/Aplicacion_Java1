package com.oesia.formacion.practica.architecture.persistence.daos.workorder;

import com.oesia.formacion.practica.architecture.persistence.entities.workorder.Workorder;

/**
 * @author formacion
 *
 */
public interface WorkorderDao {

	void saveWorkorder(Workorder work);
}

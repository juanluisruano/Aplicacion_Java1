package com.oesia.formacion.practica.architecture.domain.managers.workorder;

import com.oesia.formacion.practica.architecture.persistence.daos.workorder.WorkorderImpl;
import com.oesia.formacion.practica.architecture.persistence.entities.workorder.Workorder;

public class WorkorderManager {
	public WorkorderManager() {
		
	}

	public void metodoDaoWorkorder(Workorder work) {
		WorkorderImpl.getInstance().saveWorkorder(work);
	}
}

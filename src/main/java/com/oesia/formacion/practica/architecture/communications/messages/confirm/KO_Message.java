package com.oesia.formacion.practica.architecture.communications.messages.confirm;

public class KO_Message {
	private String KO_Message;
	private int Id_Workorder;

	public KO_Message() {

	}

	public final String getKO_Message() {
		return KO_Message;
	}

	public final void setKO_Message(String kO_Message) {
		KO_Message = kO_Message;
	}

	public final int getId_Workorder() {
		return Id_Workorder;
	}

	public final void setId_Workorder(int id_Workorder) {
		Id_Workorder = id_Workorder;
	}

	@Override
	public String toString() {
		return "KO_Message [KO_Message=" + KO_Message + ", Id_Workorder=" + Id_Workorder + "]";
	}


}

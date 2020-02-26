package com.oesia.formacion.practica.architecture.communications.messages.confirm;

public class Ok_Message {
	private String Ok_Message;
	private int Id_Workorder;
public Ok_Message() {
	
	
}
public final String getOk_Message() {
	return Ok_Message;
}
public final void setOk_Message(String ok_Message) {
	Ok_Message = ok_Message;
}
public final int getId_Workorder() {
	return Id_Workorder;
}
public final void setId_Workorder(int id_Workorder) {
	Id_Workorder = id_Workorder;
}
@Override
public String toString() {
	return "Ok_Message [Ok_Message=" + Ok_Message + ", Id_Workorder=" + Id_Workorder + "]";
}



}

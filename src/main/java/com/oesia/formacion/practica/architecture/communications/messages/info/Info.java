package com.oesia.formacion.practica.architecture.communications.messages.info;

public class Info {
	private String type_Message;
	private int id_Code;

	public Info(String type_Message, int id_Code) {
		super();
		this.id_Code = id_Code;
		this.type_Message = type_Message;
	}

	public String getType_Message() {
		return type_Message;
	}

	public void setType_Message(String type_Message) {
		this.type_Message = type_Message;
	}

	public int getId_Code() {
		return id_Code;
	}

	public void setId_Code(int id_Code) {
		this.id_Code = id_Code;
	}

	@Override
	public String toString() {
		return "Info [type_Message=" + type_Message + ", id_Code=" + id_Code + "]";
	}

	
	
	
}

package com.oesia.formacion.practica.architecture.communications;

import com.oesia.formacion.practica.architecture.communications.processors.ReciveMessage;

public class MessageManagerImpl implements MessageManager{

	@Override
	public void recive(String message) {
		ReciveMessage recive = new ReciveMessage();
		recive.ReciveMessageAndTransform(message);
		
	}

	@Override
	public void send(String message) {
		// TODO Auto-generated method stub
		
	}

}

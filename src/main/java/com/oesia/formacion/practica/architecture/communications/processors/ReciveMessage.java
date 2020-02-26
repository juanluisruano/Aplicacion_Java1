 
package com.oesia.formacion.practica.architecture.communications.processors;

import java.util.Arrays;
import java.util.List;

import com.oesia.formacion.practica.architecture.communications.messages.info.Info;
import com.oesia.formacion.practica.architecture.communications.messages.put.Put;
import com.oesia.formacion.practica.architecture.domain.managers.article.ArticleManager;
import com.oesia.formacion.practica.architecture.domain.managers.vendor.VendorManager;
import com.oesia.formacion.practica.architecture.domain.managers.workorder.WorkorderManager;
import com.oesia.formacion.practica.architecture.persistence.entities.article.Article;
import com.oesia.formacion.practica.architecture.persistence.entities.vendor.VendorEntity;
import com.oesia.formacion.practica.architecture.persistence.entities.workorder.Workorder;

public class ReciveMessage {
	String type;
	String[] messages;
//	public ReciveMessage(String message) {
//		String[] orders = message.split("\\*");
//		this.tipo = (message.split("\\|"))[0];
//		String[] orden1= orders[0].split("\\|");
//		String[] orden1nuena = Arrays.copyOfRange(orden1, 1, orden1.length);
//		orders[0] = orden1nuena.toString();
//		//messages = Arrays.copyOfRange(arg0, arg1, arg2)
//		switch(tipo) {
//		case "PUT":
//			
//			break;
//		case "INFO":
//			break;
//		}
//	}
	public void ReciveMessageAndTransform(String message) {
		String[] orderes = message.split("\\*");
		type = (orderes[0].split("\\|"))[0];
		orderes[0] = orderes[0].replaceAll("PUT\\|", "");
		orderes[0] = orderes[0].replaceAll("INFO\\|", "");
		messages = orderes;
		this.crearSegunTipo(type,messages);
	}
	
	public void crearSegunTipo(String type, String[] messages) {
		switch (type) {
		case "PUT":
			for(String oneOrder : messages) {
				Put messagePut;
				String[] componets = oneOrder.split("\\|");
				if(componets.length == 7) {
					messagePut = new Put(type, Integer.parseInt(componets[0]), Integer.parseInt(componets[1]), Integer.parseInt(componets[2]), componets[3], Integer.parseInt(componets[4]), Integer.parseInt(componets[5]), Integer.parseInt(componets[6]));
					Article article7 = new Article(messagePut.getIdArticle(), messagePut.getDescrip(), messagePut.getIdColor(), messagePut.getIdZise(), messagePut.getNumUnd());
					VendorEntity vendor7 = new VendorEntity(messagePut.getIdVendor());
					Workorder workorder7 = new Workorder(messagePut.getIdWork(), messagePut.getIdVendor());
					ArticleManager articleManager = new ArticleManager();
					VendorManager vendorManager = new VendorManager();
					WorkorderManager workorderManager = new WorkorderManager();
					articleManager.metodoDaoArticle(article7);
					vendorManager.metodoDaoVendor(vendor7);
					workorderManager.metodoDaoWorkorder(workorder7);
					
				}else if(componets.length == 6) {
					messagePut = new Put("PUT", Integer.parseInt(componets[0]), Integer.parseInt(componets[1]), Integer.parseInt(componets[2]), Integer.parseInt(componets[3]), Integer.parseInt(componets[4]), Integer.parseInt(componets[5]));
					Article article6 = new Article(messagePut.getIdArticle(), messagePut.getIdColor(), messagePut.getIdZise(), messagePut.getNumUnd());
					VendorEntity vendor6 = new VendorEntity(messagePut.getIdVendor());
					Workorder workorder6 = new Workorder(messagePut.getIdWork(), messagePut.getIdVendor());
					ArticleManager articleManager = new ArticleManager();
					VendorManager vendorManager = new VendorManager();
					WorkorderManager workorderManager = new WorkorderManager();
					articleManager.metodoDaoArticle(article6);
					vendorManager.metodoDaoVendor(vendor6);
					workorderManager.metodoDaoWorkorder(workorder6);
				}else {
					System.out.println("No se han introducio los parametros adecuados.");
				}
			}
			break;
		case "INFO":
			Info messageInfo = new Info(messages[0], Integer.parseInt(messages[1]));
			WorkorderManager workorderManager = new WorkorderManager();
			break;

		default:
			break;
		}
	}
	
	public void recivePut() {
		
	}
}

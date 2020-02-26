package com.oesia.formacion.practica.architecture.domain.managers.article;

import com.oesia.formacion.practica.architecture.persistence.daos.article.DAOArticle;
import com.oesia.formacion.practica.architecture.persistence.daos.article.DAOArticleImpl;
import com.oesia.formacion.practica.architecture.persistence.entities.article.Article;

public class ArticleManager {
	public ArticleManager() {
		
	}
	public void metodoDaoArticle(Article art) {
		DAOArticleImpl.getInstance().addArticle(art);
	}
}

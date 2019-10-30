package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.commentaireDao.CommentaireDao;
import com.example.modele.Commentaire;

@Service
public class CommentaireServiceImpl implements CommentaireService {

	@Autowired
	private CommentaireDao commentaireDao; 
	
	
	/*Enregistrer un nouveau commentaire*/
	@Override
	public Commentaire saveCommentaire(Commentaire commentaire) {
		return commentaireDao.save(commentaire);
	}

	
	/*Mise a jour d'un commentaire*/
	@Override
	public Commentaire updateCommentaire(Commentaire commentaire) {
		return commentaireDao.saveAndFlush(commentaire);
	}

	/*Lister toute les commentaires*/
	@Override
	public List<Commentaire> getAllCommentaire() {
		return commentaireDao.findAll();
	}


	/*Recuperer un commentaire */
	@Override
	public Commentaire getCommentaire(Long id) {
		return commentaireDao.getOne(id);
	}


	/*Supprimer un commentaire*/
	@Override
	public void deleteCommentaire(Long id) {
		commentaireDao.deleteById(id); 
	}

}

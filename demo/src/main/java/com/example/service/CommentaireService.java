package com.example.service;

import java.util.List;

import com.example.modele.Commentaire;

public interface CommentaireService {
	
	/*Enregistrer un nouveau commentaire*/
	Commentaire saveCommentaire(Commentaire commentaire);

	/*Mise a jour d'un commentaire*/
	Commentaire updateCommentaire(Commentaire commentaire);

	/*Lister toute les commentaires*/
	List<Commentaire> getAllCommentaire();

	/*Recuperer un commentaire */
	Commentaire getCommentaire(Long commentaireid);

	/*Supprimer un commentaire*/
	void deleteCommentaire(Long commentaireid);

}

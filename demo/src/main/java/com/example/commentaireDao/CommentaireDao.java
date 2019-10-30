package com.example.commentaireDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.modele.Commentaire;

@Repository
public interface CommentaireDao extends JpaRepository<Commentaire, Long> {

}

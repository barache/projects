package com.example.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.modele.Commentaire;
import com.example.service.CommentaireService;

@RequestMapping("commentaire")
@RestController
public class CommentaireControlleur {
	
	@Autowired
	CommentaireService commentaireService;
	
	@PostMapping("/save")
	public Commentaire save(@RequestBody Commentaire commentaire) {
		return commentaireService.saveCommentaire(commentaire);
	}
	
	@PutMapping("/update")
	public Commentaire update(@RequestBody Commentaire commentaire) {
		return commentaireService.updateCommentaire(commentaire);
	}
	
	@GetMapping("/all")
	public List<Commentaire> getAllCommentaire(){
		return commentaireService.getAllCommentaire();
	}
	
	@GetMapping("/by/{id}")
	public Commentaire getCommentaire(@PathVariable(name="id") long id) {
		return commentaireService.getCommentaire(id);
	}
	
	@DeleteMapping("/delete/{id}")	
	public void deleteCommentaire(@PathVariable(name="id") long id) {
		commentaireService.deleteCommentaire(id);
	}
	
	
	
}

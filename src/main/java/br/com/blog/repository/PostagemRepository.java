package br.com.blog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.blog.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository <Postagem, Long>{
	public List<Postagem> findAllByTituloContainingIgnoreCase(String titulo);//retorna todos Titulos na ent postagem, ignorando Maiusc e Minusc
}
